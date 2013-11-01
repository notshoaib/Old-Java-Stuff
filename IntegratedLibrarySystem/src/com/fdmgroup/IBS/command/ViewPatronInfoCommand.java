package com.fdmgroup.IBS.command;

import com.fdmgroup.IBS.users.Patron;

public class ViewPatronInfoCommand implements Command {
	
		EmployeeAbility ability;
		Patron p;
		public ViewPatronInfoCommand(EmployeeAbility ability, Patron p){
		this.ability=ability;
		this.p=p;
	}
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			ability.viewPatronInfo(p);
		}

}
