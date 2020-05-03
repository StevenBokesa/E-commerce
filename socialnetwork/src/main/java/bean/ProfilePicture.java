package bean;

import javax.servlet.http.Part;

public class ProfilePicture {

	private Part avatar;
	private Part background;
	private String email;

	public Part getAvatar() {
		return avatar;
	}
	public void setAvatar(Part avatar) {
		this.avatar = avatar;
	}
	public Part getBackground() {
		return background;
	}
	public void setBackground(Part background) {
		this.background = background;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String username) {
		this.email = username;
	}
}
