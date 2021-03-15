package com.disappears.android.agora.openvcall.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.disappears.android.agora.R;
import com.disappears.android.agora.openvcall.model.ConstantApp;

public class SettingsActivity extends AppCompatActivity {
    private VideoProfileAdapter mVideoProfileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        initUi();
    }

    private void initUi() {
        RecyclerView v_profiles = (RecyclerView) findViewById(R.id.profiles);
        v_profiles.setHasFixedSize(true);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        int prefIndex = pref.getInt(ConstantApp.PrefManager.PREF_PROPERTY_PROFILE_IDX, ConstantApp.DEFAULT_PROFILE_IDX);

        mVideoProfileAdapter = new VideoProfileAdapter(this, prefIndex);
        mVideoProfileAdapter.setHasStableIds(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        v_profiles.setLayoutManager(layoutManager);

        v_profiles.setAdapter(mVideoProfileAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int id = item.getItemId();
        if (id == R.id.confirm) {
            doSaveProfile();

            onBackPressed();

            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void doSaveProfile() {
        int profileIndex = mVideoProfileAdapter.getSelected();

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(ConstantApp.PrefManager.PREF_PROPERTY_PROFILE_IDX, profileIndex);
        editor.apply();
    }
}
