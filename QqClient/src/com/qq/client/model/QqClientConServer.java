package com.qq.client.model;

import com.qq.client.common.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class QqClientConServer {
	
	
	//第一次发送信息给服务端
	public boolean sendLoginInfoToServer(Object o){
		boolean b = false;
		ObjectOutputStream oos=null;
		ObjectInputStream ois = null;
		try {
			Socket s  = new Socket("127.0.0.1",9999);
			oos = new ObjectOutputStream(s.getOutputStream());			
			oos.writeObject(o);
			
			ois=new ObjectInputStream(s.getInputStream());
			Message ms = (Message)(ois.readObject());
			
			if(ms.getMesType().equals("1")){
				b=true;
			}else {
				b=false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				oos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return b;
		
	}
		
	

	//发送信息给服务端
	public void SendInfoToServer(Object o){
		
		ObjectOutputStream oos=null;
		try {
			Socket s  = new Socket("127.0.0.1",9999);
			oos = new ObjectOutputStream(s.getOutputStream());			
			oos.writeObject(o);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				oos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
