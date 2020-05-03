package bean;

import java.util.Date;

public class Personal_Info {
    private String phonenumber;
	private Date birthday;
	private String gender;
	private String status;
	private String email;
	private String livesIn;
	private Date memberSince;
	
	public Date getmemberSince() {
		// TODO Auto-generated method stub
		return memberSince;
	}
	 public void setMemberSince(Date memberSince){
	        this.memberSince=memberSince;
	        
	    }
	 
	public String getlivesIn() {
		// TODO Auto-generated method stub
		return livesIn;
	}
	
	 public void setLivesIn(String livesIn){
	        this.livesIn=livesIn;
	        
	    }

	public Date getBirthday() {
		// TODO Auto-generated method stub
		return birthday;
	}
	
	public Date setBirthday(Date birthday) {
		// TODO Auto-generated method stub
		return this.birthday = birthday;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	public String setGender(String gender) {
		// TODO Auto-generated method stub
		return this.gender = gender;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}
	
	public String setStatus(String status) {
		// TODO Auto-generated method stub
		return this.status = status;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	
	public String setEmail(String email) {
		// TODO Auto-generated method stub
		return this.email = email;
	}

	public String getPhonenumber() {
		// TODO Auto-generated method stub
		return phonenumber;
	}
	
	public String setPhonenumber(String number) {
		// TODO Auto-generated method stub
		return this.phonenumber = number;
	}

}
