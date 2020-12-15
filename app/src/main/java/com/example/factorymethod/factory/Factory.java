package com.example.factorymethod.factory;

import com.example.factorymethod.data.Product;

/**
 * 抽象クラスCreator
 *
 * Productのインスタンスを生成する
 */
public abstract class Factory {

    // Template Methodパターンを用いてインスタンス生成の手順を定義
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    // 手順の具体的な処理はサブクラスで定義する
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
