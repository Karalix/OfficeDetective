package iut.uda.lp.officedetective;

import java.util.Date;
import java.util.UUID;

public class Crime {

	private String title;
	
	private final UUID id;
	
	private Date dateEmission = new Date(System.currentTimeMillis());
	
	private boolean resolved = false;
	
	public Date getDate() {
		return dateEmission;
	}
	
	public boolean isResolved() {
		return resolved;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setResolved(boolean resolved)
	{
		this.resolved = resolved ;
	}
	
	public Crime() {
		this.title = "Default" ;
		this.id = UUID.randomUUID();
	}
}
