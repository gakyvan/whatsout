package com.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
*
* @author Rupendra MAHARJAN
* Created Date: March 19, 2018
* Description: Event Information
*/
public class Event {
	
	private int id;
	private String title;
	private String description;
	private String logo;
	private LocalDate createdOn;
	private LocalDate happeningOn;
	private LocalTime time;
	private LocalDate endDate;
	private int capacity;
		
	private Address address;
	private EventCategory eventCategory;
	private WhatsOutUser eventCreator;
	private PictureGallery photoGallery;
	private List<Comment> commentList = new ArrayList<>();
	private List<Rating> ratingList = new ArrayList<>();
	private List<EventAttendance> eventAttendanceList = new ArrayList<>();
	
	public Event() {
		address = new Address();
		eventCategory = new EventCategory();
		eventCreator = new WhatsOutUser();
		photoGallery = new PictureGallery();
	}

	public Event(int id, String title, String description, String logo, LocalDate createdOn, LocalDate happeningOn,
			LocalTime time, LocalDate endDate, Address address, int capacity, EventCategory eventCategory,
			WhatsOutUser eventCreator) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.logo = logo;
		this.createdOn = createdOn;
		this.happeningOn = happeningOn;
		this.time = time;
		this.endDate = endDate;
		this.address = address;
		this.capacity = capacity;
		this.eventCategory = eventCategory;
		this.eventCreator = eventCreator;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getHappeningOn() {
		return happeningOn;
	}

	public void setHappeningOn(LocalDate happeningOn) {
		this.happeningOn = happeningOn;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public EventCategory getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(EventCategory eventCategory) {
		this.eventCategory = eventCategory;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public List<Rating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}

	public void setEventCreator(WhatsOutUser creator) {
		eventCreator = creator;
	}
	
	public WhatsOutUser getEventCreator() {
		return eventCreator;
	}
	
	public void setEventAttendanceList(EventAttendance eventAttendance) {
		eventAttendanceList.add(eventAttendance);
	}
	
	public List<EventAttendance> getEventAttendanceList(){
		return eventAttendanceList;
	}
	
	public void setPhotoGallery(PictureGallery photoGallery) {
		this.photoGallery = photoGallery;
	}
	
	public PictureGallery getPhotoGallery() {
		return this.photoGallery;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", description=" + description + ", logo=" + logo
				+ ", createdOn=" + createdOn + ", happeningOn=" + happeningOn + ", time=" + time + ", endDate="
				+ endDate + ", address=" + address + ", capacity=" + capacity + ", eventCategory=" + eventCategory
				+ ", commentList=" + commentList + ", ratingList=" + ratingList + "]";
	}
}
