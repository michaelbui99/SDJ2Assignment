package client.core;

import client.Mediator.HeaterModelManager;
import client.Mediator.TemperatureModelManager;
import client.model.temperature.TemperatureModel;
import client.model.heater.HeaterModel;

public class ModelFactory {
  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;

  public TemperatureModel getTemperatureModel()
  {
    if (temperatureModel == null)
    {
      temperatureModel = new TemperatureModelManager();
    }
    return temperatureModel;
  }

  public HeaterModel getHeaterModel()
  {
    if (heaterModel == null)
    {
      heaterModel = new HeaterModelManager();
    }
    return heaterModel;
  }

}
