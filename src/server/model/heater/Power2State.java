package server.model.heater;

public class Power2State implements HeaterState
{

  private static int POWER =2;

  public Power2State()
  {
    System.out.println("now on PowerState 2");
  }

  @Override public void turnUp(HeaterModel heater) throws InterruptedException
  {
    heater.setState(new Power3State(heater));
  }

  @Override public void turnDown(HeaterModel heater)
  {
    heater.setState(new Power1State());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
