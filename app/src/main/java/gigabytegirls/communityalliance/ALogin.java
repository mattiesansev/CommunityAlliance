package gigabytegirls.communityalliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ALogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alogin);
    }
    public void onButtonClick (View v){
        EditText a = (EditText) findViewById(R.id.AUser);
        String s = a.getText().toString();
        if(v.getId() == R.id.ALogin) {
            Intent i = new Intent(ALogin.this, AUserSpace.class);
            i.putExtra("Username", s);
            startActivity(i);
        }
    }
}
