package com.monocept.ocp.violation;

public class FixedDeposit {
	
	private int accno;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit( int accno,String name,double principle,int duration,FestivalType festival) {
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	
	public int getAccno() {
		return accno ;
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrinciple() {
		return principle ;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public FestivalType getFestival() {
		return festival;
	}
	
	public double calculateSimpleIntrest() {
		return((this.principle* this.duration*this.calculateRate())/100);
	}
	
	public float calculateRate() {
		if(FestivalType.EID == this.getFestival())
			return 7.5f;
		if(FestivalType.Diwali == this.getFestival())
			return 8.0f;
		return 7.0f;
	}
}
