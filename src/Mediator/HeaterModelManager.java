package Mediator;

import model.heater.HeaterModel;
import model.heater.HeaterState;
import model.heater.PowerOffState;

public class HeaterModelManager implements HeaterModel {

  private HeaterState currentState = new PowerOffState();



  @Override public void turnUp() throws InterruptedException
  {
    currentState.turnUp(this);
  }

  @Override public void turnDown()
  {
    currentState.turnDown(this);
  }

  @Override public int getPower()
  {
    return currentState.getPower();
  }

  @Override public void setState(HeaterState heater)
  {
    currentState = heater;
  }

}
