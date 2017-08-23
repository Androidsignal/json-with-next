package com.example.akshar.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

  ArrayList<myBean> arrayList;
  Button next,prev;
  myBean myBean;
  TextView name,number;
  int pos;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    name=(TextView) findViewById(R.id.txtName);
    number=(TextView) findViewById(R.id.txtMobile);

    next=(Button) findViewById(R.id.btnNext);
    prev=(Button) findViewById(R.id.btnPrevious);


    arrayList=(ArrayList<myBean>) getIntent().getSerializableExtra("ravi") ;

    pos=getIntent().getIntExtra("pos",0);

    next.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        pos = pos+1;

        if(pos < arrayList.size()){
          name.setText(arrayList.get(pos).getName());
          number.setText(arrayList.get(pos).getMobile());
        }
        else
        {
          pos=pos-1;
        }

      }
    });
    prev.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        pos = pos-1;

        if(pos >= 0){
          name.setText(arrayList.get(pos).getName());
          number.setText(arrayList.get(pos).getMobile());
        }
        else
        {
          pos=pos+1;
        }


      }
    });

    name.setText(arrayList.get(pos).getName());
    number.setText(arrayList.get(pos).getMobile());

  }
}
