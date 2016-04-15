package com.qq.client.model;

import com.qq.client.common.User;

public class QqClientLogic {
	
	//判断登录的用户名和密码能否登陆成功
	public boolean checkUser(User u){		
		
		return new QqClientConServer().sendLoginInfoToServer(u);
		
	}
}
