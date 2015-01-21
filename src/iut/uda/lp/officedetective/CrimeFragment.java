package iut.uda.lp.officedetective;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class CrimeFragment extends Fragment {
	
	private Crime awfulCrime;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		String id = getActivity().getIntent().getStringExtra("crimeId");
		for(Crime c : CrimeLab.getInstance().getListCrimes())
		{
			if(id.equals(c.getId().toString()))
			{
				awfulCrime = c ;
				break ;
			}
		}
		if(awfulCrime == null)
		{
			awfulCrime = new Crime();
			awfulCrime.setTitle("");
		}
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View returnView = inflater.inflate(R.layout.fragment_crime, container, false);
		EditText crimeTitle = (EditText) returnView.findViewById(R.id.editCrimeTitle);
		Button crimeDate = (Button) returnView.findViewById(R.id.crimeDateButton);
		CheckBox crimeResolvedCheckBox = (CheckBox) returnView.findViewById(R.id.resolvedCrimeCheckBox);
		crimeTitle.setText(awfulCrime.getTitle());
		crimeDate.setText(awfulCrime.getDate().toString());
		crimeResolvedCheckBox.setChecked(awfulCrime.isResolved());
		
		return returnView;
	}
	
	@Override
	public void onDestroyView() {
		EditText crimeTitle = (EditText) this.getView().findViewById(R.id.editCrimeTitle);
		CheckBox checkResolved = (CheckBox)getView().findViewById(R.id.resolvedCrimeCheckBox);
		awfulCrime.setTitle(crimeTitle.getText().toString());
		awfulCrime.setResolved(checkResolved.isChecked());
		
		super.onDestroyView();
	}

}
