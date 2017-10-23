package com.example.jorge.pruebaquadram.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.jorge.pruebaquadram.Adapters.AppListAdapter;
import com.example.jorge.pruebaquadram.Class.AppObject;
import com.example.jorge.pruebaquadram.Class.Entry;
import com.example.jorge.pruebaquadram.Interfaces.IDataApp;
import com.example.jorge.pruebaquadram.R;
import com.example.jorge.pruebaquadram.Utils.ConexionManager;

import java.util.List;

/**
 * Created by jorge on 22/10/17.
 */

public class TopPaidFragment extends Fragment implements IDataApp {

    private RecyclerView recycler;
    private AppListAdapter adapter;
    private RecyclerView.LayoutManager lManager;

    public TopPaidFragment() {
        // Required empty public constructor
    }


    public static TopPaidFragment newInstance() {
        TopPaidFragment fragment = new TopPaidFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_top_paid, container, false);

        return view;

    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);


    }

    @Override
    public void onResume() {
        super.onResume();
        getPaidAppList();

    }

    private void getPaidAppList() {

        ConexionManager conexion = new ConexionManager("https://itunes.apple.com/");
        conexion.getPaidApp(this);
    }

    @Override
    public void conexionCorrecta(AppObject listApp) {

        List<Entry> items;

        items = listApp.getFeed().getEntry();

        recycler = (RecyclerView)getActivity().findViewById(R.id.recyclerFragmentPaid);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new AppListAdapter(items);
        recycler.setAdapter(adapter);

    }

    @Override
    public void conexionIncorrecta() {

        Toast.makeText(getActivity(), getString(R.string.conexionIncorrecta), Toast.LENGTH_LONG).show();

    }

}
