package in.nammaapp.itskannada;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EngOrKanUser extends Activity {
	SharedPreferences pref;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eng_or_kan_user);
		Button btnKannada = (Button) findViewById(R.id.btnKanUserChoice);
		Button btnEnglish = (Button) findViewById(R.id.btnEngUserChoice);
		pref = getApplicationContext().getSharedPreferences(getResources().getString(R.string.appPrefFIle), Context.MODE_PRIVATE);
		btnKannada.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pref.edit().putString("kannada", "true");
				pref.edit().commit();
				Intent i = new Intent(EngOrKanUser.this, SignUpActivity.class);
				startActivity(i);
			}
		});
		btnEnglish.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pref.edit().putString("kannada", "false");
				pref.edit().commit();
				Intent i = new Intent(EngOrKanUser.this, SignUpActivity.class);
				startActivity(i);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eng_or_kan_user, menu);
		return true;
	}

}
