package iut.uda.lp.officedetective;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class CrimeListAdapter extends ArrayAdapter<Crime> {


	public CrimeListAdapter(Context applicationContext, List<Crime> list) {
		super(applicationContext,0, list);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final Crime currentCrime = getItem(position);
		
		if(convertView == null)
		{

			LayoutInflater li = LayoutInflater.from(getContext());
			convertView = li.inflate(R.layout.list_item_crime, null);
			
		}
		
		TextView title = (TextView)convertView.findViewById(R.id.crimeTitle);
		title.setText(currentCrime.getTitle());
		
		TextView date = (TextView)convertView.findViewById(R.id.crimeDate);
		date.setText(currentCrime.getDate().toString());
		
		CheckBox cb = (CheckBox)convertView.findViewById(R.id.listCrimeResolvedCheckBox);
		cb.setChecked(currentCrime.isResolved());
		
		
		return convertView ;
	}

}
