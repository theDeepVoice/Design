package State;

public class RunnableState extends ThreadState{
    public RunnableState(){
        state=StateSet.RUNNABLE;
        System.out.println("就绪状态");
    }
    public void getCPU(ThreadContext tc){
        System.out.println("获得CPU时间");
        if (state==StateSet.RUNNABLE)
            tc.setThreadState(new RunningState());
        else System.out.println("非就绪状态");
    }
}
