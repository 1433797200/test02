package com;

import javax.jws.WebService;

@WebService
/**
 * <br></br>
 * http://xxx.com
 * @author shuyun
 *
 */
 
/**
 * 
 * @author hedefeng
 *
 */
/**
 * 
 * @author hedefeng
 * 2015Äê10ÔÂ13ÈÕ
 */
public class Temp4 extends ThreadLocal<Temp4> {
	
	String name = "";
	boolean sex = false;
	int age = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	//×¢ÊÍ
	/*
	 * ×¢ÊÍ This is a comment
	 */
	public void abc(){
		int i = 0;
		System.out.println("×Ö·û´® created_at ASC");
		for (int j = 0; j < 10; j++) {
			
			break;
		}
		return ;
	}
	
	
	/**
	 * ×¢ÊÍ
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(1);
	}
	
}
