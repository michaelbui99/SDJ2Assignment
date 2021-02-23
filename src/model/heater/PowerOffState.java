package model.heater;

import Mediator.HeaterModelManager;
import Mediator.TemperatureModelManager;

public class PowerOffState implements HeaterState {

  private static int POWER =0;

  @Override public void turnUp(HeaterModel heater)
  {
    heater.setState(new Power1State());
  }

  @Override public void turnDown(HeaterModel heater)
  {
    //Do nothing
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
