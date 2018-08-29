package com.example.admin.univa_daad;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.admin.univa_daad.Fragment.Programa;
import com.example.admin.univa_daad.Models.ItemViewFragment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class ProgramaActivity extends AppCompatActivity {
    Context context = this;
    Activity activity = this;

    FragmentManager fm;
    ArrayList<ItemViewFragment> fragments = new ArrayList<>();
    FrameLayout content;
    int intView = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa);


        content = findViewById(R.id.content_id);
        fragments.add(new ItemViewFragment(0, "", new Programa()));
        fm = getSupportFragmentManager();
        changeView(0);
    }

    private void changeView(int position){
        if (intView != position){
            ItemViewFragment frag = fragments.get(position);
            fm.beginTransaction().replace(content.getId(), frag.getFragment()).commit();
            intView = position;
        }
    }

    public void onClickAgendar(View view){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String strDate = sdf.format(cal.getTime());
        switch (view.getId()) {
            case R.id.linearFecha:
                Toast.makeText(context, "onClickAgendar: " +strDate, Toast.LENGTH_SHORT).show();
                break;
            case R.id.name_event_id:
                Toast.makeText(context, "onClickAgendar2222: " +strDate, Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void onClickDescribe(View view){
        switch (view.getId()) {
            case R.id.descrip_event_id:
                Toast.makeText(context, "onClickDescribe", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
