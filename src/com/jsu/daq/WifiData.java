package com.jsu.daq;


public class WifiData {
	//采集到的手机mac地址
	private String mac;
	//手机的信号强度
	private String rssi;
	//传输的信道
	private String ch;
	//手机连接的路由器WIFI的SSID
	private String ts;
	//手机连接的路由器WIFI的MAC地址
	private String tmc;
	//手机是否与路由器连接
	private String tc;
	//手机是否处于睡眠状态，一般为关屏
	private String ds;
	//手机厂商
	private String phoneFirm;

	//手机曾经连接过的路由器WIFI的名称
	private String essid0;
	private String essid1;
	private String essid2;
	private String essid3;
	private String essid4;
	private String essid5;
	private String essid6;

	
	public String getPhoneFirm() {
		return phoneFirm;
	}
	public void setPhoneFirm(String phoneFirm) {
		this.phoneFirm = phoneFirm;
	}
	public String getCh() {
		return ch;
	}
	public void setCh(String ch) {
		this.ch = ch;
	}

	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getRssi() {
		return rssi;
	}
	public void setRssi(String rssi) {
		this.rssi = rssi;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getTmc() {
		return tmc;
	}
	public void setTmc(String tmc) {
		this.tmc = tmc;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getDs() {
		return ds;
	}
	public void setDs(String ds) {
		this.ds = ds;
	}
	public String getEssid0() {
		return essid0;
	}
	public void setEssid0(String essid0) {
		this.essid0 = essid0;
	}
	public String getEssid1() {
		return essid1;
	}
	public void setEssid1(String essid1) {
		this.essid1 = essid1;
	}
	public String getEssid2() {
		return essid2;
	}
	public void setEssid2(String essid2) {
		this.essid2 = essid2;
	}
	public String getEssid3() {
		return essid3;
	}
	public void setEssid3(String essid3) {
		this.essid3 = essid3;
	}
	public String getEssid4() {
		return essid4;
	}
	public void setEssid4(String essid4) {
		this.essid4 = essid4;
	}
	public String getEssid5() {
		return essid5;
	}
	public void setEssid5(String essid5) {
		this.essid5 = essid5;
	}
	public String getEssid6() {
		return essid6;
	}
	public void setEssid6(String essid6) {
		this.essid6 = essid6;
	}

	public String toString1() {
		return "WifiData [mac=" + mac + ", rssi=" + rssi + ", ch=" + ch + ", phoneFirm=" + phoneFirm+ "]";
	}
	
	public String toString2() {
		return "WifiData [mac=" + mac + ", rssi=" + rssi + ", ch=" + ch + ", ts=" + ts + ", tmc=" + tmc + ", tc=" + tc
				+ ", phoneFirm=" + phoneFirm+ "]";
	}
	
	public String toString3() {
		return "WifiData [mac=" + mac + ", rssi=" + rssi + ", ch=" + ch + ", ts=" + ts + ", tmc=" + tmc + ", tc=" + tc
				+ ", ds=" + ds + ", phoneFirm=" + phoneFirm + "]";
	}


}
