package com.example.farwa.customcomponents.Activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.farwa.customcomponents.Fragments.CustomRadioButtonFragment;
import com.example.farwa.customcomponents.Fragments.HolderFragment;
import com.example.farwa.customcomponents.R;

import butterknife.BindView;
import butterknife.ButterKnife;
public class MainActivity extends AppCompatActivity {

    FragmentTransaction ft;
    int visibleFragment;
    boolean doubleBackToExitPressed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, new HolderFragment()).commit();




    }

    public void openFragment(int n) {
        ft = getSupportFragmentManager().beginTransaction();

        switch (n) {

            case 0:
                visibleFragment = 0;
                ft.replace(R.id.container, new HolderFragment());
                break;

            case 1:
                visibleFragment = 1;
                ft.replace(R.id.container, new CustomRadioButtonFragment());
                break;


        }
        ft.commit();

    }

    @Override
    public void onBackPressed() {
        if(doubleBackToExitPressed){
            super.onBackPressed();
            finish();
            return;
        }
        else if(visibleFragment!=0) {
            openFragment(0);
        }
        else {
            this.doubleBackToExitPressed = true;
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPressed=false;
                }
            }, 2000);
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}