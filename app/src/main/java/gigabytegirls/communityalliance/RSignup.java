package gigabytegirls.communityalliance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsignup);
        final EditText RName = (EditText) findViewById(R.id.RName);
        final EditText RUsername = (EditText) findViewById(R.id.RUsername);
        final EditText RPassword = (EditText) findViewById(R.id.RPassword);
        final EditText RPhone = (EditText) findViewById(R.id.RPhone);

        final Button RSignUp = (Button) findViewById(R.id.RRegister);

    }
}
