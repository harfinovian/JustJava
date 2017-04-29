package com.example.harfi.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tambahBtn = (Button)findViewById(R.id.btn_plus);
        Button kurangBtn = (Button)findViewById(R.id.btn_min);
        Button orderBtn = (Button)findViewById(R.id.order_btn);

        tambahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                display();
            }
        });

        kurangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity--;
                display();
            }
        });

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalPrice();
            }
        });

    }

    public void display(){
        TextView tvQty = (TextView)findViewById(R.id.tv_quantity);
        tvQty.setText(Integer.toString(quantity));
    }

    public void totalPrice(){
        TextView tvPrice  = (TextView)findViewById(R.id.tv_price);
        tvPrice.setText("$"+Integer.toString(price * quantity));
    }
}
