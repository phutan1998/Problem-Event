package com.example.duy.activityislistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnRamdom;
    EditText edtNumber1, edtNumber2;
    TextView txtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRamdom =(Button)findViewById(R.id.button1);
        btnRamdom.setOnClickListener(this);
        edtNumber1=(EditText)findViewById(R.id.edtsoa);
        edtNumber2=(EditText)findViewById(R.id.edtsob);
        txtNumber=(TextView)findViewById(R.id.viewkq);
    }
    @Override
    public void onClick(View arg0)
    {
        int a =Integer.parseInt(edtNumber1.getText()+"");
        int b=Integer.parseInt(edtNumber2.getText()+"");
        int c=a+b;
        txtNumber.setText((c)+"");
    }
}