package view.controlView;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.heater.HeaterModel;
import model.temperature.TemperatureModel;

import java.beans.PropertyChangeEvent;

public class ControlViewVM {

  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;

  private StringProperty max;
  private StringProperty min;

  public ControlViewVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;
    max = new SimpleStringProperty();
    min = new SimpleStringProperty();
  }

  public StringProperty maxProperty()
  {
    return max;
  }

  public StringProperty minProperty()
  {
    return min;
  }

  public void updateMaxAndMin()
  {
    temperatureModel.addTemperature("max", Double.parseDouble(max.getValue()));
    temperatureModel.addTemperature("min", Double.parseDouble(min.getValue()));
  }


}
