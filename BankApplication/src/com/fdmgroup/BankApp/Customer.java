package com.fdmgroup.BankApp;

public abstract class Customer {
		String firstName;
		String lastName;
		String companyName;
		
		static int idGenerator=2000000;
		
		
		String address;
		int customerID;
		int taxIDnum;
		
		Customer(String companyName, int taxIDnum) {
			this.companyName=companyName;
			this.setCustomerID();
			this.setTaxIDnum(taxIDnum);
		}

		Customer(String firstName, String lastName,String address, int taxIDnum) {
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setAddress(address);
			this.setCustomerID();
			this.setTaxIDnum(taxIDnum);
			
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

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID() {
			this.customerID = idGenerator;
			idGenerator=idGenerator+7;
		}

		public int getTaxIDnum() {
			return taxIDnum;
		}

		public void setTaxIDnum(int taxIDnum) {
			this.taxIDnum = taxIDnum;
		}

		
		
}
