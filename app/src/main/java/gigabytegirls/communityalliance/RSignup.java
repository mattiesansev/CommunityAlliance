package gigabytegirls.communityalliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RSignup extends AppCompatActivity {
    RContact c = new RContact();
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsignup);


    }
    public void onClick(View v){
        if(v.getId() == R.id.RRegister){
            final EditText RName = (EditText) findViewById(R.id.RName);
            final EditText RUsername = (EditText) findViewById(R.id.RUsername);
            final EditText RPassword = (EditText) findViewById(R.id.RPassword);
            //final EditText RPhone = (EditText) findViewById(R.id.RPhone);

            String namestr = RName.getText().toString();
            String userstr = RUsername.getText().toString();
            String passstr = RPassword.getText().toString();
            //String phonestr = RPhone.getText().toString();
            //add in check passwords if they enter twice

            //insert details in database
            RContact c = new RContact();
            c.setRName(namestr);
            c.setRPass(passstr);
            c.setRUser(userstr);
            //c.setRPhone(phonestr);

            helper.insertContact(c);
            Log.i("contact inserted: ", c.toString());
            Intent i = new Intent(RSignup.this, RChoices.class);
            RSignup.this.startActivity(i);

        }
    }
}
