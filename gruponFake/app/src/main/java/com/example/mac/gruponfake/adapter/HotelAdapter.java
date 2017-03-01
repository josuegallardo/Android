package com.example.mac.gruponfake.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mac.gruponfake.R;
import com.example.mac.gruponfake.modelos.Hotel;

import java.util.ArrayList;

/**
 * Created by MAC on 1/03/17.
 */

public class HotelAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Hotel> list;
    public HotelAdapter(Context context, ArrayList<Hotel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (list.get(position).getId());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item_hotel, parent, false);

        TextView nombre = (TextView)convertView.findViewById(R.id.tvNombreHotel);
        TextView ciudad = (TextView)convertView.findViewById(R.id.tvCiudadHotel);
        TextView precio = (TextView)convertView.findViewById(R.id.tvPrecioHotel);
        Hotel hotel = (Hotel) getItem(position);
        nombre.setText(hotel.getNombre());
        ciudad.setText(hotel.getCiudad());
        precio.setText(hotel.getPrecio());
        return convertView;
    }


}
