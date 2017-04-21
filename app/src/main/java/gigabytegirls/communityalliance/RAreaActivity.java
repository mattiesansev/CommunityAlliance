package gigabytegirls.communityalliance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rarea);

        final EditText RUsername = (EditText) findViewById(R.id.RUsername);
        //final EditText RPhone = (EditText) findViewById(R.id.RPhone);
        final TextView welcomeMessage = (TextView) findViewById(R.id.welcome);
    }
}
