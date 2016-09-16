package com.manolo.spring.web.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Offer {

	private int id;

	@Size(min=1, max=100, message="Name can't be empty")
	private String name;
	@NotNull
	@Pattern(regexp=".*\\@.*\\..*" , message="Not a valid email address")
	private String email;
	@Size(min=1, max=300, message="Length must be between 1 and 300 characters")
	private String text;

	public Offer(int id, String name, String email, String text) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public Offer(String name, String email, String text) {
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public Offer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}

}
