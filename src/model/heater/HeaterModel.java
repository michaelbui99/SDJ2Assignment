package model.heater;

import Mediator.HeaterModelManager;

public interface HeaterModel {

	public void turnUp(HeaterState heater) throws InterruptedException;
	public void turnDown(HeaterState heater);
	public int getPower();
	public void setState(HeaterState heater);

	 HeaterState heaterState = null;

}
