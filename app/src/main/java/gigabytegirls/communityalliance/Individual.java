package gigabytegirls.communityalliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Individual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);
    }
    public void food(View v){

    }
    public void shelter(View v){

    }
    public void ally(View v){

    }
    public void money(View v){

    }
    public void onNext(View v){
        Intent i = new Intent(Individual.this, details.class);
        startActivity(i);}
     public void go(View v) {
         Intent i = new Intent(Individual.this, AUserSpace.class);
         startActivity(i);
     }



}
