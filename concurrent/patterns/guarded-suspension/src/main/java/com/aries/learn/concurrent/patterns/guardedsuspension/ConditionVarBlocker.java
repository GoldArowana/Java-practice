package com.aries.learn.concurrent.patterns.guardedsuspension;

import com.aries.learn.concurrent.patterns.guardedsuspension.utils.Debug;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionVarBlocker {
    private final Lock lock;
    private final Condition condition;

    public ConditionVarBlocker() {
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    /**
     * 在保护条件成立时执行目标动作，否则阻塞当前线程，直到保护条件成立。
     *
     * @param guardedAction 带保护条件的目标动作
     * @return
     * @throws Exception
     */
    public <V> V callWithGuard(GuardedAction<V> guardedAction) throws Exception {
        lock.lockInterruptibly();
        V result;
        try {
            final Predicate guard = guardedAction.guard;
            while (!guard.evaluate()) {
                Debug.info("waiting...");
                condition.await();
            }
            result = guardedAction.call();
            return result;
        } finally {
            lock.unlock();
        }
    }

    /**
     * 执行stateOperation所指定的操作后，决定是否唤醒本Blocker所暂挂的所有线程中的一个线程。
     *
     * @param stateOperation 更改状态的操作，其call方法的返回值为true时，该方法才会唤醒被暂挂的线程
     */
    public void signalAfter(Callable<Boolean> stateOperation) throws Exception {
        lock.lockInterruptibly();
        try {
            if (stateOperation.call()) {
                condition.signal();
            }
        } finally {
            lock.unlock();
        }
    }

}