package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SprintEntry extends Entry{

	private String tempo;
	private String terrain;
	
	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist) {
		super(n, d, m, y, h, min, s, dist);
		Calendar inst = Calendar.getInstance();
		inst.set(y,m-1,d,h,min,s);
	    dateAndTime = inst;
	    distance = dist;
		// TODO Auto-generated constructor stub
	}
	public String getTempo() {
		return tempo;
	}
	public String getTerrain() {
		return terrain;
	}
}
