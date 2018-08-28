package com.example.admin.univa_daad;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.admin.univa_daad.Fragment.Programa;
import com.example.admin.univa_daad.Models.ItemViewFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Context context = this;
    Activity activity = this;

    ImageView univaLogo, daadLogo,mapa,buttonPrograma;
    Uri uri =null;
    Intent intent = null;
    String labelLocation = "UNIVA";
    String ubicacion = "geo:<" + 20.656963+ ">,<" + -103.419968+ ">?q=<" + 20.656963+ ">,<" + -103.419968+ ">(" + labelLocation + ")";
    ArrayList<ItemViewFragment> fragments = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        univaLogo = findViewById(R.id.image_univa);
        daadLogo = findViewById(R.id.image_daad);
        mapa = findViewById(R.id.image_mapa);
        buttonPrograma = findViewById(R.id.button_programa);

        fragments.add(new ItemViewFragment(0,"",new Programa()));

        univaLogo.setOnClickListener(this);
        daadLogo.setOnClickListener(this);
        mapa.setOnClickListener(this);
        buttonPrograma.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_univa:
                uri = Uri.parse("http://www.univa.mx/");
                intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            case R.id.image_daad:
                uri = Uri.parse("https://www.daad.mx/es/");
                intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            case R.id.image_mapa:
                uri = Uri.parse(ubicacion);
                intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            case R.id.button_programa:
                Toast.makeText(context, "abrir fragment", Toast.LENGTH_SHORT).show();
                Programa programa = new Programa();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_programa,programa).commit();
                break;
        }
    }
}
