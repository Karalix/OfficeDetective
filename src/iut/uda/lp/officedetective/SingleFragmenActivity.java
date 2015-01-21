package iut.uda.lp.officedetective;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public abstract class SingleFragmenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crime_list);

		FragmentManager fragmentManager = getFragmentManager();
		if(fragmentManager.findFragmentById(R.id.crimeListFrameLayout) == null)
		{


			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			Fragment fragment = createFragment();

			fragmentTransaction.add(R.id.crimeListFrameLayout, fragment);

			fragmentTransaction.commit();
		}

	}

	protected abstract Fragment createFragment();
}
