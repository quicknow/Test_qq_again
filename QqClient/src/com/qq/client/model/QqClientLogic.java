package com.qq.client.model;

import com.qq.client.common.User;

public class QqClientLogic {
	
	//�жϵ�¼���û����������ܷ��½�ɹ�
	public boolean checkUser(User u){		
		
		return new QqClientConServer().sendLoginInfoToServer(u);
		
	}
}
