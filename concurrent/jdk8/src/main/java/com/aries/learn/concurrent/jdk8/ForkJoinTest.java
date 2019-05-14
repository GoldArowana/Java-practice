package com.aries.learn.concurrent.jdk8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author arowana
 */
public class ForkJoinTest {
    static class ForkJoinWork extends RecursiveTask<Long> {

        private Long start;//起始值
        private Long end;//结束值
        public static final Long critical = 10000L;//临界值

        public ForkJoinWork(Long start, Long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            //判断是否是拆分完毕
            Long lenth = end - start;
            if (lenth <= critical) {
                //如果拆分完毕就相加
                Long sum = 0L;
                for (Long i = start; i <= end; i++) {
                    sum += i;
                }
                return sum;
            } else {
                //没有拆分完毕就开始拆分
                Long middle = (end + start) / 2;//计算的两个值的中间值
                ForkJoinWork right = new ForkJoinWork(start, middle);
                right.fork();//拆分，并压入线程队列
                ForkJoinWork left = new ForkJoinWork(middle + 1, end);
                left.fork();//拆分，并压入线程队列

                //合并
                return right.join() + left.join();
            }
        }
    }

    public static void main(String[] args) {
        //实现ForkJoin 就必须有ForkJoinPool的支持
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //参数为起始值与结束值
        ForkJoinTask<Long> task = new ForkJoinWork(0L, 100000000L);
        Long result = forkJoinPool.invoke(task);
        System.out.println(result);
    }
}
