package com.example.mac.gruponfake.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;


import com.example.mac.gruponfake.R;
import com.example.mac.gruponfake.modelos.Hotel;
import com.example.mac.gruponfake.views.TextViewCustom;
import com.facebook.drawee.view.SimpleDraweeView;

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
    class ViewHolder{
        TextView tvNombre;
        TextView tvCiudad;
        TextViewCustom tvPRecio;
        RatingBar rbValoracion;
        SimpleDraweeView sdImagen;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_hotel, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvNombre = (TextView) convertView.findViewById(R.id.tvNombreHotel);
            viewHolder.tvCiudad = (TextView)convertView.findViewById(R.id.tvCiudadHotel);
            viewHolder.tvPRecio = (TextViewCustom)convertView.findViewById(R.id.tvPrecioHotel);
            viewHolder.rbValoracion = (RatingBar) convertView.findViewById(R.id.rbValoracion);
            viewHolder.sdImagen = (SimpleDraweeView) convertView.findViewById(R.id.sdImagen);
            //Cambiar tipo de letra
            Typeface typeface=Typeface.createFromAsset(context.getAssets(), "fonts/COMICATE.TTF");
            viewHolder.tvNombre.setTypeface(typeface);
            typeface=Typeface.createFromAsset(context.getAssets(), "fonts/SIXTY.TTF");
            viewHolder.tvCiudad.setTypeface(typeface);
            convertView.setTag(viewHolder);
        }
        viewHolder=(ViewHolder) convertView.getTag();
        Hotel hotel=(Hotel) getItem(position);
        viewHolder.tvNombre.setText(hotel.getNombre());
        viewHolder.tvCiudad.setText(hotel.getCiudad());
        viewHolder.tvPRecio.setText("$" + hotel.getPrecio());

        viewHolder.sdImagen.setImageURI(Uri.parse(hotel.getRutaImagen()));
        if (hotel.getRating()>0){
            viewHolder.rbValoracion.setVisibility(View.VISIBLE);
            viewHolder.rbValoracion.setRating(hotel.getRating());
        }else{
            //No se muestra pero sigue ocupando el espacio
            //          viewHolder.rbValoracion.setVisibility(View.INVISIBLE);
            //No se muestra y desaparece espacio
            viewHolder.rbValoracion.setVisibility(View.GONE);
        }



        //convertView = LayoutInflater.from(context).inflate(R.layout.item_hotel, parent, false);
        //TextView nombre = (TextView)convertView.findViewById(R.id.tvNombreHotel);
        //TextView ciudad = (TextView)convertView.findViewById(R.id.tvCiudadHotel);
        //TextView precio = (TextView)convertView.findViewById(R.id.tvPrecioHotel);
        //Hotel hotel = (Hotel) getItem(position);
        //nombre.setText(hotel.getNombre());
        //ciudad.setText(hotel.getCiudad());
        //precio.setText("$" + hotel.getPrecio());
        return convertView;
    }


}
