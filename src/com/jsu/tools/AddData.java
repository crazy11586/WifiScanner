package com.jsu.tools;

public class AddData {
	public static void main(String args[]){
		
		Long time  = 1493568000000L;
		int enter  ;
		int all;
		
		for( int i = 0 ; i < 24*60 ; i ++ ){

			String str = "insert into customer_count values";
			enter = (int)(Math.random()*100)+1;
			all = enter+(int)(Math.random()*100)+1;
		
			System.out.println(str + "('"+time+"',"+enter+","+all+");");
			time = time+3600000L;
		}
		System.out.println((24*365)+"");
//		
//		Long l1 = 1495296000000L;
//		Long l2 =1495209600000L;
//		System.out.println((l1-l2));
		
	}
}
