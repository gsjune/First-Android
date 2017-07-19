package com.hckim.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CoffeeActivity extends AppCompatActivity {

    private TextView mQuantityTextView;
    private TextView mPriceTextView;
    private int mQuantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        mQuantityTextView = (TextView) findViewById(R.id.quantity_text);
//        Button minusButton = (Button) findViewById(R.id.minus_button);
//        Button plusButton = (Button) findViewById(R.id.plus_button);

        mPriceTextView = (TextView) findViewById(R.id.quantity_text);


    }

    public void minusButtonClicked(View view) {
//        Toast.makeText(this, "잘 눌림", Toast.LENGTH_SHORT).show();
        mQuantity--;
        if (mQuantity < 0) {
            mQuantity = 1;
        }
        mQuantityTextView.setText("" + mQuantity);
//        mQuantityTextView.setText("" + Math.max(mQuantity, 0);

    }

    public void plusButtonClicked(View view) {
//        Toast.makeText(this, "잘 눌림", Toast.LENGTH_SHORT).show();
        mQuantity++;
        mQuantityTextView.setText("" + mQuantity);

    }


    public void priceButtonClicked(View view) {
    }
}
