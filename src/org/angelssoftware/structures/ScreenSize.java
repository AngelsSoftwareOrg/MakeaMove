package org.angelssoftware.structures;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;


public class ScreenSize {
	private static ScreenSize screenSize;
	private int minX;
	private int minY;
	private int maxX;
	private int maxY;

	private ScreenSize() {
		getMaximumScreenBounds();
	}
	public static ScreenSize getInstance() {
		if(screenSize == null) {
			screenSize = new ScreenSize();
		}
		return screenSize;
	}

	private void getMaximumScreenBounds() {
	    int minx=0, miny=0, maxx=0, maxy=0;
	    GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    for(GraphicsDevice device : environment.getScreenDevices()){
	        Rectangle bounds = device.getDefaultConfiguration().getBounds();
	        minx = Math.min(minx, bounds.x);
	        miny = Math.min(miny, bounds.y);
	        maxx = Math.max(maxx,  bounds.x+bounds.width);
	        maxy = Math.max(maxy, bounds.y+bounds.height);
	    }

	    setMinWidth(minx);
	    setMinHeight(miny);
	    setMaxWidth(maxx);
	    setMaxHeight(maxy);
	}
	
	public int getMinWidth() {
		return minX;
	}

	public void setMinWidth(int minX) {
		this.minX = minX;
	}

	public int getMinHeight() {
		return minY;
	}

	public void setMinHeight(int minY) {
		this.minY = minY;
	}

	public int getMaxWidth() {
		return maxX;
	}

	public void setMaxWidth(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxHeight() {
		return maxY;
	}

	public void setMaxHeight(int maxY) {
		this.maxY = maxY;
	}
	
	@Override
	public String toString() {
		return 	String.format("Min Height: %s, Min Width: %s, Max Height: %s, Max Width: %s", 
				getMinHeight(), getMinWidth(), getMaxHeight(), getMaxWidth());
	}
}
