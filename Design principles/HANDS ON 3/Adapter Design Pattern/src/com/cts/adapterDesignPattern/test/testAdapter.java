package com.cts.adapterDesignPattern.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.adapterDesignPattern.BugattiVeyron;
import com.cts.adapterDesignPattern.Currency;
import com.cts.adapterDesignPattern.Movable;
import com.cts.adapterDesignPattern.MovableAdapter;
import com.cts.adapterDesignPattern.MovableAdapterImpl;
import com.cts.adapterDesignPattern.currenctConverterAdapter;
import com.cts.adapterDesignPattern.currencyConverter;
import com.cts.adapterDesignPattern.currencyConverterAdapterImpl;

public class testAdapter {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	
	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
		currencyConverter currency = new Currency();
		currenctConverterAdapter currencyConversion = new currencyConverterAdapterImpl(currency);
		
		assertEquals(currencyConversion.getAmount(),84, 0);
	}

}
