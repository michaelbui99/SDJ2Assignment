package Mediator;

import model.heater.HeaterModel;
import model.heater.HeaterState;
import model.heater.PowerOffState;

public class HeaterModelManager implements HeaterModel {

  private HeaterState currentState = new PowerOffState();



  @Override public void turnUp(HeaterState heater) throws InterruptedException
  {

  }

  @Override public void turnDown(HeaterState heater)
  {

  }

  @Override public int getPower()
  {
    return 0;
  }

  @Override public void setState(HeaterState heater)
  {
    currentState = heater;
  }

}
