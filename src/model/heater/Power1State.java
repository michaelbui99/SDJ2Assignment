package model.heater;

import Mediator.HeaterModelManager;

public class Power1State implements HeaterState {
  private static int POWER =1;

  public Power1State()
  {
    System.out.println("now on PowerState 1");
  }

  @Override public void turnUp(HeaterModelManager heater)
  {
    heater.setState(new Power2State());
  }

  @Override public void turnDown(HeaterModelManager heater)
  {
    heater.setState(new PowerOffState());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
