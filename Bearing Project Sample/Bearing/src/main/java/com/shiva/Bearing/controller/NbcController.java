package com.shiva.Bearing.controller;

import com.shiva.Bearing.dao.NbcDao;
import com.shiva.Bearing.entity.NbcBearing;

public class NbcController {
	static NbcDao nd=new NbcDao();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NBC Bearings ck birla group");
		
		boolean b=insertNbcBearing(new NbcBearing(6202,"ball bearing","common appliation",95,30));
		System.out.println("Bearing added "+b);
		
	}
	
	public static boolean insertNbcBearing(NbcBearing b) {
		Boolean res=nd.addNbcBearing(b);
		return res;
	}
	
	public static String getNbcBearingDetails(int size) {
		NbcBearing b=nd.getNbcBearingBysize(size);
		if(b!=null) 
			return b.toString();
		else
			return "Sorry this size is not available";
	}
	
	public static void updateNbcBearingPrice(int size, int new_mrp) {
		nd.updateNbcBeraingMrp(size, new_mrp);
	}
	
	public static void updateNbcBeraingDiscount(int size, int new_discount) {
		nd.updateNbcBeraingDiscount(size, new_discount);
	}
	
	public static void deleteNbcBearing(int size) {
		nd.removeNbcBering(size);
	}

}
