package com.example.akshar.json;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
  ListView listView;
  myBean myBean;
  ArrayList<myBean> arrayList;
  MyAdpt adpt;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    listView = (ListView) findViewById(R.id.list);
    arrayList = new ArrayList<>();

    AsyncLoader asyncLoader = new AsyncLoader(MainActivity.this, "https://api.androidhive.info/contacts/", new Onacysnkloader() {
      @Override
      public void Onresult(String result) {
        Log.d("Tag", "Onresult: "+result);
        try {
          JSONObject jsonObject = new JSONObject(result);
          JSONArray jsonArray = jsonObject.getJSONArray("contacts");
          for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            myBean = new myBean();
            myBean.setId(job.getString("id"));
            myBean.setName(job.getString("name"));
            myBean.setEmail(job.getString("email"));
            myBean.setAddress(job.getString("address"));

            myBean.setGender(job.getString("gender"));

            JSONObject phone = job.getJSONObject("phone");
            myBean.setMobile(phone.getString("mobile"));

            arrayList.add(myBean);
           // Log.d("array", "Onresult: "+arrayList);
            adpt=new MyAdpt(getApplicationContext(),arrayList);
            listView.setAdapter(adpt);
            adpt=new MyAdpt(getApplicationContext(),arrayList);
            listView.setAdapter(adpt);
          }
        } catch (JSONException e) {
          e.printStackTrace();
        }

      }
    });
    asyncLoader.execute();



    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("pos",position);
        i.putExtra("ravi",arrayList);
        startActivity(i);
      }
    });

  }
}
