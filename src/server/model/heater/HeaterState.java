package server.model.heater;

public interface HeaterState {
  public void turnUp(HeaterModel heater) throws InterruptedException;
  public void turnDown(HeaterModel heater);
  public int getPower();

}
