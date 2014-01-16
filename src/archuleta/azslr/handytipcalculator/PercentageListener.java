package archuleta.azslr.handytipcalculator;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class PercentageListener implements OnItemSelectedListener {
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		switch(pos) {
		case 0: MainActivity.percentTip = 0.00;
			break;
		case 1: MainActivity.percentTip = 5.00;
			break;
		case 2: MainActivity.percentTip = 10.00;
			break;
		case 3: MainActivity.percentTip = 15.00;
			break;
		case 4: MainActivity.percentTip = 16.00;
			break;
		case 5: MainActivity.percentTip = 18.00;
			break;
		case 6: MainActivity.percentTip = 20.00;
			break;
		case 7: MainActivity.percentTip = 25.00;
			break;
		case 8: MainActivity.percentTip = 30.00;
			break;
		default: MainActivity.percentTip = 15.00;
			break;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void onNothingSelected(AdapterView parent) {
		//
	}

}
