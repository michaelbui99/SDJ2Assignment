package view.linechart;

import model.heater.HeaterModel;
import model.temperature.TemperatureModel;

public class LineChartVM
{
  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;
  public LineChartVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;
  }
}
