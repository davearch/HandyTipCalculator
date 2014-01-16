package archuleta.azslr.handytipcalculator;

import archuleta.azslr.handytipcalculator.MainActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class SplitTipListener implements OnItemSelectedListener {
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		switch (pos){
		case 0: MainActivity.SplitTipBy = 1.00;
			break;
		case 1: MainActivity.SplitTipBy = 2.00;
			break;
		case 2: MainActivity.SplitTipBy = 3.00;
			break;
		case 3: MainActivity.SplitTipBy = 4.00;
			break;
		case 4: MainActivity.SplitTipBy = 5.00;
			break;
		case 5: MainActivity.SplitTipBy = 6.00;
			break;
		case 6: MainActivity.SplitTipBy = 7.00;
			break;
		case 7: MainActivity.SplitTipBy = 8.00;
			break;
		case 8: MainActivity.SplitTipBy = 9.00;
			break;
		case 9: MainActivity.SplitTipBy = 10.00;
			break;
		case 10: MainActivity.SplitTipBy = 11.00;
			break;
		case 11: MainActivity.SplitTipBy = 12.00;
			break;
		case 12: MainActivity.SplitTipBy = 13.00;
			break;
		case 13: MainActivity.SplitTipBy = 14.00;
			break;
		case 14: MainActivity.SplitTipBy = 15.00;
			break;
		case 15: MainActivity.SplitTipBy = 16.00;
			break;
		default: MainActivity.SplitTipBy = 1.00;
			break;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void onNothingSelected(AdapterView parent) {
		//
	}

}
