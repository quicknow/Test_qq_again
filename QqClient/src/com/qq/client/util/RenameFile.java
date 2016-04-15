package com.qq.client.util;

import java.io.*;
public class RenameFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("d:\\t");
		String path="d:\\t";
		
		File flist[]=f.listFiles();
		
		for(int i=0;i<flist.length;i++){
			File fnew= new File(path+"\\"+"vn_fp_email_0"+(i+1)+".png");
			flist[i].renameTo(fnew);
		}
	}

}
