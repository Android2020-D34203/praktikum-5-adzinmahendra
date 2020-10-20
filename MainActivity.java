package id.ac.id.telkomuniversity.tass.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Username,Password;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(EditText);
        Password = findViewById(EditText);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button:
                        Intent sendData1 = new Intent(MainActivity.this,MainActivity2.class);
                        sendData1.putExtra("username", Username.getText());
                        startActivity(sendData1);
                        break;

                    case R.id.button2:
                        Bundle setData = new Bundle();
                        Intent sendData2 = new Intent(MainActivity.this,MainActivity2.class);
                        setData.putString("pasword", Password.getText().toString());
                        sendData2.putExtras(setData);
                        startActivity(sendData2);
                        break;
                }
            }
        });

    }
