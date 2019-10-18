package id.ac.polinema.bismillahuts.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.bismillahuts.Fragment.DownloadFragment;
import id.ac.polinema.bismillahuts.Fragment.HomeFragment;
import id.ac.polinema.bismillahuts.R;

public class NavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        loadFragment(new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_home:
                fragment = new HomeFragment();
                break;
            case R.id.action_download:
                fragment = new DownloadFragment();
                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
