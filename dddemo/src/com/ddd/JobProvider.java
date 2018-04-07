package com.ddd;


import com.ddd.framework.OpportunityProvider;


public class JobProvider implements OpportunityProvider {

    public JobProvider(){

    }

    public Job[] provide() {

        Job[] jobs = new Job[10];
        int i = 0;
        for (Job job:jobs){
            job = new Job();
            job.setName(""+i);
            jobs[i] = job;
            i ++;
        }
        return jobs;
    }
}
