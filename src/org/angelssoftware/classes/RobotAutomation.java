package org.angelssoftware.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.angelssoftware.interfaces.RobotActionInterface;
import org.angelssoftware.models.ApplicationArgumentModel;

public class RobotAutomation {
	private ApplicationArgumentModel applicationArgumentModel;
	private List<RobotActionInterface> listRobotActions;
	
	public RobotAutomation(ApplicationArgumentModel applicationArgumentModel) {
		this.applicationArgumentModel = applicationArgumentModel;
		this.listRobotActions = new ArrayList<RobotActionInterface>();
	}

	public void runRobotActions() {
        Timer timer = new Timer();

        //delay - delay in milliseconds before task is to be executed.
        long delay = 100;
        //period - time in milliseconds between successive task executions.
        long period = applicationArgumentModel.getTimeDelayInMillis();
        
		TimerTask timerTask = new TimerTask() {
		    @Override
		    public void run() {
		    	for(RobotActionInterface robotIf : listRobotActions) {
		    		robotIf.action();
		    	}
		    }
		};
		
		timer.schedule(timerTask, delay, period);
	}
	
	
	public void addRobotAction(RobotActionInterface robotAction) {
		listRobotActions.add(robotAction);
	}

	public void clearRobotActions() {
		listRobotActions.clear();
	}
	
	public void removeRobotAction(RobotActionInterface robotAction) {
		listRobotActions.remove(robotAction);
	}

}
