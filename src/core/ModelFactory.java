package core;

import Mediator.HeaterModelManager;
import Mediator.TemperatureModelManager;
import model.temperature.TemperatureModel;
import model.heater.HeaterModel;

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
