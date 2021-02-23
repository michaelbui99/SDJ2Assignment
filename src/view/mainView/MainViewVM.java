package view.mainView;

import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.heater.HeaterModel;
import model.temperature.Temperature;
import model.temperature.TemperatureModel;

import java.beans.PropertyChangeEvent;

public class MainViewVM {

  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;
  private StringProperty indoorTemp1;
  private StringProperty indoorTemp2;

  public MainViewVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;
    temperatureModel.addPropertyChangeListener("TemperatureChange", this::updateThermometer);
    indoorTemp1 = new SimpleStringProperty("Hello there");
    indoorTemp2 = new SimpleStringProperty("Hello there");
  }

  public void turnUpHeater() throws InterruptedException
  {
    heaterModel.turnUp();
  }

  public void turnDownHeater()
  {
    heaterModel.turnDown();
  }


  public StringProperty indoorTemp1Property()
  {
    return indoorTemp1;
  }

  public StringProperty indoorTemp2Property()
  {
    return indoorTemp2;
  }



  public void updateThermometer(PropertyChangeEvent evt)
  {
    Platform.runLater(() -> {
      if(((Temperature) evt.getNewValue()).getId().equals("thermometer1"))
      {
      indoorTemp1Property().setValue(evt.getNewValue().toString());
      }
      else if ((((Temperature) evt.getNewValue()).getId()).equals("thermometer2"))
      indoorTemp2Property().setValue(evt.getNewValue().toString());
    });
  }
}
