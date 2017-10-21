package br.com.jotaceassis.shiftpersistencia;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class UsuarioActivity extends AppCompatActivity {

    private SharedPreferences sp;

    private EditText etUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        sp = getPreferences(MODE_PRIVATE);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etUsuario.setText(sp.getString("usuario", ""));

        etUsuario.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                SharedPreferences.Editor e = sp.edit();
                e.putString("usuario", editable.toString());
                e.apply();
            }
        });
    }

    public void conectar(View v) {

    }

    public void limpar(View v) {

    }
}
