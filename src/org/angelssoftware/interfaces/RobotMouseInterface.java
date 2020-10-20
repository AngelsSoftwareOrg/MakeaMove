package org.angelssoftware.interfaces;

import org.angelssoftware.structures.MoveDirection;

public interface RobotMouseInterface {
	public int getMouseHopInPx();
	public void setMouseHopInPx(int mouseHopInPx);
	public MoveDirection getMoveDirection();
	public void setMoveDirection(MoveDirection moveDirection);
}
