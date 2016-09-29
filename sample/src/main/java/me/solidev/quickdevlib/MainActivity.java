package me.solidev.quickdevlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.solidev.quickdevlib.fragment.ExampleListFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_content, new ExampleListFragment())
                .commit();

    }
}
