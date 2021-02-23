package model.heater;

import Mediator.HeaterModelManager;

public interface HeaterModel {

	public void turnUp() throws InterruptedException;
	public void turnDown();
	public int getPower();
	public void setState(HeaterState heater);

	 HeaterState heaterState = null;

}
