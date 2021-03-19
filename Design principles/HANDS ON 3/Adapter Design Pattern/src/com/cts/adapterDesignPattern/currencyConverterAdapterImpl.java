package com.cts.adapterDesignPattern;

public class currencyConverterAdapterImpl implements currenctConverterAdapter {
	
	private currencyConverter currency;
	
	public currencyConverterAdapterImpl(currencyConverter currency ) {
		this.currency = currency;
	}

	@Override
	public double getAmount() {
		return convertUSDtoEURO(currency.getAmount());
	}

	private double convertUSDtoEURO(double amount) {
		return amount*0.84;
	}

}
