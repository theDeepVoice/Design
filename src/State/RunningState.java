package State;

public class RunningState extends ThreadState{
    public RunningState(){
        state=StateSet.RUNNING;
        System.out.println("运行状态");
    }
    public void suspend(ThreadContext tc){
        System.out.println("调用Suspend放法");
        if (state==StateSet.RUNNABLE)
            tc.setThreadState(new BlockedState());
        else System.out.println("当前不是运行状态");
    }
    public void stop(ThreadContext tc){
        System.out.println("调用Stop方法");
        if (state==StateSet.RUNNING)
            tc.setThreadState(new DeadState());
        else System.out.println("当前不是运行状态");
    }

}

