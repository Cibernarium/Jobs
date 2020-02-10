/*…s la responsable de gestionar les peticions díun client.
Rep peticions del client (HTTP)
Retorna la informaciÛ com el client la necessita
*/
package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller = new JobsController();

	public static void main(String[] args) throws Exception {

		controller.createBossEmployee("Pepe Boss", "Direcci√≥n molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Direcci√≥n molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Direcci√≥n molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direcci√≥n molona 4", "614266666", "Voluntario 1");
		controller.createManagerEmployee("Pedro Employee", "Direcci√≥n molona 2", "665226666", 80.0);

		controller.payAllEmployeers();

		String allEmployees = controller.getAllEmployees();

		System.out.println("EMPLOYEES: " + allEmployees + " \n");

	}

}
