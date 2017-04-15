package com.jsu.daq;

import java.util.ArrayList;

public class Wifi {
	
	//̽��id
	private String id;
	//̽�鵽���������ݵļ���
	private ArrayList<WifiData> data;
	//�ֻ����ݵ�ʱ��
	private String time;
	//γ��
	private String lat;
	//����
	private String lon;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<WifiData> getData() {
		return data;
	}
	public void setData(ArrayList<WifiData> data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		
		String str = "Wifi [id=" + id + ", data=" + data + ", time=" + time + ", lat=" + lat + ", lon=" + lon + "]";

		return str;
	}
	
	
	
	
}
