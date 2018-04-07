package com.ddd.framework;

public abstract class Opportunity {
    protected long id;
    protected long sessionId;
    protected long supplierId;
    public Opportunity(){
        id = generateID();
    }

    private long generateID(){
        return System.currentTimeMillis();
    }
}
