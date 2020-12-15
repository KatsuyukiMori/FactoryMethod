package com.example.factorymethod.data;

import android.util.Log;

/**
 * Productの具象クラス
 */
public class Account extends Product {

    private static final String TAG = "Account";
    private String owner;

    public Account(String owner) {
        Log.d(TAG, "Create account: " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        Log.d(TAG, "Use account: " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
