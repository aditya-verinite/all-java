package com.example.demo.model;

public class JwtResponse {

	private String jwtToken;
	private String username;

	public JwtResponse() {
	}

	public JwtResponse(String jwtToken, String username) {
		this.jwtToken = jwtToken;
		this.username = username;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static JwtResponseBuilder builder() {
		return new JwtResponseBuilder();
	}

	public static class JwtResponseBuilder {
		private String jwtToken;
		private String username;

		JwtResponseBuilder() {
		}

		public JwtResponseBuilder jwtToken(String jwtToken) {
			this.jwtToken = jwtToken;
			return this;
		}

		public JwtResponseBuilder username(String username) {
			this.username = username;
			return this;
		}

		public JwtResponse build() {
			return new JwtResponse(jwtToken, username);
		}
	}

	@Override
	public String toString() {
		return "JwtResponse{" + "jwtToken='" + jwtToken + '\'' + ", username='" + username + '\'' + '}';
	}
}
