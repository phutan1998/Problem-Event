package com.example.duy.anonymouslistener;

package com.example.pc.textandroid1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    Button btRamdom;
    EditText edtNumber1;
    EditText edtNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        btRamdom.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText edita=(EditText)findViewById(R.id.edtsoa);
                int a =Integer.parseInt(edita.getText()+"");
                EditText editb=(EditText)findViewById(R.id.edtsob);
                int b =Integer.parseInt(editb.getText()+"");
                TextView txtkq=(TextView)findViewById(R.id.view3);
                txtkq.setText((a+b)+"");

            }
        });
    }
    public void Anhxa()
    {
        txtNumber =(TextView)findViewById(R.id.view3);
        btRamdom=(Button) findViewById(R.id.button);
        edtNumber1=(EditText) findViewById(R.id.edtsoa);
        edtNumber2=(EditText)findViewById(R.id.edtsoa);
    }
}