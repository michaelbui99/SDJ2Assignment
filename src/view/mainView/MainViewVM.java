package view.mainView;

import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;
import model.heater.HeaterModel;
import model.temperature.TemperatureModel;

import java.beans.PropertyChangeEvent;

public class MainViewVM {

  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;
  private DoubleProperty indoorTemp1;
  private DoubleProperty indoorTemp2;

  public MainViewVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;
  }

  public void updateThermoeter(PropertyChangeEvent evt)
  {

  }
}
