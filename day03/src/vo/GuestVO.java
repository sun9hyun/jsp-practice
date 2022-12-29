package vo;

public class GuestVO {
	private int guestNumber;
	private String guestName;
	private String guestBirth;
	
	public GuestVO() {;}

	public GuestVO(int guestNumber, String gusetName, String gusetBirth) {
		super();
		this.guestNumber = guestNumber;
		this.guestName = gusetName;
		this.guestBirth = gusetBirth;
	}

	public int getGuestNumber() {
		return guestNumber;
	}

	public void setGuestNumber(int guestNumber) {
		this.guestNumber = guestNumber;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestBirth() {
		return guestBirth;
	}

	public void setGuestBirth(String guestBirth) {
		this.guestBirth = guestBirth;
	}

	@Override
	public String toString() {
		return "GuestVO [guestNumber=" + guestNumber + ", guestName=" + guestName + ", guestBirth=" + guestBirth + "]";
	}



}
