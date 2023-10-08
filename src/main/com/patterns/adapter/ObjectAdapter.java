package com.patterns.adapter;

/**
 * @author Qiq
 * @date 2022/2/15
 */
public class ObjectAdapter implements ClientInterface {

    Service adaptee;

    public ObjectAdapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method(String data) {
        String specificData = data;
        adaptee.specificMethod(specificData);
    }
}
