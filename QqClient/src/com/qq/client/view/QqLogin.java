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
		jp1_jb1=new JButton("��½");
		jp1_jb1.addActionListener(this);
		
		jp1_jb2=new JButton("ȡ��");
		jp1_jb3=new JButton("ע����");
		
		jp2_jlb1 = new JLabel("QQ����",JLabel.CENTER);
		jp2_jlb2 = new JLabel("QQ����",JLabel.CENTER);
		jp2_jlb3 = new JLabel("��������",JLabel.CENTER);
		jp2_jlb3.setForeground(Color.blue);
		jp2_jlb4 = new JLabel("�������뱣��",JLabel.CENTER);
		jp2_jb = new JButton("�������");
		jtf = new JTextField();
		jpf = new JPasswordField();
		jcb1=new JCheckBox("�����¼");
		jcb2=new JCheckBox("��ס����");
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
		
		jtp.add("QQ����",jp2);
		jtp.add("�ֻ�����",jp3);
		jtp.add("�����ʼ�",jp4);
		
		//���Border���ֵ��ϲ�
		this.add(jl1,BorderLayout.NORTH);
		
		//����в�
		this.add(jtp,BorderLayout.CENTER);
		
		//���Border���ֵı���
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
			
			//ҳ������Model�㣬��Ҫֱ��ȥ�������ݿ⣬������������ṹ
			QqClientLogic qcl = new QqClientLogic();
			
			if(qcl.checkUser(u)){
				new QqFriendList();
				this.dispose(); //��½�ɹ���ǰ��½������ʧ
			}else{
				JOptionPane.showMessageDialog(this,"�û����������");
			}
			
		}
	}

}
