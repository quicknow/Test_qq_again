package com.qq.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QqChat extends JFrame {
	
	JTextArea jta;
	JTextField jtf;
	JButton jb;
	JPanel jp ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqChat qc = new QqChat("1");
	}
	
	public QqChat(String friendid){
		
		jta = new JTextArea();		
		jtf = new JTextField(12);		
		jb = new JButton("发送");		
		jp = new JPanel();
		jp.add(jtf);
		jp.add(jb);
		this.add(jta);
		this.add(jp,BorderLayout.SOUTH);
		//System.out.println("正在和"+friendid+"聊天");
		this.setIconImage((new ImageIcon("images/qq_head.jpg")).getImage());
		this.setTitle("正在和"+friendid+"聊天");
		this.setVisible(true);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		this.setLocation(300, 400);
	}

}
