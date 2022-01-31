package com.monocept.dip.solution;

public class TaxCalculator {
	
	private ILogger logger;
	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}
	
	public double calculateTax(int amt, int rate) {
		double result=0;
		try {
			 result = (amt/rate);
		}catch(Exception e) {
			logger.log(e.getMessage());
		}
		return result;
	}
	
}
