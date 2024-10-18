package com.shiva.proj1.work;


public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bearing b=new Bearing(3,"nbc",6210,"ballbearing");
		
		Dao d1=new Dao();
		
		d1.insertBearing(b);
		
		

	}
}
