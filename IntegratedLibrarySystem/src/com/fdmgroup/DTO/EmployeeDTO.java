package com.fdmgroup.DTO;

import com.fdmgroup.IBS.users.Employee;

public class EmployeeDTO {
	
	EmployeeDTO eDTO;
	
	String name;
	int userID;
	
		public EmployeeDTO(Employee e){
			this.name=e.getName();
			this.userID=e.getUserID();
		}

		public EmployeeDTO geteDTO() {
			return eDTO;
		}

		public void seteDTO(EmployeeDTO eDTO) {
			this.eDTO = eDTO;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

}
