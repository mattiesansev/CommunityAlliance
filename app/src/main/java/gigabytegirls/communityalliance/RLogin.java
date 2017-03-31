package gigabytegirls.communityalliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rlogin);
        final EditText RName = (EditText) findViewById(R.id.RName);
        final EditText RUsername = (EditText) findViewById(R.id.RUsername);
        final EditText RPassword = (EditText) findViewById(R.id.RPassword);
        final Button RLogin = (Button) findViewById(R.id.RLogin);
        final TextView registerLink = (TextView) findViewById(R.id.registerHere);

        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(RLogin.this, RSignup.class);
                RLogin.this.startActivity(registerIntent);

            }
        });

    }

}
