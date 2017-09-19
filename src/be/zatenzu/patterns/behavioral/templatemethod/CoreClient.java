package be.zatenzu.patterns.behavioral.templatemethod;

import com.sun.jmx.snmp.tasks.Task;

public abstract class CoreClient {

    protected boolean paused;

    abstract boolean initialize();
    abstract Task getTask();
    abstract void doTask(Task t);

    /**
     * Template method
     */
    protected void process(){
        if(initialize()){
            while (!isPaused()){
                Task task = getTask();
                if(task != null){
                    doTask(task);
                }
            }
        }
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }
}
