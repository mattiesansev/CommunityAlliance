package gigabytegirls.communityalliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ASignUp extends AppCompatActivity {
    boolean buis = false;
    boolean indiv = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asign_up);
    }
    public void onBuisness (View v){
        buis = true;
    }
    public void onIndividual(View v){
        indiv =  true;
    }
    public void onNext(View v){
        if(buis == true) {
            Intent i = new Intent(ASignUp.this, Individual.class);
            startActivity(i);
        }
        else if(indiv == true){
            Intent i = new Intent(ASignUp.this, Buisness.class);
            startActivity(i);
        }
        else{
            Toast temp = Toast.makeText(ASignUp.this, "Please select one option", Toast.LENGTH_SHORT);
            temp.show();
        }

    }
}
