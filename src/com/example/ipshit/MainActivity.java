package com.example.ipshit;

import entidades.producto;
import logica.DaoProducto;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
// bien esta parte Leo, pero lo demás ...mmm... se supone el tuyo es el proyecto principal.. el raiz... mejórenlo para el examen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    // Creamos los metodos de los ImageButton
    
    
    public void sedes(View v){
    	 Intent i = new Intent(this, sedes.class);
    	startActivity(i);
    	
    }
}
