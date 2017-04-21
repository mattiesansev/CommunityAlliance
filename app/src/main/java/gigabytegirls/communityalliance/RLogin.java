package gigabytegirls.communityalliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RLogin extends AppCompatActivity {
    public DatabaseHelper helper = new DatabaseHelper(this);
     private EditText RName;
    private EditText RUsername;
    private EditText RPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rlogin);
        RName = (EditText) findViewById(R.id.RName);
        RUsername = (EditText) findViewById(R.id.RUsername);
        RPassword = (EditText) findViewById(R.id.RPassword);
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
    public void LoginClick(View v) {


        //String namestr = RName.getText().toString();
        String userstr = RUsername.getText().toString();
        String passstr = RPassword.getText().toString();
        //String phonestr = RPhone.getText().toString();
        String password = helper.searchPass(userstr);
        Log.i("pass:", password);
        if (password.equals(passstr)) {
            Intent i = new Intent(RLogin.this, RChoices.class);
            RLogin.this.startActivity(i);
        } else {
            Toast temp = Toast.makeText(RLogin.this, "Incorrect username and/or password", Toast.LENGTH_SHORT);
            temp.show();
        }
    }

}
