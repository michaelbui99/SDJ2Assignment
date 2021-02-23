package model.heater;

import Mediator.HeaterModelManager;

public interface HeaterState {
  public void turnUp(HeaterModel heater) throws InterruptedException;
  public void turnDown(HeaterModel heater);
  public int getPower();

}
