package iut.uda.lp.officedetective;

import java.util.ArrayList;
import java.util.List;

public class CrimeLab {

	private static CrimeLab instance = null ;
	private List<Crime> listCrimes ;
	
	private CrimeLab()
	{
		listCrimes = new ArrayList<Crime>() ;
		for (int i = 0; i < 5; i++)
		{
			listCrimes.add(new Crime());
		}
	}
	
	public static CrimeLab getInstance()
	{
		if(instance == null)
		{
			instance = new CrimeLab();
		}
		
		return instance ;
	}
	
	public List<Crime> getListCrimes() {
		return listCrimes;
	}
}
