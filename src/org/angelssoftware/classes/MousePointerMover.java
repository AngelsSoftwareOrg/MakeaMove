package org.angelssoftware.classes;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;

import org.angelssoftware.interfaces.RobotActionInterface;
import org.angelssoftware.interfaces.RobotMouseInterface;
import org.angelssoftware.models.RobotProperties;

public class MousePointerMover extends RobotProperties implements RobotActionInterface, RobotMouseInterface{
	private int maxHeight;
	private int maxWidth;
	private Robot localRobot;
	
	public MousePointerMover() throws AWTException {
		commonInitialization();
	}
	
	public MousePointerMover(RobotMouseInterface robotProperties) throws AWTException {
		commonInitialization();
		this.setMouseHopInPx(robotProperties.getMouseHopInPx());
		this.setMoveDirection(robotProperties.getMoveDirection());
	}

	private void commonInitialization() throws AWTException {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setMaxHeight(screenSize.height);
		setMaxWidth(screenSize.width);
		setLocalRobot(new Robot());
	}
	
	private void MakeTheMousePointerMove() {
		Point mousePointer = MouseInfo.getPointerInfo().getLocation();
		int mpX = (int) mousePointer.getX();
		int mpY = (int) mousePointer.getY();
		
		switch(getMoveDirection()) {
			case UP:
				mpY = mpY - 1;
				if(mpY<0) mpY = 1;
				if(mpX<0) mpX = 0;
				break;
			case DOWN:
				mpY = mpY + 1;
				if(mpY>getMaxHeight()) mpY = getMaxHeight() - 1;
				if(mpX<0) mpX = 0;
				break;
			case LEFT:
				mpX = mpX - 1;
				if(mpX<0) mpX = 1;
				if(mpY<0) mpY = 0;
				break;
			case RIGHT:
				mpX = mpX + 1;
				if(mpX>getMaxWidth()) mpX = getMaxWidth() - 1;
				if(mpY<0) mpY = 0;
				break;
		}
		getLocalRobot().mouseMove(mpX, mpY);
	}
	
	@Override
	public void action() {
		MakeTheMousePointerMove();
	}
	
	private int getMaxHeight() {
		return maxHeight;
	}

	private void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	private int getMaxWidth() {
		return maxWidth;
	}

	private void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}

	private Robot getLocalRobot() {
		return localRobot;
	}

	private void setLocalRobot(Robot localRobot) {
		this.localRobot = localRobot;
	}
}
