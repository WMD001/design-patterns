package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class ConcreteBuilder extends AbstractBuilder {


    @Override
    public void buildPartA() {
        product.setField1("A");
    }

    @Override
    public void buildPartB() {
        product.setField2("B");
    }

    @Override
    public void buildPartZ() {
        product.setField3("Z");
    }
}
