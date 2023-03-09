package com.prajeey.youtubers.Entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "youtuber_table")
public class YoutubeEntity{
	@Id
	@Column(name = "Id")
	private int Id;
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}

	@Column(name = "youtuber_name")
	private String name;
	@Column(name = "Subscribers")  
	private int Subscribers;
	@Column(name = "Avg_viewers")  
	private int viewers;
	@Column(name = "date_of_channel_creation")  
	private Date date;

	


	public String getYoutuber_name() {
		return name;
	}


	public void setYoutuber_name(String youtuber_name) {
		this.name = youtuber_name;
	}


	public int getSubscribers() {
		return Subscribers;
	}


	public void setSubscribers(int subscribers) {
		Subscribers = subscribers;
	}


	public int getViewers() {
		return viewers;
	}


	public void setViewers(int viewers) {
		this.viewers = viewers;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public YoutubeEntity(int id, String youtuber_name, int subscribers, int viewers, Date date) {
		super();
		this.Id = id;
		this.name = youtuber_name;
		this.Subscribers = subscribers;
		this.viewers = viewers;
		this.date = date;
	}
	
	public YoutubeEntity() {
		
	}
}