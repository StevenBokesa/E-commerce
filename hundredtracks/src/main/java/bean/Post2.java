package bean;

public class Post2 {

	private int post_id;
	private int user_id;
	private String body;
	private String post_time;
	
	public Post2() {
		super();
	}
	
	public Post2(int post_id, int user_id, String body, String post_time) {
		super();
		this.post_id = post_id;
		this.user_id = user_id;
		this.body = body;
		this.post_time = post_time;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPost_time() {
		return post_time;
	}

	public void setPost_time(String post_time) {
		this.post_time = post_time;
	}
	
}
