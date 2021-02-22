package model.heater;

import Mediator.HeaterModelManager;

public interface HeaterState {
  public void turnUp(HeaterModelManager heater) throws InterruptedException;
  public void turnDown(HeaterModelManager heater);
  public int getPower();

}
