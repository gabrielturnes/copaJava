package com.example.aluno.copadomundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarPlacar(View view){
        int botao = view.getId();
        TextView placarNey = (TextView) findViewById(R.id.placar1);
        TextView placarLux = (TextView) findViewById(R.id.placar2);
        String valorTextView = placarNey.getText().toString();
        String valorTextView2 = placarLux.getText().toString();
        int i = Integer.parseInt(valorTextView);
        int x = Integer.parseInt(valorTextView2);

        switch (botao){
            case R.id.menos1:
                if(i > 0) {
                    i--;
                    placarNey.setText("" + i);
                }
                break;

            case R.id.soma1:
                i++;
                placarNey.setText("" + i);
                break;

            case R.id.menos2:
                if(x > 0) {
                    x--;
                    placarLux.setText("" + x);
                }
                break;

            case R.id.soma2:
                x++;
                placarLux.setText("" + x);
                break;
        }
    }
}
