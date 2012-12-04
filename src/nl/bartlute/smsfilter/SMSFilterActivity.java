package nl.bartlute.smsfilter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SMSFilterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smsfilter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_smsfilter, menu);
		return true;
	}

}
