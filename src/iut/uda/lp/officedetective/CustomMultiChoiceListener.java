package iut.uda.lp.officedetective;

import android.app.Activity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;

public class CustomMultiChoiceListener implements MultiChoiceModeListener{
	
	private Activity activity ;
	
	public CustomMultiChoiceListener(Activity a) {
		this.activity = a ;
	}

	@Override
	public boolean onCreateActionMode(ActionMode mode, Menu menu) {
		MenuInflater inflater = activity.getMenuInflater();
	    inflater.inflate(R.layout.menu_fragment_list_crime_delete, menu);
		return true;
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
		return false;
	}

	@Override
	public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
		return false;
	}

	@Override
	public void onDestroyActionMode(ActionMode mode) {
	}

	@Override
	public void onItemCheckedStateChanged(ActionMode mode, int position,
			long id, boolean checked) {		
	}

}
