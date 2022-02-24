package com.patterns.factorymethod.factory;

import com.patterns.factorymethod.product.Product;
import com.patterns.factorymethod.product.ProductA;

public class FactoryForA implements Factory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
