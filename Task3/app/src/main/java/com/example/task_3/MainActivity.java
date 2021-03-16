package com.example.task_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox rice_CheckBox, sugar_CheckBox, milk_CheckBox, onion_CheckBox, potato_CheckBox;
    private Button submit_Button;
    private TextView productResult_TextView, deliveryCharge_TextView, totalPrice_TextView, payment_TextView, riceValue_TextView, sugarValue_TextView, milkValue_TextView, onionValue_TextView,potatoValue_TextView;
    private SeekBar rice_SeekBar, sugar_SeekBar, milk_SeekBar, onion_SeekBar, potato_SeekBar;
    private int riceQuantity, sugarQuantity, milkQuantity, onionQuantity, potatoQuantity, deliveryCharge,totalPrice;
    private Switch homeDeliverySwitch;
    private RadioButton paymentMethodRadioButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rice_CheckBox = findViewById(R.id.rice_CheckBoxID);
        sugar_CheckBox = findViewById(R.id.sugar_CheckBoxID);
        milk_CheckBox = findViewById(R.id.milk_CheckBoxID);
        onion_CheckBox = findViewById(R.id.onion_CheckBoxID);
        potato_CheckBox = findViewById(R.id.potato_CheckBoxID);

        submit_Button = findViewById(R.id.submit_ButtonID);

        productResult_TextView = findViewById(R.id.products_TextViewID);
        deliveryCharge_TextView = findViewById(R.id.deliveryCharge_TextViewID);
        totalPrice_TextView = findViewById(R.id.totalPrice_TextViewID);
        payment_TextView = findViewById(R.id.payment_TextViewID);

        rice_SeekBar = findViewById(R.id.rice_SeekbarID);
        rice_SeekBar.setEnabled(false);

        sugar_SeekBar = findViewById(R.id.sugar_SeekbarID);
        sugar_SeekBar.setEnabled(false);

        milk_SeekBar = findViewById(R.id.milk_SeekbarID);
        milk_SeekBar.setEnabled(false);

        onion_SeekBar = findViewById(R.id.onion_SeekbarID);
        onion_SeekBar.setEnabled(false);

        potato_SeekBar = findViewById(R.id.potato_SeekbarID);
        potato_SeekBar.setEnabled(false);

        riceValue_TextView = findViewById(R.id.riceValue_TextViewID);
        sugarValue_TextView = findViewById(R.id.sugarValue_TextViewID);
        milkValue_TextView = findViewById(R.id.milkValue_TextViewID);
        onionValue_TextView = findViewById(R.id.onionValue_TextViewID);
        potatoValue_TextView = findViewById(R.id.potatoValue_TextViewID);

        homeDeliverySwitch = findViewById(R.id.homeDelivery_SwitchID);

        radioGroup = findViewById(R.id.radioGroupId);


        riceValue_TextView.setText("Value: "+rice_SeekBar.getProgress()+"/"+rice_SeekBar.getMax());
        sugarValue_TextView.setText("Value: "+sugar_SeekBar.getProgress()+"/"+sugar_SeekBar.getMax());
        milkValue_TextView.setText("Value: "+milk_SeekBar.getProgress()+"/"+milk_SeekBar.getMax());
        onionValue_TextView.setText("Value: "+onion_SeekBar.getProgress()+"/"+onion_SeekBar.getMax());
        potatoValue_TextView.setText("Value: "+potato_SeekBar.getProgress()+"/"+potato_SeekBar.getMax());




        rice_CheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (rice_CheckBox.isChecked()){
                    rice_SeekBar.setEnabled(true);
                    rice_SeekBar.setProgress(1);
                }
            }
        });

        sugar_CheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sugar_CheckBox.isChecked()){
                    sugar_SeekBar.setEnabled(true);
                    sugar_SeekBar.setProgress(1);
                }
            }
        });

        milk_CheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (milk_CheckBox.isChecked()){
                    milk_SeekBar.setEnabled(true);
                    milk_SeekBar.setProgress(1);
                }
            }
        });

        onion_CheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (onion_CheckBox.isChecked()){
                    onion_SeekBar.setEnabled(true);
                    onion_SeekBar.setProgress(1);
                }
            }
        });

        potato_CheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (potato_CheckBox.isChecked()){
                    potato_SeekBar.setEnabled(true);
                    potato_SeekBar.setProgress(1);
                }
            }
        });


        rice_SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                riceValue_TextView.setText("Value: "+progress+"/"+seekBar.getMax());
                riceQuantity=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sugar_SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sugarValue_TextView.setText("Value: "+progress+"/"+seekBar.getMax());
                sugarQuantity = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        milk_SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                milkValue_TextView.setText("Value: "+progress+"/"+seekBar.getMax());
                milkQuantity = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        onion_SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                onionValue_TextView.setText("Value: "+progress+"/"+seekBar.getMax());
                onionQuantity = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        potato_SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                potatoValue_TextView.setText("Value: "+progress+"/"+seekBar.getMax());
                potatoQuantity = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        homeDeliverySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(homeDeliverySwitch.isChecked()){
                    Toast.makeText(MainActivity.this,"on",Toast.LENGTH_SHORT).show();
                    deliveryCharge = 50;
                }
                else{
                    Toast.makeText(MainActivity.this,"off",Toast.LENGTH_SHORT).show();
                }
            }
        });

        submit_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(rice_CheckBox.isChecked()){
                    String product = rice_CheckBox.getText().toString();
                    stringBuilder.append(product+" ");
                }
                if(sugar_CheckBox.isChecked()){
                    String product = sugar_CheckBox.getText().toString();
                    stringBuilder.append(product+" ");
                }
                if(milk_CheckBox.isChecked()){
                    String product = milk_CheckBox.getText().toString();
                    stringBuilder.append(product+" ");
                }
                if(onion_CheckBox.isChecked()){
                    String product = onion_CheckBox.getText().toString();
                    stringBuilder.append(product+" ");
                }
                if(potato_CheckBox.isChecked()){
                    String product = potato_CheckBox.getText().toString();
                    stringBuilder.append(product+" ");
                }
                productResult_TextView.setText("Products: "+stringBuilder);

                int methodId = radioGroup.getCheckedRadioButtonId();
                paymentMethodRadioButton = findViewById(methodId);

                String method = paymentMethodRadioButton.getText().toString();
                payment_TextView.setText("Payment: "+method);

                if(homeDeliverySwitch.isChecked()){
                    deliveryCharge_TextView.setText("Delivery Charge: "+deliveryCharge+"BDT.");
                    totalPrice = (riceQuantity*65)+(sugarQuantity*35)+(milkQuantity*60)+(onionQuantity*80)+(potatoQuantity*50)+50;
                    totalPrice_TextView.setText("Total Price: "+totalPrice);
                }
                else{
                    deliveryCharge_TextView.setText("Delivery Charge: N/A");
                    totalPrice = (riceQuantity*65)+(sugarQuantity*35)+(milkQuantity*60)+(onionQuantity*80)+(potatoQuantity*50);
                    totalPrice_TextView.setText("Total Price: "+totalPrice);
                }

            }
        });


    }





}