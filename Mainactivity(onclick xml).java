
    }package com.example.duy.laptrinhsukien;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

        public class MainActivity extends AppCompatActivity {

            public void bnt_tong2so(View v)
            {
                EditText edita=(EditText)findViewById(R.id.editsoa);
                int a =Integer.parseInt(edita.getText()+"");
                EditText editb=(EditText)findViewById(R.id.editsob);
                int b =Integer.parseInt(editb.getText()+"");
                TextView txtkq=(TextView)findViewById(R.id.textvievkq);
                txtkq.setText((a+b)+"");
            }


            @Override
            protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

            }
        }