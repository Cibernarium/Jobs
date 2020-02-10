/*En aquesta capa s’emmagatzemen els objectes (models) necessaris 
pel projecte. 
L’estructura de domini marca com s’organitza tot el software.
Cada classe ha de ser responsable de la seva informació. (Expert)
Es el primer que es desenvolupa d’un projecte, partint d’un model de 
domini
*/

package com.jobs.domain;

public interface IPaymentRate {
	public double pay(double salaryPerMonth);
}
