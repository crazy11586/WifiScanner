package com.jsu.daq;

import static org.junit.Assert.*;

import java.util.ArrayList;  
import java.util.List;  
import java.util.Properties;

import org.junit.Test;

import kafka.javaapi.producer.Producer;  
import kafka.producer.KeyedMessage;  
import kafka.producer.ProducerConfig; 

public class KafkaProducer {
    private static final String BROKER_LIST = "10.0.0.35:9092,10.0.0.172:9092"; //broker�ĵ�ַ�Ͷ˿�  
    private static final String SERIALIZER_CLASS = "kafka.serializer.StringEncoder"; // ���л���
    private Producer<String, String> producer;
    private ProducerConfig config;
    
    
    public KafkaProducer(){
    	
    	Properties props = new Properties();    
        props.put("serializer.class", SERIALIZER_CLASS);  
        props.put("metadata.broker.list", BROKER_LIST);  
  
        config = new ProducerConfig(props);  
        producer = new Producer<String, String>(config); 
        
    }
    
    public void Send(String topic ,String str ){
    	
    	
    	//Send one message.  
        KeyedMessage<String, String> message =  
                new KeyedMessage<String, String>(topic, str);  
		//System.out.println(str);
        producer.send(message);  
        System.out.println(str);
       // System.out.println("YES");
 
    }
    
    public void Send(String topic , ArrayList<String> somedata){

    	
      		for( int i = 0 ; i < somedata.size() ; i ++ ){
      
      			Send(topic,somedata.get(i));
      			
      		}
        
    }
    /*
    public void Send(String topic , ArrayList<WifiData> alldata){

        //Send multiple messages. 
    	List<KeyedMessage<String,String>> messages =  
                new ArrayList<KeyedMessage<String, String>>(); 
    	
      		for (WifiData Element : alldata) {
      			
      			if ("-1".equals(Element.getTs())) {
      				
      				messages.add(new KeyedMessage<String, String>(topic, Element.toString1()));
      			
      			} else if ("-1".equals(Element.getDs())) {
      				
      				messages.add(new KeyedMessage<String, String>(topic, Element.toString2()));
      				
      			} else {
      				
      				messages.add(new KeyedMessage<String, String>(topic, Element.toString3()));
      				
      			}
      		}
        
        producer.send(messages);
    }
    
    */
    @Test
	public void testName() throws Exception {
    	
    	KafkaProducer kafkaProducer = new KafkaProducer();
    	//String str = "Connection connTest = DriverManager.getConnection('jdbc:mysql://10.0.0.35:3306/wifi','root','763893636');";
    	String str = "https://code.hcharts.cn/demos/hhhhDx";
    	kafkaProducer.Send("wifidata", str);
    	
	}
    
}
