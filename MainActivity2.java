package id.ac.id.telkomuniversity.tass.praktikum5;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 {

    TextView Username,Password;

    @Override
    public <ViewV> void onClick(ViewV) {


        if (Username.getText().toString().equals("admin") &&

                Username.getText().toString().equals("admin"))


            Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();

        else {

            Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",

                    Toast.LENGTH_SHORT).show();
            Passwor1.setVisibility(ViewVISIBLE);

            tx1.setBackgroundColor(Color.RED);


            tx1.setText(Integer.toString(counter));



            if (counter == 0) {

                b1.setEnabled(false);

            }

        }



    }

});

}


