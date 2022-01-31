package com.monocept.dip.violation;

public class TaxCalculator {
	
	private ErrorLogType log;
	public TaxCalculator(ErrorLogType logType) {
		this.log = logType;
	}
	
	public double calculateTax(int amt, int rate) {
		double result=0;
		try {
			 result = (amt/rate);
		}catch (Exception e) {
			if(log == ErrorLogType.File)
			new FileLogger().log(e.getMessage());
			if(log == ErrorLogType.Email)
			new EmailLogger().log(e.getMessage());
		}
		return  result;
	}
}
