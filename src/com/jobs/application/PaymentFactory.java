/*
 * És la capa de negoci. És la que conté gran part de la lògica del 
software.
És la capa controladora del software. 
No sap fer gairebé res pel seu compte, però sap a qui ha de 
demanar cada cosa i com fer-ho.

 */
package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;//todo 
			}
		};
	}
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.10; 
			}
		};
	}
}
