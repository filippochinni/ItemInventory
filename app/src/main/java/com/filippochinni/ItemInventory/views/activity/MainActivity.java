package com.filippochinni.ItemInventory.views.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.filippochinni.ItemInventory.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

	protected BottomNavigationView mNavView;
	protected NavController mNavController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Setup Navigation
		this.setupNavigation();
	}

	private void setupNavigation() {
		this.mNavView = findViewById(R.id.nav_view);
		this.mNavController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

		AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
				R.id.navigation_visualize,
				R.id.navigation_search,
				R.id.navigation_add
		).build();
		NavigationUI.setupActionBarWithNavController(this, this.mNavController, appBarConfiguration);
		NavigationUI.setupWithNavController(this.mNavView, this.mNavController);
	}

}
