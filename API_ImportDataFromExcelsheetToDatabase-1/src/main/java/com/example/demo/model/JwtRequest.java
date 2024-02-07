package com.example.demo.model;

public class JwtRequest {

	private String username;
	private String password;

	// No-arg constructor
	public JwtRequest() {
	}

	// All-arg constructor
	public JwtRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Getter for username
	public String getUsername() {
		return username;
	}

	// Setter for username
	public void setUsername(String username) {
		this.username = username;
	}

	// Getter for password
	public String getPassword() {
		return password;
	}

	// Setter for password
	public void setPassword(String password) {
		this.password = password;
	}

	// Builder pattern
	public static class JwtRequestBuilder {
		private String username;
		private String password;

		JwtRequestBuilder() {
		}

		public JwtRequestBuilder username(String username) {
			this.username = username;
			return this;
		}

		public JwtRequestBuilder password(String password) {
			this.password = password;
			return this;
		}

		public JwtRequest build() {
			return new JwtRequest(username, password);
		}
	}
}
