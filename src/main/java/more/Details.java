package more;

public class Details {
	private String date;
	private int passengers;
	private String srcdestination;
	private String enddestination;
	
	public Details() {
		
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public String getSrcdestination() {
		return srcdestination;
	}
	public void setSrcdestination(String srcdestination) {
		this.srcdestination = srcdestination;
	}
	public String getEnddestination() {
		return enddestination;
	}
	public void setEnddestination(String enddestination) {
		this.enddestination = enddestination;
	}
	@Override
	public String toString() {
		return "Details [date=" + date + ", passengers=" + passengers + ", srcdestination=" + srcdestination
				+ ", enddestination=" + enddestination + "]";
	}
}
