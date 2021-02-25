package view.linechart;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.heater.HeaterModel;
import model.temperature.TemperatureModel;
import model.temperature.Thermometer;

public class LineChartVM
{
  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;

  private StringProperty xA;
  private StringProperty yA;

  public LineChartVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;

    xA = new SimpleStringProperty("Time");
    yA = new SimpleStringProperty("Temperature");
  }

  public StringProperty getXaProperty()
  {
    return xA;
  }

  public StringProperty getYaProperty()
  {
    return yA;
  }
}
