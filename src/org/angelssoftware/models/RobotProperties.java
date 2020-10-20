package org.angelssoftware.models;

import org.angelssoftware.interfaces.RobotInterface;
import org.angelssoftware.interfaces.RobotMouseInterface;
import org.angelssoftware.interfaces.RobotPropertiesInterface;
import org.angelssoftware.structures.MoveDirection;

public class RobotProperties implements RobotInterface{
	private int timeDelayInMillis = 20000; //20seconds default
	private int mouseHopInPx = 1; //1pixel is default;
	private MoveDirection moveDirection = MoveDirection.UP;
	private int MAXIMUM_TIME_DELAY_IN_MILLIS = 3600000;
	private int MAXIMUM_PIXEL_AMOUNT = 32000;

	public int getTimeDelayInSeconds() {
		return (timeDelayInMillis / 1000);
	}
	
	@Override
	public int getTimeDelayInMillis() {
		return timeDelayInMillis;
	}
	@Override
	public void setTimeDelayInMillis(int timeDelayInMillis) {
		//dont make this hour long
		if(timeDelayInMillis > MAXIMUM_TIME_DELAY_IN_MILLIS) {
			this.timeDelayInMillis = MAXIMUM_TIME_DELAY_IN_MILLIS;
		}else {
			this.timeDelayInMillis = timeDelayInMillis;
		}
	}
	@Override
	public int getMouseHopInPx() {
		return mouseHopInPx;
	}
	@Override
	public void setMouseHopInPx(int mouseHopInPx) {
		
		//there's only 8K resolution in the market as of now
		if(mouseHopInPx > MAXIMUM_PIXEL_AMOUNT) {
			this.mouseHopInPx = MAXIMUM_PIXEL_AMOUNT;
		}else {
			this.mouseHopInPx = mouseHopInPx;
		}
	}
	@Override
	public MoveDirection getMoveDirection() {
		return moveDirection;
	}
	@Override
	public void setMoveDirection(MoveDirection moveDirection) {
		this.moveDirection = moveDirection;
	}

}
