package client.model.heater;

import client.model.PropertyChangeSubject;

public interface HeaterModel extends PropertyChangeSubject
{

	public void turnUp() throws InterruptedException;
	public void turnDown();
	public int getPower();
	public void setState(HeaterState heater);


}
