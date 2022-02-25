package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class DirectorTest {

    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.build();
        System.out.println(product.toString());;
    }

}
