package com.arjun.goodcode;

public class ManagementEngineer extends Engineer{
    Worker worker;

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void manageWorker(){
        worker.work();
    }
}
