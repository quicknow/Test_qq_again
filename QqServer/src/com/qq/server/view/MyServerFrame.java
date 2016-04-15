package com.qq.server.view;

import java.io.*;

import javax.swing.*;

import com.qq.server.model.MyQqServer;

import java.awt.*;
import java.awt.event.*;

public class MyServerFrame extends JFrame implements ActionListener{
	JButton jb1,jb2;
	JPanel jp1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyServerFrame msf = new MyServerFrame();
	}
	
	public MyServerFrame(){
		jb1 = new JButton("启动服务器");
		jb2 = new JButton("关闭服务器");
		jp1 = new JPanel();
		jp1.add(jb1);
		jp1.add(jb2);
		
		this.add(jp1);
		this.setVisible(true);
		this.setSize(500,300);
		this.setLocation(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1){
			MyQqServer mqs = new MyQqServer();
		}
	}

}
