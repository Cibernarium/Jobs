/*
 * Aquesta capa fa d�intermediari entre el controlador i la bases de 
dades. 
Permet separar el codi de la bases de dades. Aix�, si es canvia de 
sistema gestor, no afecta a tot el codi. 
No ha de contenir l�gica de negoci, nom�s llegeix, emmagatzema i 
actualitza la informaci�n

 */
  package com.jobs.persistence;


import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;


public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();
	
	public EmployeeRepository(){
		
	}
	
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	
	
}
