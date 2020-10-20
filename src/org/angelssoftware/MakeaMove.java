package org.angelssoftware;

import org.angelssoftware.classes.MousePointerMover;
import org.angelssoftware.classes.RobotAutomation;
import org.angelssoftware.models.ApplicationArgumentModel;

public class MakeaMove {

	public static void main(String[] args) {
		ApplicationArgumentModel applicationArgumentModel = new ApplicationArgumentModel(args);
		performASimpleMove(applicationArgumentModel);
	}

	private static void performASimpleMove(ApplicationArgumentModel applicationArgumentModel) {
		try {
			MousePointerMover mousePointer = new MousePointerMover(applicationArgumentModel);
			RobotAutomation robotAutomation = new RobotAutomation(applicationArgumentModel);
			robotAutomation.addRobotAction(mousePointer);
			robotAutomation.runRobotActions();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
