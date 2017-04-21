package gigabytegirls.communityalliance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AUserSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auser_space);
        String username = getIntent().getStringExtra("Username");
        //TextView tv = (TextView)findViewById(R.id.AUser); AUser is a tv for Welcome, (tv)
        //tv.setText(username);
    }
}
