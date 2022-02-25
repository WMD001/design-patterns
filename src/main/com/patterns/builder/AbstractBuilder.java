package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public abstract class AbstractBuilder {

    Product product;

    public void build() {
        this.product = new Product();
    }

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartZ();

}
