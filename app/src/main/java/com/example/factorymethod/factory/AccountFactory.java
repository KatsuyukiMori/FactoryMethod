package com.example.factorymethod.factory;

import com.example.factorymethod.data.Account;
import com.example.factorymethod.data.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Factoryの具象クラス
 */
public class AccountFactory extends Factory {

    // 作成したインスタンスの一覧を保持する
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new Account(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((Account)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
