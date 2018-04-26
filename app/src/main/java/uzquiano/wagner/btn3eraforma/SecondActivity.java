package uzquiano.wagner.btn3eraforma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private View btn;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        texto = (TextView) findViewById(R.id.textViewMain);
        Bundle bundle = getIntent().getExtras();
        bundle = null;
        if(bundle != null){
         String saludo = bundle.getString("saludo");
            Toast.makeText(SecondActivity.this, saludo, Toast.LENGTH_LONG).show();
            texto.setText(saludo);
        } else {
            Toast.makeText(SecondActivity.this, "Esta vacio", Toast.LENGTH_LONG).show();
        }
        setContentView(R.layout.secondactivity);

        btn = (Button) findViewById(R.id.buttonNext);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity3.class);
                //intent.putExtra("saludo", SALUDO);
                startActivity(intent);
            }

        });
    }
}
