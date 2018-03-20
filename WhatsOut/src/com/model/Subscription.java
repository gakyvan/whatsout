package com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
*
* @author Rupendra MAHARJAN
* Date: 03/19/2018
* Description: EventCategory Information
*/

public class Subscription {
	private int id;
	private LocalDate subscriptionDate;
	private List<EventCategory> eventCategoryList = new ArrayList<>();
	
	public Subscription() {
		
	}

	public Subscription(int id, LocalDate subscriptionDate) {
		super();
		this.id = id;
		this.subscriptionDate = subscriptionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	
	public void addEventCategory(EventCategory evntCategory) {
		eventCategoryList.add(evntCategory);
	}
	
	public List<EventCategory> getEventCategoryList(){
		return eventCategoryList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((subscriptionDate == null) ? 0 : subscriptionDate.hashCode());
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
		Subscription other = (Subscription) obj;
		if (id != other.id)
			return false;
		if (subscriptionDate == null) {
			if (other.subscriptionDate != null)
				return false;
		} else if (!subscriptionDate.equals(other.subscriptionDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subscription [id=" + id + ", subscriptionDate=" + subscriptionDate + ", eventCategoryList="
				+ eventCategoryList + "]";
	}
	
	
	
}
