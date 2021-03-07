package client.model.heater;

public class Power1State implements HeaterState {
  private final static int POWER =1;

  public Power1State()
  {
    System.out.println("now on PowerState 1");
  }

  @Override public void turnUp(HeaterModel heater)
  {
    heater.setState(new Power2State());
  }

  @Override public void turnDown(HeaterModel heater)
  {
    heater.setState(new PowerOffState());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
