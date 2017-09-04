package com.jsu.action;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.xml.sax.SAXException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jsu.Iservice.ConfigService;
import com.jsu.Iservice.CustomerCountService;
import com.jsu.Iservice.CustomerPositionService;
import com.jsu.Iservice.CustomerService;
import com.jsu.Iservice.DeviceService;
import com.jsu.Iservice.StoreService;
import com.jsu.Iservice.UserService;
import com.jsu.daq.Wifi;
import com.jsu.daq.WifiData;
import com.jsu.po.CustomerCount;
import com.jsu.po.DeviceInfo;
import com.jsu.po.Numbers;
import com.jsu.po.PositionInfo;
import com.jsu.po.Users1;
import com.jsu.tools.LruCache;
import com.opensymphony.xwork2.ActionSupport;

import kafka.common.Config;
import scala.util.Random;

public class GetDataAction extends ActionSupport implements ServletResponseAware{  
    
    private List list;
    private List temp;
    private String action;
    private ApplicationContext context;
    private int id;
    
    private String mac;

    private String time1;
    private String time2;

	public static org.dom4j.Document document;
	public static String urlPath;
	public static org.dom4j.Element  root;
	public String filepath;
	
	private String url_profile ;
	private String url_setting ;
	private ArrayList<DeviceInfo> allDevice;
	

    public String getUrl_profile() {
		return url_profile;
	}

	public void setUrl_profile(String url_profile) {
		this.url_profile = url_profile;
	}

	public String getUrl_setting() {
		return url_setting;
	}

	public void setUrl_setting(String url_setting) {
		this.url_setting = url_setting;
	}

	private static void InitReader() throws DocumentException, SAXException {


    	System.out.println("yes1"+System.currentTimeMillis());
    	SAXReader saxReader = new SAXReader();
    	System.out.println("yes2"+System.currentTimeMillis());
		saxReader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		//String str = ServletActionContext.getServletContext().getRealPath("/");
		//urlPath = "./data.xml";
		

    	//System.out.println("yes3"+ServletActionContext.getServletContext().getRealPath("/"));
		urlPath = ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"mac_search.xml";
		//System.out.println("InitReader Begin" + urlPath);
		document = saxReader.read(new File(urlPath));
		root = document.getRootElement();		
		
		System.out.println("InitReader OK" + urlPath);
		
	}
    
    public GetDataAction(){
    	if(ApplicationContextHelper.flag){

    		ApplicationContextHelper.flag = false;
    		System.out.println("Begin Load");
    		try {
				InitReader();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    	else System.out.println("Begin Load !!!!!!!!!!!!!!!!!!!!");
    }
	
	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List getList() {  
        return list;  
    }  
  
    public void setList(List list) {  
        this.list = list;  
    }  
    
    
    
    

    public String Test(){  
    	//System.out.println(id);
    	System.out.println("yes3"+ServletActionContext.getServletContext().getRealPath("/"));
    	
    	if(action.equals("getStore")){
    		GetStore();
    	}else if(action.equals("getDevice")){
    		GetDevice();
    	}else if(action.equals("getDeviceB")){
    		GetDeviceB();
    	}else if(action.equals("getCustomer")){
    		GetCustomer();
    	}else if(action.equals("getCustomerPosition")){
    		GetCustomerPosition();
    	}else if(action.equals("getCustomerPositiontime")){
    		//GetCustomerPositionTime();
    		GetCustomerPosition();
    	}else if(action.equals("getCustomerCount")){
    		GetCustomerCount();
    	}else if(action.equals("getCustomerCount2time")){
    		GetCustomerCount2Time();
    	}else if(action.equals("getall")){
    		GetAllOrenter();
    	}else if(action.equals("getrate")){
    		GetAllRate();
    	}else if(action.equals("getflim")){
    		GetPositionInfo();
    	}else if(action.equals("getdeviceinfo")){
    		GetDeviceInfo();
    	}else{
    		list.add("The args is Error !!! ");
    	}
        return SUCCESS;  
    }  
    
    private void GetProfile(DeviceInfo deviceinfo) {
		try {
			Document doc = Jsoup.connect(url_profile).get();
			Element masthead = doc.select("table ").first();
			Elements links = masthead.getElementsByTag("td");
			
			deviceinfo.setHostname(links.get(1).text());
			deviceinfo.setHostname_kind(links.get(3).text());
			deviceinfo.setGujian(links.get(5).text());
			deviceinfo.setNeihe(links.get(7).text());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void GetSetting(DeviceInfo deviceinfo) {
		try {
			
			Document doc = Jsoup.connect(url_setting).get();
			
			Element element_url = doc.getElementById("cbid.data_upload.data_upload.url");
			Element element = doc.getElementById("cbid.data_upload.data_upload.interval");
			
			deviceinfo.setUpload_url(element_url.attr("value"));
			deviceinfo.setUpload_port(element.attr("value"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    private void GetDeviceInfo() {
		// TODO Auto-generated method stub
    	allDevice = new ArrayList<>();
    	url_profile = url_profile.replaceAll("and", "&");
    	url_setting = url_setting.replaceAll("and", "&");
    	System.out.println(url_profile);
    	DeviceInfo deviceinfo = new DeviceInfo();
    	GetProfile(deviceinfo);
    	GetSetting(deviceinfo);
    	System.out.println(deviceinfo.toString());
    	allDevice.add(deviceinfo);
    	list = allDevice;
	}

	private void GetDevice() {
		// TODO Auto-generated method stub
    	 
    	DeviceService service = (DeviceService) ApplicationContextHelper.getBean("deviceService");
        //	DeviceService service =(DeviceService) context.getBean("deviceService");
       list = service.getAllDevice();
	}
	
	private void GetPositionInfo() {
		// TODO Auto-generated method stub
    	 
    	DeviceService service = (DeviceService) ApplicationContextHelper.getBean("deviceService");
        //	DeviceService service =(DeviceService) context.getBean("deviceService");
    	List mylist =  service.getAllPositionInfo(mac);
    	System.out.println(mylist.get(0).toString());
    	ArrayList<PositionInfo> mlist = new ArrayList<PositionInfo>();
    	if(mylist.size() > 0){
    	for(int i = 0 ; i < mylist.size() ; i ++){
    		Object[] objects= (Object[]) mylist.get(i);
    		System.out.println(mac);
    		mac = (String) objects[0];
    		try {
				Change2WifiDate();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		PositionInfo po = new PositionInfo();
    		
    		switch(CurrentFlim){
    		
    			case "Xiaomi Communications Co Ltd": po.setFlim("小米"); break;
    			case "Beijing SHENQI Technology Co., Ltd.": po.setFlim("联想"); break;
    			case "HUAWEI TECHNOLOGIES CO.,LTD": po.setFlim("华为"); break;
    			case "GUANGDONG OPPO MOBILE TELECOMMUNICATIONS CORP.,LTD": po.setFlim("oppo"); break;
    			case "vivo Mobile Communication Co., Ltd.": po.setFlim("vivo"); break;
    			case "Apple, Inc.":po.setFlim("苹果"); break;
    			default :po.setFlim(CurrentFlim.substring(0, 8)); break;
    			
        		
    		}
    		
    		
    		
    		po.setMac((String) objects[0]);
    		po.setPosition_x((Double) objects[1]);
    		po.setPosition_y((Double) objects[2]);
    		po.setTime(objects[3]+"");
    		mlist.add(po);
    	}
    	}
    	
    	list= mlist;
	}
    
    private void GetDeviceB() {
		// TODO Auto-generated method stub
    	DeviceService service = (DeviceService) ApplicationContextHelper.getBean("deviceService");
    //	DeviceService service =(DeviceService) context.getBean("deviceService");
    	list = service.getDeviceFromId(id);
	}

	private void GetStore() {
		// TODO Auto-gengeterated method stub
//		StoreService service = (StoreService) ApplicationContextHelper.getBean("storeService");  
		
		StoreService service = (StoreService) ApplicationContextHelper.getBean("storeService");
		list = service.getAllStore();
	}

	private void GetCustomerPosition() {

		CustomerPositionService service =(CustomerPositionService)ApplicationContextHelper.getBean("customerpositionService");
    	list = service.getAllCustomerPosition();
    	
	}
	
	private void GetCustomerPositionTime() {

		CustomerPositionService service =(CustomerPositionService)ApplicationContextHelper.getBean("customerpositionService");
    	//list = service.getAllCustomerPositionTime(time1, time2);
    	list = service.getAllCustomerPosition();
	}
	
	
	private void GetCustomerCount() {
		// TODO Auto-gengeterated method stub
//		StoreService service = (StoreService) ApplicationContextHelper.getBean("storeService");  
		
		CustomerCountService service = (CustomerCountService) ApplicationContextHelper.getBean("customerCountService");
		list = service.getAllCustomerCountDao();
		
	}
	private void GetCustomerCount2Time() {		
		CustomerCountService service = (CustomerCountService) ApplicationContextHelper.getBean("customerCountService");
		list = service.getCustomerCountDao(time1, time2);
	}

	private void GetCustomer() {
		
		CustomerService service =(CustomerService)ApplicationContextHelper.getBean("customerService");
    	list = service.getAllCustomer();
	}
	
	
	private void GetAllOrenter(){
		ConfigService service =(ConfigService)ApplicationContextHelper.getBean("configService");
    	list = service.queryBySql("select A.allCustomer , B.sum , A.currentTime from allc A,enter B where (B.currentTime+0)-(A.currentTime+0)>=0 "
    			+ "and (B.currentTime+0)-(A.currentTime+0) < 3000 "
    			+ "and (A.currentTime+0) > "+time1+" and (A.currentTime+0) <  "+time2+"");
	}
	
	private void GetAllRate(){
		ConfigService service =(ConfigService)ApplicationContextHelper.getBean("configService");
    	list = service.queryBySql("select B.currentTime , count(distinct mac) , IFNULL(sum(staytime),0) , B.allCustomer from customer_info A right join allc B on (A.currentTime+0) > (B.currentTime+0)  and (A.currentTime+0)-(B.currentTime+0) < 3600000 group by B.currentTime , B.allCustomer");
	}
	
    @org.junit.Test
	public void testName() throws Exception {
		GetStore();
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		response.setHeader("Access-Control-Allow-Origin", "*");
	}
	
	//锟斤拷围锟斤拷1496804400000 - 1496807999000
	
	/**
	 
	 	select A.allCustomer , B.sum 
	 			from allc A,enter B 
	 					where 
	 	(B.currentTime+0)-(A.currentTime+0)>0 
	 	and 
	 	(B.currentTime+0)-(A.currentTime+0) < 3000
	 	and (A.currentTime+0) > 1496808000000 
	 	and (A.currentTime+0) <  1496811599000;
	 
	 */
	static String CurrentFlim;
	/**
	 * 锟斤拷锟斤拷锟秸碉拷锟斤拷JSON锟斤拷锟斤拷转为锟斤拷锟斤拷锟斤拷写娲�
	 * @param json锟街凤拷锟斤拷
	 * @throws UnsupportedEncodingException
	 */
	public void Change2WifiDate() throws UnsupportedEncodingException {

			ArrayList<WifiData> alldata = new ArrayList<>();
		
			
			Boolean flag = false;
			System.out.println("begin"+mac);
			//锟斤拷锟斤拷诨锟斤拷锟斤拷锟斤拷锟斤拷锟节ｏ拷直锟斤拷取锟斤拷
			
			if(ApplicationContextHelper.lrucache.contains(mac)){
				
			//	wifiData.setPhoneFirm(lrucache.get(mac));
				CurrentFlim = ApplicationContextHelper.lrucache.get(mac);
				System.out.println("Lru");
			
			}else{
				
				//锟叫讹拷锟角凤拷锟斤拷Xml锟侥硷拷锟斤拷锟斤拷
				
				for (Iterator iter = root.elementIterator(); iter.hasNext();)
					
		        {
		        	org.dom4j.Element e =  (org.dom4j.Element) iter.next();       
		            if(e.element("key").getText().equals(mac)){
		            	CurrentFlim = e.element("value").getText();
		            	flag = true;
		            	ApplicationContextHelper.lrucache.put(mac, e.element("value").getText());
		            	System.out.println("xml");
		            }
	
		        }
				
				//锟斤拷锟斤拷锟斤拷锟较伙拷取
				if(!flag){
					
					String url = "http://www.imfirewall.com/ip-mac-lookup/get_mac_info.php?mac="+mac;
					
					JSONObject jsonoj;
					
					org.dom4j.Element Element_father;
					org.dom4j.Element Element_son_key;
					org.dom4j.Element Element_son_value;
					try {
						jsonoj = readJsonFromUrl(url);	  
						Element_father = root.addElement("wifi_item");
						Element_son_key = Element_father.addElement("key");
						Element_son_value = Element_father.addElement("value");
						Element_son_key.setText(mac);
						
					    if("true".equals(jsonoj.get("success").toString())){
					    	String tempstr = ((JSONObject) jsonoj.get("result")).get("mac_producer").toString();

			            	CurrentFlim = tempstr;
							Element_son_value.setText(tempstr);
							ApplicationContextHelper.lrucache.put(mac, tempstr);
					    }else{
					    	//wifiData.setPhoneFirm("Private Enterprise");
			            	CurrentFlim = "Private Enterprise";
					    	Element_son_value.setText("Private Enterprise");
					    	ApplicationContextHelper.lrucache.put(mac, "Private Enterprise");
					    }
					    System.out.println("web");
					   
					} catch (IOException e) {
						e.printStackTrace();
					} catch (JSONException e) {
						e.printStackTrace();
					}
			}
			
			
		}
		
		/**
		 * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫达拷锟絰ml锟斤拷
		 */
	    try { 
	    	
	        	FileOutputStream out = new FileOutputStream(urlPath);
		        //OutputFormat format = OutputFormat.createCompactFormat();//锟斤拷锟斤拷锟斤拷锟斤拷锟侥硷拷锟斤拷锟斤拷锟街斤拷锟斤拷锟绞合碉拷锟斤拷
		        OutputFormat format = OutputFormat.createPrettyPrint();//锟斤拷准锟斤拷锟斤拷锟街ｏ拷锟绞合查看时锟斤拷示锟斤拷
		        //1.锟斤拷锟斤拷写锟斤拷锟侥硷拷
		        format.setEncoding("utf-8");//指锟斤拷锟侥硷拷锟斤拷式 
		        XMLWriter writer = new XMLWriter(out,format);
				writer.write(document);
		        writer.close();
		        
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}//写锟斤拷锟侥硷拷
	        
		//wifi.setData(alldata);
	    
	    ArrayList myList = new ArrayList<>();
	    myList.add(CurrentFlim);
	    list = myList;
	}


	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	
    InputStream is = new URL(url).openStream();
    
    try {
    	
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      
      String jsonText = readAll(rd);
      
      JSONObject json = new JSONObject(jsonText);
      
      return json;
      
    } finally {
    	
      is.close();
      
    }
    
  }

	private static String readAll(Reader rd) throws IOException {
	
    StringBuilder sb = new StringBuilder();
    
    int cp;
    
    while ((cp = rd.read()) != -1) {
    	
      sb.append((char) cp);
      
    }
    
    return sb.toString();
    
}
    
}
