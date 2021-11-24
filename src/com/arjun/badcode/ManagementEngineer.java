package com.arjun.badcode;

/*This is violating the Dependency Inversion Principle as ManagementEngineer is directly
dependent on WorkerForManagementEngineer*/

public class ManagementEngineer extends Engineer{
    WorkerForManagementEngineer worker;

    public void setWorker(WorkerForManagementEngineer worker) {
        this.worker = worker;
    }

    public void manageWorker(){
        worker.work();
    }
}
