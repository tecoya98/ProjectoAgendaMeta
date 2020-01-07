package mx.edu.tesoem.isc.teco.projectoagendameta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import com.google.gson.Gson;
import java.util.ArrayList;

public class Lista extends AppCompatActivity {
        private EditText et1, et2, et3, et4;
        GridView lv ;
        ArrayList<String> lista;
        ArrayAdapter adaptador;

    TextView lbljson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lbljson=findViewById(R.id.lbljson);
            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getApplicationContext(),"administracion",null,1);
            lista = admin.llenar_v();
            Gson gson=new Gson();
        String cjson=gson.toJson(lista);
        lbljson.setText(cjson);
        }
    public void btnInicio(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
