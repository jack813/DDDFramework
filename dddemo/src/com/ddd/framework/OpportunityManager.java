package com.ddd.framework;

public abstract class OpportunityManager {
    public  Opportunity[] getOpportunityList(OpportunityProvider provider){
        Opportunity[] opportunities = provider.provide();
        marked(opportunities);
        getCaller();
        return  opportunities;
    }
    public abstract Object getOpportunityDetail();

    private void marked(Opportunity[] opportunities){
        long sessionId = System.currentTimeMillis();
        for (Opportunity opportunity:opportunities) {
            opportunity.sessionId = sessionId;
        }
    }

    public static void getCaller()
    {
        StackTraceElement stack[] = (new Throwable()).getStackTrace();
        for (int i = 0; i < stack.length; i++)
        {
            StackTraceElement s = stack[i];
            System.out.format(" ClassName:%d\t%s\n", i, s.getClassName());
            System.out.format("MethodName:%d\t%s\n", i, s.getMethodName());
            System.out.format("  FileName:%d\t%s\n", i, s.getFileName());
            System.out.format("LineNumber:%d\t%s\n\n", i, s.getLineNumber());
        }
    }
}
