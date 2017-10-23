package com.example.jorge.pruebaquadram.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jorge.pruebaquadram.Class.DetailObject;
import com.example.jorge.pruebaquadram.Class.Results;
import com.example.jorge.pruebaquadram.Interfaces.IDataDetails;
import com.example.jorge.pruebaquadram.R;
import com.example.jorge.pruebaquadram.Utils.ConexionManager;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jorge on 23/10/17.
 */
public class DetailActivity extends AppCompatActivity implements IDataDetails{

    private String id;

    public ImageView imageViewImageDetailApp;
    public TextView textViewAppDetailName;
    public TextView textViewAppDetailDeveloper;
    public TextView textViewAppDetailPrice;
    public TextView textViewCategoriaDetailApp;
    public TextView textViewVersionDetailApp;
    public TextView textViewReleaseDateDetailApp;
    public TextView textViewCurrentVersionADetailpp;
    public TextView textViewDescriptionDetailApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        id = getIntent().getStringExtra("idApp");
        getDetailApp(id);

        imageViewImageDetailApp = (ImageView)findViewById(R.id.imageViewImageDetailApp);
        textViewAppDetailName = (TextView)findViewById(R.id.textViewAppDetailName);
        textViewAppDetailDeveloper = (TextView)findViewById(R.id.textViewAppDetailDeveloper);
        textViewAppDetailPrice = (TextView)findViewById(R.id.textViewAppDetailPrice);
        textViewCategoriaDetailApp = (TextView)findViewById(R.id.textViewCategoriaDetailApp);
        textViewVersionDetailApp = (TextView)findViewById(R.id.textViewVersionDetailApp);
        textViewReleaseDateDetailApp = (TextView)findViewById(R.id.textViewReleaseDateDetailApp);
        textViewCurrentVersionADetailpp = (TextView)findViewById(R.id.textViewCurrentVersionADetailpp);
        textViewDescriptionDetailApp = (TextView)findViewById(R.id.textViewDescriptionDetailApp);
    }

    private void getDetailApp(String id) {

        ConexionManager conexion = new ConexionManager("https://itunes.apple.com/");
        conexion.getInfoApp(this, id);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void conexionCorrecta(DetailObject detailApp) {

        List<Results> items;

        items = detailApp.getResults();

        Picasso.with(this).load(items.get(0).getArtworkUrl100())
                .into(imageViewImageDetailApp);
        textViewAppDetailName.setText(items.get(0).getTrackName());
        textViewAppDetailDeveloper.setText(items.get(0).getArtistName());
        textViewAppDetailPrice.setText(modifyPrice(items.get(0).getPrice()));
        textViewCategoriaDetailApp.setText(modifyGenres(items.get(0).getGenres()));
        textViewVersionDetailApp.setText(items.get(0).getVersion());
        textViewReleaseDateDetailApp.setText(modifydate(items.get(0).getReleaseDate()));
        textViewCurrentVersionADetailpp.setText(modifydate(items.get(0).getCurrentVersionReleaseDate()));
        textViewDescriptionDetailApp.setText(items.get(0).getDescription());


        //horaTextViewCrearNuevo.setText(String.format("%02d:%02d", hourOfDay, minute));
    }

    private String modifydate(String date){

        String fecha = date.substring(0,10);

        String year = fecha.substring(0,4);

        String month = fecha.substring(5,7);

        String day = fecha.substring(8,10);

        String fechaModificada = day + "-" + month + "-" + year;

        return fechaModificada;


    }

    private String modifyGenres(List<String>genres){

        String cadena ="";

        for (int i=0; i<genres.size(); i++){

            cadena = genres.get(i) +", " + cadena;
        }

        if(cadena.contains(","))
            cadena = cadena.substring(0,cadena.length()-2);

        return cadena;

    }

    private String modifyPrice (double precio){

        String price = String.valueOf(precio);

        if(price.equals("0.0")){
            return price = "Free";
        }else {
            return price +"€";
        }

    }
    @Override
    public void conexionIncorrecta() {

        Toast.makeText(this, getString(R.string.conexionIncorrecta), Toast.LENGTH_LONG).show();

    }
}
