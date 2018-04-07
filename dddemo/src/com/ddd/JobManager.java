package com.ddd;

import com.ddd.framework.OpportunityManager;

public class JobManager extends OpportunityManager {
    @Override
    public Object getOpportunityDetail() {
        System.out.print("Job Detail!");
        return null;
    }

    public Job[] getSearchJobList(){
        return (Job[])getOpportunityList(new JobProvider());
    }
    public Job[] getRecommandListByResume(){
        return (Job[])getOpportunityList(new JobProvider());
    }
}
