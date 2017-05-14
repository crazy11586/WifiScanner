package com.jsu.po;

public class Customer {
	private String Customer_mac;
	private String Customer_flim;
	private int Enter_time;
	private int status;
	private int Recent_entertime;
	private int Enter_count;
	private int AllTimes;
	public String getCustomer_mac() {
		return Customer_mac;
	}
	public void setCustomer_mac(String customer_mac) {
		Customer_mac = customer_mac;
	}
	public String getCustomer_flim() {
		return Customer_flim;
	}
	public void setCustomer_flim(String customer_flim) {
		Customer_flim = customer_flim;
	}
	public int getEnter_time() {
		return Enter_time;
	}
	public void setEnter_time(int enter_time) {
		Enter_time = enter_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getRecent_entertime() {
		return Recent_entertime;
	}
	public void setRecent_entertime(int recent_entertime) {
		Recent_entertime = recent_entertime;
	}
	public int getEnter_count() {
		return Enter_count;
	}
	public void setEnter_count(int enter_count) {
		Enter_count = enter_count;
	}
	public int getAllTimes() {
		return AllTimes;
	}
	public void setAllTimes(int allTimes) {
		AllTimes = allTimes;
	}
	
	
}
