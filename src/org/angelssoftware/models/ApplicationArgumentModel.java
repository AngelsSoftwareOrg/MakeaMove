package org.angelssoftware.models;

import org.angelssoftware.structures.MoveDirection;

public class ApplicationArgumentModel extends RobotProperties{

	private String[] originalArguments;
	
	public ApplicationArgumentModel(String[] args) {
		originalArguments = args.clone();
	}


}
