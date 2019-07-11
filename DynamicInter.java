package com.softcell.mbx.workflow.decision.decisionconstants;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicInter {

    public static Map<String, Object> sample = new HashMap<>();


    /*static {
        sample.put("impl1",new Impl1());
        sample.put("impl2", new Impl2());
        sample.put("impl3", new Impl3());
    }*/

    public static void main(final String[] args) {
        sample.put("impl1", new Impl1());
        sample.put("impl2", new Impl2());
        sample.put("impl3", new Impl3());
        List<String> li = new ArrayList<>();
        li.add("impl1");
        li.add("impl2");
        li.add("impl3");
        li.forEach(t -> {
            try {
                Object o = sample.get(t).getClass().getMethod("sampleFunc", null).invoke(sample.get(t));
                System.out.println(o.toString());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
}
