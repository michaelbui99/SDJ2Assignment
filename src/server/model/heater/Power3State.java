package server.model.heater;

public class Power3State implements HeaterState
{

  private static int POWER =3;
  private HeaterModel heater;
  private Thread t1;

  public Power3State(final HeaterModel heater) throws InterruptedException
  {
    System.out.println("Now on PowerState 3");
    Runnable runnable = ()->{
      try
      {
        System.out.println("Goes to sleep");
        Thread.sleep(10000);
        heater.setState(new Power2State());
      }
      catch (InterruptedException e)
      {
        heater.setState(new Power2State());
      }
    };
    this.heater = heater;
    t1 = new Thread(runnable);
    t1.setDaemon(true);
    t1.start();

  }

  @Override public void turnUp(HeaterModel heater)
  {
    //Do nothing
  }

  @Override public void turnDown(HeaterModel heater)
  {
    t1.interrupt();
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
