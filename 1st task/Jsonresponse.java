package com.example.response;

public class Jsonresponse {

	private String slackUsername;

	private Boolean backend;
  
  private Integer age;
  
  private String bio;

	public StudentResponse(long id, String slackUsername, Boolean backend, Integer age, String bio) {
		this.id = id;
		this.slackUsername = slackUsername;
		this.backend = backend;
    this.age = age;
    this.bio = bio;
	}

	public String slackUsername() {
		return slackUsername;
	}

	public void slackUsername(String slackUsername) {
		this.slackUsername = slackUsername;
	}

	public String backend() {
		return backend;
	}

	public void backend(Boolean backend) {
		this.backend = backend;
	}
  
  public String age() {
		return age;
	}

	public void age(Boolean age) {
		this.age = age;
	}
  
  public String bio() {
		return bio;
	}

	public void bio(Boolean bio) {
		this.bio = bio;
	}

}
