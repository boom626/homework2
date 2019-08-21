package boom626.date21862.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toast toast=Toast.makeText(LoginActivity.this,"Welcome to My ToDo application!",Toast.LENGTH_SHORT);
        toast.show();

    }
}
