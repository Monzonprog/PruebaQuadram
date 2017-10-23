package com.example.jorge.pruebaquadram.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jorge.pruebaquadram.Activities.DetailActivity;
import com.example.jorge.pruebaquadram.Class.Entry;
import com.example.jorge.pruebaquadram.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jorge on 22/10/17.
 */

public class AppListAdapter extends RecyclerView.Adapter<AppListAdapter.AppViewHolder> {


        private List<Entry> items;
        public Context context;

        public static class AppViewHolder extends RecyclerView.ViewHolder {

            public ImageView imageViewImageApp;
            public TextView textViewAppPosition;
            public TextView textViewAppName;
            public TextView textViewAppDeveloper;
            public TextView textViewAppPrice;



            public AppViewHolder(final View v) {
                super(v);
                imageViewImageApp = (ImageView) v.findViewById(R.id.imageViewImageApp);
                textViewAppPosition = (TextView)v.findViewById(R.id.textViewAppPosition);
                textViewAppName = (TextView)v.findViewById(R.id.textViewAppName);
                textViewAppDeveloper = (TextView)v.findViewById(R.id.textViewAppDeveloper);
                textViewAppPrice = (TextView)v.findViewById(R.id.textViewAppPrice);

            }
        }

        //Recibimos los elementos
        public AppListAdapter(List<Entry> items){

            this.items = items;

        }

        //Obtenemos la cantidad de elmentos
        @Override
        public int getItemCount() {
            return items.size();
        }

        //Creamos el ViewHolder
        @Override
        public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

            View v = LayoutInflater.from(viewGroup.getContext()).
                    inflate(R.layout.cardview_apps, viewGroup, false);

            context = viewGroup.getContext();

            return new AppViewHolder(v);

        }

        @Override
        public void onBindViewHolder(final AppViewHolder viewholder, final int i) {

            String order = String.valueOf(i+1);

            Picasso.with(context).load(items.get(i).getImImageItem().get(2).getLabel())
                    .into( viewholder.imageViewImageApp);
            viewholder.textViewAppPosition.setText(order);
            viewholder.textViewAppName.setText(items.get(i).getImName().getLabel());
            viewholder.textViewAppDeveloper.setText(items.get(i).getImArtistItem().getLabel());
            viewholder.textViewAppPrice.setText(modifyPrice(i));

            viewholder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent a = new Intent(context,DetailActivity.class);
                    a.putExtra("idApp", items.get(i).getId().getAttributes().getImId());
                    view.getContext().startActivity(a);
                }
            });


        }


        private String modifyPrice (int i){

            String price = items.get(i).getImPriceItem().getLabel();

            if(price.equals("Obtener")){
                return price = "Free";
            }else {
                return price;
            }

        }

    }
