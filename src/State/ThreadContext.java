package State;

public class ThreadContext {
    private ThreadState threadState;
    public ThreadContext(){
        threadState=new NewState();
    }

    public ThreadState getThreadState(){
        return threadState;
    }

   public void setThreadState(ThreadState threadState){
            this.threadState=threadState;
   }
   public void start(){
       ((NewState)threadState).start(this);
   }

    public void getCPU(){
        ((RunnableState)threadState).getCPU(this);
    }

    public void suspend(){
        ((RunningState)threadState).suspend(this);
    }
    public void stop(){
        ((RunningState)threadState).stop(this);
    }
    public void resume(){
        ((BlockedState)threadState).resume(this);
    }



}
