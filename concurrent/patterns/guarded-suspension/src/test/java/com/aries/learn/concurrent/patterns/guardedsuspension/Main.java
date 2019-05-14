package com.aries.learn.concurrent.patterns.guardedsuspension;

import com.aries.learn.concurrent.patterns.guardedsuspension.utils.Debug;

import java.util.concurrent.Callable;

public class Main {

    // 用于记录AlarmAgent是否连接上告警服务器
    private static volatile boolean connectedToServer = false;

    // 模式角色：GuardedSuspension.Predicate
    private static final Predicate agentConnected = new Predicate() {
        @Override
        public boolean evaluate() {
            return connectedToServer;
        }
    };

    // 模式角色：GuardedSuspension.Blocker
    private static final ConditionVarBlocker blocker = new ConditionVarBlocker();

    private static GuardedAction<Void> guardedAction = new GuardedAction<Void>(agentConnected) {
        public Void call() throws Exception {
            System.out.println("do something");
            return null;
        }
    };

    static {
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                blocker.signalAfter(new Callable<Boolean>() {
                    @Override
                    public Boolean call() {
                        connectedToServer = true;
                        Debug.info("connected to server");
                        return Boolean.TRUE;
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) throws Exception {
        blocker.callWithGuard(guardedAction);
    }
}
