package in.nammaapp.itskannada;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyPointsDisplayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_points_display_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_points_display, menu);
		return true;
	}

}