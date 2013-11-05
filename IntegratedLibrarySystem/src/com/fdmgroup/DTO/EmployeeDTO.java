package com.fdmgroup.DTO;

import com.fdmgroup.IBS.users.Employee;

public class EmployeeDTO{
	
	EmployeeDTO eDTO;
	
	String firstName;
	String lastName;
	int userID;
	
		public EmployeeDTO(Employee e){
			this.firstName=e.getfirstName();
			this.lastName=e.getLastName();
			this.userID=e.getUserID();
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public EmployeeDTO geteDTO() {
			return eDTO;
		}

		public void seteDTO(EmployeeDTO eDTO) {
			this.eDTO = eDTO;
		}


		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

}
