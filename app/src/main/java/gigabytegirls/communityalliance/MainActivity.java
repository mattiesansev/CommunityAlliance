package gigabytegirls.communityalliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToRLogin (View view){
        Intent i = new Intent(MainActivity.this, RLogin.class);
        startActivity(i);
    }
    public void goToRSignUp (View v){
        Intent i = new Intent(MainActivity.this, RSignUp.class);
        startActivity(i);
    }
    public void goToALogin (View v){
        Intent i = new Intent(MainActivity.this, ALogin.class);
        startActivity(i);
    }
    public void goToASignUp (View v){
        Intent i = new Intent(MainActivity.this, ASignUp.class);
        startActivity(i);
    }

}

