package com.patterns.factorymethod;

import com.patterns.factorymethod.factory.Factory;
import com.patterns.factorymethod.factory.FactoryForA;
import com.patterns.factorymethod.factory.FactoryForB;
import com.patterns.factorymethod.product.Product;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // 在实际使用中，根据实际情况选择对应的创建工厂
        Factory factory = null;

        Scanner inputStr = new Scanner(System.in);
        System.out.println("输入要创建的产品类型：A/B");
        if (inputStr.hasNext()) {
            String type = inputStr.next();
            if ("A".equalsIgnoreCase(type)) {
                factory = new FactoryForA();
            } else if ("B".equalsIgnoreCase(type)){
                factory = new FactoryForB();
            } else {
                System.out.println("输入有误，系统推出");
                System.exit(1);
            }
            Product product = factory.createProduct();
            System.out.println("创建产品成功：" + product.getProductName());
        }


    }

}
