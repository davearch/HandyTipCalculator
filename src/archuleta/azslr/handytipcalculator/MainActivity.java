package archuleta.azslr.handytipcalculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity {
	private Spinner splitByList, percentage;
	public static double percentTip;
	public static double SplitTipBy;
	DecimalFormat money = new DecimalFormat("0.00");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		money.setRoundingMode(RoundingMode.UP);
		final EditText edit_message = (EditText) findViewById(R.id.edit_message);
		/*
		 * Users select what percentage of the check to tip
		 */
		percentage = (Spinner) findViewById(R.id.percentage);
		String[] percentList = new String[] {
				"0%", "5%", "10%", "15%", "16%", "18%", "20%", "25%", "30%"
		};
		ArrayAdapter<CharSequence> perAdapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item, percentList);
		perAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		percentage.setAdapter(perAdapter);
		percentage.setOnItemSelectedListener(new PercentageListener());
		/*
		 * Users select how many times to split tip (among friends, dinner guests, etc.)
		 */
		splitByList = (Spinner) findViewById(R.id.splitBy);
		String[] list = new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" 
		};
		ArrayAdapter<CharSequence> dataAdapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		splitByList.setAdapter(dataAdapter);
		splitByList.setOnItemSelectedListener(new SplitTipListener());
		
		final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final Button button = (Button) findViewById(R.id.calculate_button);
		/*
		 * button listener calculates tip
		 */
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v){
				try {
					double check = Double.valueOf(edit_message.getText().toString());
					double tip = (check/100.00*percentTip)/SplitTipBy;
					String stringTip = money.format(tip);
					AlertDialog finalAnswer = alert.create();
					finalAnswer.setTitle("Your Tip is:");
					finalAnswer.setMessage("$"+stringTip);
					finalAnswer.show();
				} catch (NumberFormatException e){
					AlertDialog nullDialog = alert.create();
					nullDialog.setTitle("Error");
					nullDialog.setMessage("Please Enter a Number");
					nullDialog.show();
				}
			}
		});
	
	} // end of method onCreate
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	} // end of method onCreateOptionsMenu
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		// Handle presses on the action bar items
		if (item.getItemId() == R.id.About){
			Toast.makeText(this, "Developed by David Archuleta Jr.", Toast.LENGTH_LONG).show();
			return true;
		} else {
			return super.onOptionsItemSelected(item);
		}
	}
} // end of class MainActivity
