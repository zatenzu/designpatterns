package be.zatenzu.patterns.behavioral.templatemethod;

import com.sun.jmx.snmp.tasks.Task;

public class GatewayA extends CoreClient{

    @Override
    boolean initialize() {
        boolean initialized = true;

        try{
            //initDBConnection
            //initQueueClient
            //....
        }
        catch(Exception ex){
            initialized = false;
            //manage error
        }

        return initialized;
    }

    @Override
    Task getTask() {
        //readQueue
        //buildTask()
        return null;//return task
    }

    @Override
    void doTask(Task t) {
        //do task
    }
}
