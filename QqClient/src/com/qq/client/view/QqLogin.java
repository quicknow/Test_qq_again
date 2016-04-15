package com.qq.client.view;

import com.qq.client.common.*;
import com.qq.client.model.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QqLogin extends JFrame implements ActionListener{
	JLabel jl1 =null;
	JPanel jp1 =null;
	JButton jp1_jb1,jp1_jb2,jp1_jb3;
	JTabbedPane jtp=null;
	JPanel jp2,jp3,jp4;
	JLabel jp2_jlb1,jp2_jlb2,jp2_jlb3,jp2_jlb4;
	JButton jp2_jb;
	JTextField jtf=null;
	JPasswordField jpf=null;
	JCheckBox jcb1,jcb2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QqLogin login = new QqLogin();

	}
	
	public QqLogin(){
		jl1 = new JLabel(new ImageIcon("images/login_tou.jpg"));
		jp1 = new JPanel();
		jp1_jb1=new JButton("登陆");
		jp1_jb1.addActionListener(this);
		
		jp1_jb2=new JButton("取消");
		jp1_jb3=new JButton("注册向导");
		
		jp2_jlb1 = new JLabel("QQ号码",JLabel.CENTER);
		jp2_jlb2 = new JLabel("QQ密码",JLabel.CENTER);
		jp2_jlb3 = new JLabel("忘记密码",JLabel.CENTER);
		jp2_jlb3.setForeground(Color.blue);
		jp2_jlb4 = new JLabel("申请密码保护",JLabel.CENTER);
		jp2_jb = new JButton("清除号码");
		jtf = new JTextField();
		jpf = new JPasswordField();
		jcb1=new JCheckBox("隐身登录");
		jcb2=new JCheckBox("记住密码");
		jp2= new JPanel(new GridLayout(3,3));
		
		jp2.add(jp2_jlb1);
		jp2.add(jtf);
		jp2.add(jp2_jb);
		jp2.add(jp2_jlb2);
		jp2.add(jpf);
		jp2.add(jp2_jlb3);
		
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jp2_jlb4);
		
		
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		
		jtp = new JTabbedPane();
		jp3= new JPanel();
		jp4= new JPanel();
		
		jtp.add("QQ号码",jp2);
		jtp.add("手机号码",jp3);
		jtp.add("电子邮件",jp4);
		
		//完成Border布局的南部
		this.add(jl1,BorderLayout.NORTH);
		
		//完成中部
		this.add(jtp,BorderLayout.CENTER);
		
		//完成Border布局的北部
		this.add(jp1,BorderLayout.SOUTH);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(600, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jp1_jb1){
			
			String username = jtf.getText().trim();
			String password = new String(jpf.getPassword());
			
			User u = new User();
			u.setUsername(username);
			u.setPassword(password.trim());
			
			//页面连接Model层，不要直接去连接数据库，这样才是三层结构
			QqClientLogic qcl = new QqClientLogic();
			
			if(qcl.checkUser(u)){
				new QqFriendList();
				this.dispose(); //登陆成功则当前登陆界面消失
			}else{
				JOptionPane.showMessageDialog(this,"用户名密码错误");
			}
			
		}
	}

}
