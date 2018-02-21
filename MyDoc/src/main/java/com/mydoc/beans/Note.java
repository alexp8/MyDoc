package com.mydoc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Bean class holding information regarding notes.
 * @author Alex
 */
@Entity
@Table(name = "NOTE")
public class Note {
	
	/**
	 * Id of the note. Sequence used to generate the Id.
	 */
	@Id
	@Column(name="NOTE_ID")
	@SequenceGenerator(sequenceName="NOTE_SEQ", name="NOTE_SEQ")
	@GeneratedValue(generator="NOTE_SEQ", strategy=GenerationType.SEQUENCE)
	private Integer noteID;
	
	@Column(name="NOTE_TITLE")
	private String title;
	
	@Column(name="NOTE_MESSAGE", nullable = false)
	private String message;
	
	@Column(name="USER", nullable = false)
	@ManyToOne
	private User user;
	
	public Note() {
		
	}
	
	public Note(User user, String title, String message) {
		this.user = user;
		this.title = title;
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNoteID() {
		return noteID;
	}
}