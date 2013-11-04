package com.fdmgroup.IBS.command;


public class CommandControl {
	
	private Command command;
	
	public void setCommand(Command command){
		this.command=command;
	}
	
	public void pressButton() throws Exception{
		command.execute();
	}

}
