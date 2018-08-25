package com.example.admin.univa_daad.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.example.admin.univa_daad.Models.ItemPrograma;

import java.util.ArrayList;

public class AdapterPrograma extends RecyclerView.Adapter<AdapterPrograma.ViewHolder>{
    Context context;
    Activity activity;

    ArrayList<ItemPrograma> items;

    OnClick onClick;

    public AdapterPrograma(Context context,Activity activity, ArrayList<ItemPrograma> items){
        this.context = context;
        this.activity = activity;
        this.items = items;

        try{
            onclick = (OnClick) activity;
        }catch (ClassCastException e){
            throw new ClassCastException("It not work adapter onclick");
        }
    }

    public interface OnClick{
        void OnCLickPrograma(ItemPrograma item, int position);
    }

}
