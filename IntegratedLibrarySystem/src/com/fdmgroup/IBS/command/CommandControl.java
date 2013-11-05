package com.fdmgroup.IBS.command;

public class CommandControl<E> {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public Object pressButton() throws Exception {
		return command.execute();

	}

}
