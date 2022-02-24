package com.patterns.singleton;

/**
 * @author Qiq
 * @date 2021/12/14
 */
public class DemoSingleton {

    public static void main(String[] args) {
        Singleton king = Singleton.getInstance("king");
        Singleton queen = Singleton.getInstance("queen");
        System.out.println(king.getValue());
        System.out.println(queen.getValue());
    }

}
