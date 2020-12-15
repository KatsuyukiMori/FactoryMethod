package com.example.factorymethod

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.factorymethod.factory.AccountFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = AccountFactory()
        // インスタンス生成の具体的な処理は知らなくて良い
        // Productのサブクラスに依存しないため、サブクラスの変更に強い
        val account1 = factory.create("Ralph Johnson")
        val account2 = factory.create("Richard Helm")
        Log.d(TAG, "factory owners: ${factory.owners}")
        val account3 = factory.create("John Vlissides")
        val account4 = factory.create("Erich Gamma")

        account1.use()
        account2.use()
        account3.use()
        account4.use()
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}