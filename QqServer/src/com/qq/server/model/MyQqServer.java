package com.qq.server.model;

import com.qq.server.common.*;
import java.io.*;
import java.net.*;
import java.util.*;


public class MyQqServer {
	
	public static void main(String []args){
		
	}
	
	public MyQqServer(){
		System.out.println("开始监听：9999端口");
		try {
			ServerSocket ss = new ServerSocket(9999);
			
			//阻塞  等待连接
			Socket s = ss.accept();
			
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			User u =(User)(ois.readObject());
			Message m = new Message();
			if(u.getPassword().equals("123456")){				
				m.setMesType("1");
			}else{
				m.setMesType("2");
			}
			
			ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(m);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
	}
}
