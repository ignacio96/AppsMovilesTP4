package com.example.lanzi.appsmovilestp4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<Entidad> listItems;

    public Adaptador(Context context, ArrayList<Entidad> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Entidad Item = (Entidad) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        TextView tvAlimento = (TextView) convertView.findViewById(R.id.tvAlimento);
        TextView tvContenido1 = (TextView) convertView.findViewById(R.id.tvContenido1);
        TextView tvContenido2 = (TextView) convertView.findViewById(R.id.tvContenido2);
        TextView tvContenido3 = (TextView) convertView.findViewById(R.id.tvContenido3);
        TextView tvContenido4 = (TextView) convertView.findViewById(R.id.tvContenido4);

        tvAlimento.setText(Item.getAlimento());
        tvContenido1.setText(Item.getContenido1());
        tvContenido2.setText(Item.getContenido2());
        tvContenido3.setText(Item.getContenido3());
        tvContenido4.setText(Item.getContenido4());

        return convertView;
    }
}
