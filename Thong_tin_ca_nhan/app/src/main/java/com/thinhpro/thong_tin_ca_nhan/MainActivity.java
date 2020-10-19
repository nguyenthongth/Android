package com.thinhpro.thong_tin_ca_nhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    EditText edtId;
    RadioButton rdoIntermediate;
    RadioButton rdoCollege;
    RadioButton rdoUniversity;
    CheckBox cbReadNewspaper;
    CheckBox cbReadBook;
    CheckBox cbReadCode;
    EditText edtAdditional;
    Button btnSendInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init(){
        edtName = findViewById(R.id.edtName);
        edtId = findViewById(R.id.edtId);
        rdoIntermediate = findViewById(R.id.rdoIntermediate);
        rdoCollege = findViewById(R.id.rdoCollege);
        rdoUniversity = findViewById(R.id.rdoUniversity);
        cbReadNewspaper = findViewById(R.id.cbReadNewspaper);
        cbReadBook = findViewById(R.id.cbReadBook);
        cbReadCode = findViewById(R.id.cbReadCode);
        edtAdditional = findViewById(R.id.edtAdditional);
        btnSendInfo = findViewById(R.id.btnSendInfo);
        btnSendInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String Additional = edtAdditional.getText().toString();
                String id = edtId.getText().toString();
                String degree="";
                String hobby="";

                if(rdoIntermediate.isChecked()){
                    degree = "Trung Cấp";
                }else if(rdoCollege.isChecked()){
                    degree = "Cao Đẳng";
                }else{
                    degree = "Đại Học";
                }



                Toast.makeText(getApplicationContext(),  name +"\n"+ id +"\n"+ degree +"\n"+ Additional , Toast.LENGTH_LONG).show();

//                Toast.makeText(getApplicationContext(),"Hello Android",Toast.LENGTH_LONG).show();
            }
        });
    }

}