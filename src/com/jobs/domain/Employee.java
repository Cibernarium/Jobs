/*En aquesta capa s’emmagatzemen els objectes (models) necessaris 
pel projecte. 
L’estructura de domini marca com s’organitza tot el software.
Cada classe ha de ser responsable de la seva informació. (Expert)
Es el primer que es desenvolupa d’un projecte, partint d’un model de 
domini
*/

package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

}
