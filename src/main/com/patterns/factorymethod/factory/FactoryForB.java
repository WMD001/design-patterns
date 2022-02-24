package com.patterns.factorymethod.factory;

import com.patterns.factorymethod.product.Product;
import com.patterns.factorymethod.product.ProductB;

public class FactoryForB implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
