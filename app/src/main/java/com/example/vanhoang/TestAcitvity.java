package com.example.vanhoang;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class TestAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_acitvity);
        Button btn_AddProduct = findViewById(R.id.btn_AddProduct);
        Button btn_AddCustomer = findViewById(R.id.btn_AddCustomer);

        btn_AddCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TestAcitvity.this);
                LayoutInflater inflater =((Activity)TestAcitvity.this).getLayoutInflater();
                View view = inflater.inflate(R.layout.activity_add_customer, null);
                builder.setView(view);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        btn_AddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TestAcitvity.this);
                LayoutInflater inflater =((Activity)TestAcitvity.this).getLayoutInflater();
                View view = inflater.inflate(R.layout.activity_add_product, null);
                builder.setView(view);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}