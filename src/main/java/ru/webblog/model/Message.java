package ru.webblog.model;


import java.sql.Date;

public class Message {
	long id;
	String text;
	Date timestamp;
	long authorId;
	long targetId;
	boolean isReaded;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public long getTargetId() {
		return targetId;
	}

	public void setTargetId(long targetId) {
		this.targetId = targetId;
	}

	public boolean isReaded() {
		return isReaded;
	}

	public void setReaded(boolean readed) {
		isReaded = readed;
	}
}
