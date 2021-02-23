package view.controlView;

import model.heater.HeaterModel;
import model.temperature.TemperatureModel;

public class ControlViewVM {

  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;

  public ControlViewVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;
  }

}
