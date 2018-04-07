package com.ddd;

import com.ddd.framework.Opportunity;

public class Job extends Opportunity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "id:"+this.id+" sessionId:"+sessionId+" supplierId:"+supplierId;

        return result;
    }
}
