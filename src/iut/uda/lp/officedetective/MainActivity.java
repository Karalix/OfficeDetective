package iut.uda.lp.officedetective;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends SingleFragmenActivity {

	@Override
	protected Fragment createFragment() {
		return new CrimeFragment() ;
	}

	
}
