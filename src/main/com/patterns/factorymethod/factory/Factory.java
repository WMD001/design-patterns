package com.patterns.factorymethod.factory;

import com.patterns.factorymethod.product.Product;

public interface Factory {

    /**
     * 工厂创建产品
     * @return Product 对应的产品
     */
    Product createProduct();

}
