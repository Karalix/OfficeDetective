package iut.uda.lp.officedetective;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class CrimeListFragment extends ListFragment {
	
	CrimeListAdapter adapter ;

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = new Intent(getActivity(), MainActivity.class);
		intent.putExtra("crimeId", CrimeLab.getInstance().getListCrimes().get(position).getId().toString());
		startActivity(intent);
		super.onListItemClick(l, v, position, id);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setHasOptionsMenu(true);
		
		adapter = new CrimeListAdapter(getActivity(), CrimeLab.getInstance().getListCrimes());
		setListAdapter(adapter);
		
		
		
	}
	
	@Override
	public void onResume() {
		super.onResume();
		getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
		getListView().setMultiChoiceModeListener(new CustomMultiChoiceListener(getActivity()));
		adapter.notifyDataSetChanged();
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.layout.menu_fragment_list_crimes, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == R.id.new_crime)
		{
			Crime newCrime = new Crime();
			CrimeLab.getInstance().getListCrimes().add(newCrime);
			
			Intent intent = new Intent(getActivity(), MainActivity.class);
			intent.putExtra("crimeId", newCrime.getId().toString());
			startActivity(intent);
			
		}
		return super.onOptionsItemSelected(item);
	}
}
