package com.qq.client.view;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QqFriendList extends JFrame implements ActionListener,MouseListener{

	JPanel jp1,jp2,jp3,msr_jp1,msr_jp2,msr_jp3;
	JButton jp1_jb1,jp3_jb1,jp3_jb2,msr_jp1_jb1,msr_jp3_jb1,msr_jp3_jb2;
	JScrollPane jsp,msr_jsp;
	//����һ����Ƭ����,�����л����ѻ���İ���˵Ľ���
	CardLayout clt ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqFriendList qf = new QqFriendList();
	}
	
	public QqFriendList(){
		
		
		//��һ����Ƭ
		jp1 = new JPanel(new BorderLayout());		
		jp1_jb1 = new JButton("�ҵĺ���");		
		
		//�ٶ���50������
		jp2 = new JPanel(new GridLayout(50,1,4,4));		
		jsp= new JScrollPane(jp2);
		
		//��ʼ��50��JLabel
		JLabel []jbl= new JLabel[50];
		for(int i=0;i<50;i++){
			jbl[i]= new JLabel(i+1+"",new ImageIcon("images/mm.jpg"),JLabel.LEFT);
			//System.out.println(1);
			jbl[i].addMouseListener(this);
			jp2.add(jbl[i]);
			
			
		}
		
		jp3 = new JPanel(new GridLayout(2,1));
		jp3_jb1 = new JButton("İ����");
		jp3_jb1.addActionListener(this);
		jp3_jb2 = new JButton("������");
		jp3.add(jp3_jb1);
		jp3.add(jp3_jb2);		
		
		//��jp2 ��jp3�ŵ� jp1����
		jp1.add(jp1_jb1,"North");
		jp1.add(jsp,"Center");
		jp1.add(jp3,"South");
		
		//�ڶ�����Ƭ
		msr_jp1 = new JPanel(new BorderLayout());		
		msr_jp1_jb1 = new JButton("�ҵĺ���");	
		msr_jp1_jb1.addActionListener(this);
		//�в� �ٶ���20������
		msr_jp2 = new JPanel(new GridLayout(20,1,4,4));		
		msr_jsp= new JScrollPane(msr_jp2);
		
		//��ʼ��20��JLabel
		JLabel []msr_jbl= new JLabel[20];
		for(int i=0;i<20;i++){
			msr_jbl[i]= new JLabel(i+1+"",new ImageIcon("images/mm.jpg"),JLabel.LEFT);
			//System.out.println(1);
			msr_jbl[i].addMouseListener(this);
			msr_jp2.add(msr_jbl[i]);
			
		}
		
		msr_jp3 = new JPanel(new GridLayout(2,1));		
		msr_jp3_jb1 = new JButton("İ����");		
		msr_jp3_jb2 = new JButton("������");
		msr_jp3.add(msr_jp1_jb1);
		msr_jp3.add(msr_jp3_jb1);		
		
		//��jp2 ��jp3�ŵ� jp1����
		msr_jp1.add(msr_jp3,"North");
		msr_jp1.add(msr_jsp,"Center");
		msr_jp1.add(msr_jp3_jb2,"South");
		
		clt = new CardLayout();
		this.setLayout(clt);
		this.add(jp1,"1");
		this.add(msr_jp1,"2");		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(30,400);
		this.setLocation(400, 300);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==(jp3_jb1)){
			clt.show(this.getContentPane(), "2");			
		}else if(e.getSource()==msr_jp1_jb1){
			clt.show(this.getContentPane(), "1");
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount()==2){
			JLabel jl=(JLabel)e.getSource();
			//System.out.println(jl.getText());
			new QqChat(jl.getText());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel jl = (JLabel)(e.getSource());
		jl.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel jl = (JLabel)(e.getSource());
		jl.setForeground(Color.black);
		
	}

}
