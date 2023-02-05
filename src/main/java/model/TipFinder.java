package model;

import java.text.DecimalFormat;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Feb 4, 2023
 */

public class TipFinder {
	
	DecimalFormat df = new DecimalFormat(".00");
	
	// The components of our object
	private double baseAmount;
	private double tipPercentage;
	private double actualTip;
	private double fullAmount;

	// The methods
	public TipFinder() {
		super();
	}
	
	public TipFinder(double baseAmount, double tipPercentage) {
		super();
		this.baseAmount = baseAmount;
		this.tipPercentage = tipPercentage;
		
		final int DIVIDED_BY = 100;
		final double TAX = .07;
		double tipDecimal;
		
		if (baseAmount <= -1) {
			baseAmount = 0;
		}

		if (tipPercentage <= 0) {
			tipDecimal = 0;
			setActualTip(baseAmount * tipDecimal);
		} else {
			tipDecimal = tipPercentage / DIVIDED_BY;
			setActualTip(baseAmount * tipDecimal);
		}
			
		double salesTax = (baseAmount + actualTip) * TAX;
		setFullAmount(baseAmount + actualTip + salesTax);
	}
	
	public double getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	public double getTipPercentage() {
		return tipPercentage;
	}
	public void setTipPercentage(double tipPercentage) {
		this.tipPercentage = tipPercentage;
	}
	public double getActualTip() {
		return actualTip;
	}
	public void setActualTip(double actualTip) {
		this.actualTip = actualTip;
	}
	public double getFullAmount() {
		return fullAmount;
	}
	public void setFullAmount(double fullAmount) {
		this.fullAmount = fullAmount;
	}
	
	// Helper methods for outputing text representing tips and total amounts
	public String returnTip() {
		return "Tip Amount: $" + df.format(actualTip);
	}
	
	public String returnFullAmount() {
		return "Full Amount: $" + df.format(fullAmount);
	}

	@Override
	public String toString() {
		return "TipFinder [baseAmount=" + baseAmount + ", tipPercentage=" + tipPercentage + ", actualTip=" + actualTip
				+ ", fullAmount=" + fullAmount + "]";
	}
	
}
