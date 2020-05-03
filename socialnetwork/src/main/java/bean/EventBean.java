package bean;

import java.awt.image.BufferedImage;
import java.sql.Date;

import javax.servlet.http.Part;

public class EventBean {
	 String title;
	 String description;
	 String price;
	 String city;
	 String date;
	 String event_start;
	 String event_end;
	 String venue;
	 String seats;
	 Part image;
	 String event_organizer;
	 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEvent_start() {
		return event_start;
	}
	public void setEvent_start(String event_start) {
		this.event_start = event_start;
	}
	public String getEvent_end() {
		return event_end;
	}
	public void setEvent_end(String event_end) {
		this.event_end = event_end;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public Part getImage() {
		return image;
	}
	public void setImage(Part image) {
		this.image = image;
	}
	public String getEvent_organizer() {
		return event_organizer;
	}
	public void setEvent_organizer(String event_organizer) {
		this.event_organizer = event_organizer;
	}
	 
	 

}
