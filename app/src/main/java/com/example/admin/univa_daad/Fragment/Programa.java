package com.example.admin.univa_daad.Fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.univa_daad.Adapter.AdapterPrograma;
import com.example.admin.univa_daad.Models.ItemPrograma;
import com.example.admin.univa_daad.R;

import java.util.ArrayList;


public class Programa extends Fragment {
    Context context;
    Activity activity;
    View rootView;
    TextView textViewTitle;
    RecyclerView recyclerView;
    ArrayList<ItemPrograma> arrayList = new ArrayList<>();
    AdapterPrograma adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getContext();
        activity = getActivity();
        rootView = inflater.inflate(R.layout.fragment_programa,container,false);
        recyclerView = rootView.findViewById(R.id.recicleyViewId);
        textViewTitle = rootView.findViewById(R.id.text_title_id);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BuildRecyclerview();
    }

    private void BuildRecyclerview() {
        arrayList.clear();
        arrayList.add(new ItemPrograma("0","Fecha: jueves 27 de septiembre 2018","09:30","11:00","Registro"));
        arrayList.add(new ItemPrograma("0","Fecha: jueves 27 de septiembre 2018","09:30","11:00","Conferencia ALUMNI 1: Gerardo Lara Gómez (SEMADET) El desarrollo territorial y el uso de energías renovables"));
        adapter = new AdapterPrograma(context,activity,arrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}
