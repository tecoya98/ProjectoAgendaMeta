package mx.edu.tesoem.isc.teco.projectoagendameta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void btnEliminar(View v){
        Intent intent = new Intent(this,Eliminar.class);
        startActivity(intent);
        this.finish();
    }
    public void btncAgregar(View v){
        Intent intent = new Intent(this,Agregar.class);
        startActivity(intent);
        this.finish();
    }
    public void btnLista(View v) {
        Intent intent = new Intent(this,Lista.class);
        startActivity(intent);
        this.finish();
    }
}
