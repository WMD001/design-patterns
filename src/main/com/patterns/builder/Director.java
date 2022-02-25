package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class Director {

    AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void changeBuild(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product build() {
        builder.build();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartZ();
        return builder.product;
    }

}
