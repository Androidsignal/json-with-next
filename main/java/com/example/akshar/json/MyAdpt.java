package com.example.akshar.json;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Akshar on 8/23/2017.
 */
public class MyAdpt extends BaseAdapter {

  Context context;
  ArrayList<myBean> arrayList;

  public MyAdpt(Context context, ArrayList<myBean> arrayList) {
    this.context = context;
    this.arrayList = arrayList;
  }

  @Override
  public int getCount() {
    return arrayList.size();
  }

  @Override
  public Object getItem(int position) {
    return null;
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {

    LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    convertView = layoutInflater.inflate(R.layout.layout, null);

    TextView txtName = (TextView) convertView.findViewById(R.id.list1);

    myBean myBean = arrayList.get(position);
    txtName.setText("ID : " + myBean.getName());

    return convertView;
  }
}
