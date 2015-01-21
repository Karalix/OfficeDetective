package iut.uda.lp.officedetective;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class CrimeListActivity extends SingleFragmenActivity {

	@Override
	protected Fragment createFragment() {
		return new CrimeListFragment() ;
	}

	
}
