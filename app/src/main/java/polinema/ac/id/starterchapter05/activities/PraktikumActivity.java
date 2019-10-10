package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;

import polinema.ac.id.starterchapter05.Fragments.DipsFragment;
import polinema.ac.id.starterchapter05.Fragments.HandStandFragment;
import polinema.ac.id.starterchapter05.Fragments.PushUpFragment;
import polinema.ac.id.starterchapter05.R;

public class PraktikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_placeholder,new PushUpFragment());
        fragmentTransaction.commit();
    }

    public void handlePushupFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_placeholder,new PushUpFragment(),"PUSHUP_FRAGMENT");
        fragmentTransaction.commit();
    }

    public void handleDipsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_placeholder,new DipsFragment(),"DIPS_FRAGMENT");
        fragmentTransaction.commit();
    }

    public void handleHandstandFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_placeholder,new HandStandFragment(),"HANDSTAND_FRAGMENT");
        fragmentTransaction.commit();
        }
    }

