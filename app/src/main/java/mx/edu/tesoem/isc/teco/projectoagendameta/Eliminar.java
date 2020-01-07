package mx.edu.tesoem.isc.teco.projectoagendameta;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Eliminar extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);
        et1 = (EditText) findViewById(R.id.editText1);
        EditText mostrardatos = (EditText) findViewById(R.id.editText1);
    }

    public void baja(View v) {

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,

                "administracion", null, 1);

        SQLiteDatabase bd = admin.getWritableDatabase();

        String dni = et1.getText().toString();


        int cant = bd.delete("usuario", "dni=" + dni, null);

        bd.close();

        et1.setText("");

        if (cant == 1)

            Toast.makeText(this, "eliminado",

                    Toast.LENGTH_SHORT).show();

        else

            Toast.makeText(this, "No existe usuario",

                    Toast.LENGTH_SHORT).show();
    }

    public void btnInicio(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
