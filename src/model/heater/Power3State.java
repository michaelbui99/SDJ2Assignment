package model.heater;

import Mediator.HeaterModelManager;

public class Power3State implements HeaterState {

  private static int POWER =3;
  private HeaterModelManager heater;
  private Thread t1;

  public Power3State(final HeaterModelManager heater) throws InterruptedException
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

  @Override public void turnUp(HeaterModelManager heater)
  {
    //Do nothing
  }

  @Override public void turnDown(HeaterModelManager heater)
  {
    t1.interrupt();
  }

  @Override public int getPower()
  {
    return 0;
  }
}
