package view.mainView;

import model.heater.HeaterModel;
import model.temperature.TemperatureModel;

public class MainViewVM {

  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;

  public MainViewVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;
  }
}
