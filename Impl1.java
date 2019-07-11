package com.softcell.mbx.workflow.decision.decisionconstants;

import org.springframework.beans.factory.annotation.Autowired;

public class Impl1 implements SampleInterf {

    @Autowired
    public Impl1() {
        super();
    }

    @Override
    public String sampleFunc() {
        return  "impl1111";
    }
}
