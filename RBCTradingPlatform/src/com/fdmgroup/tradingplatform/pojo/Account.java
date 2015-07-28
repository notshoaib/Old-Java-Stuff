package com.fdmgroup.tradingplatform.pojo;

public class Account {
	
	private String username;
	private String password;
	private int shareHolderId;
	
	public Account(String username, String password, int shareholderId) {
		this.password=password;
		this.username=username;
		this.shareHolderId=shareholderId;
	}
	
	public Account(){
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getShareHolderId() {
		return shareHolderId;
	}
	public void setShareHolderId(int shareHolderId) {
		this.shareHolderId = shareHolderId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + shareHolderId;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		Account other = (Account) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (shareHolderId != other.shareHolderId)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	

}
