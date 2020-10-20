package org.angelssoftware;

import java.awt.AWTException;

import org.angelssoftware.classes.MousePointerMover;
import org.angelssoftware.classes.RobotAutomation;
import org.angelssoftware.models.ApplicationArgumentModel;
import org.angelssoftware.structures.MoveDirection;

public class MakeaMove {

	public static void main(String[] args) {
		ApplicationArgumentModel applicationArgumentModel = new ApplicationArgumentModel(args);
		performASimpleMove(applicationArgumentModel);
	}
	

	private static void performASimpleMove(ApplicationArgumentModel applicationArgumentModel) {
		try {
			applicationArgumentModel.setTimeDelayInMillis(1000);
						
			MousePointerMover mousePointer = new MousePointerMover(applicationArgumentModel);
			mousePointer.setMoveDirection(MoveDirection.DOWN);
			mousePointer.setMouseHopInPx(3);

			RobotAutomation robotAutomation = new RobotAutomation(applicationArgumentModel);
			robotAutomation.addRobotAction(mousePointer);
			robotAutomation.runRobotActions();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
