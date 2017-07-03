package com.example.murathanacpayam.basithesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd,btnSub,btnDiv,btnMul;
    private TextView tvResult;
    private EditText etFirstNumber,etSecondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calistir();
    }

    private void calistir() {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMul = (Button) findViewById(R.id.btnMul);
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = etFirstNumber.getText().toString();
        String num2 = etSecondNumber.getText().toString();
        switch(v.getId()){
            case R.id.btnAdd :
                int add = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvResult.setText("Cevap = "+String.valueOf(add));
                break;
            case R.id.btnSub :
                int sub = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvResult.setText("Cevap = "+String.valueOf(sub));
                break;
            case R.id.btnDiv :
                try{
                    int div =Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvResult.setText("Cevap = "+String.valueOf(div));
                }catch (Exception e){
                    tvResult.setText("Sayı Bölünemez!");
                }
                break;
            case R.id.btnMul :
                int mul = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvResult.setText("Cevap = "+String.valueOf(mul));
                break;
        }
    }
}
