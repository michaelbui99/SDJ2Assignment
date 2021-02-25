package view.mainView;

import javafx.application.Platform;
import javafx.beans.property.*;
import model.heater.HeaterModel;
import model.temperature.Temperature;
import model.temperature.TemperatureModel;

import java.beans.PropertyChangeEvent;

public class MainViewVM
{

  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;
  private StringProperty indoorTemp1;
  private StringProperty indoorTemp2;
  private StringProperty heaterPower;
  private StringProperty externalTemp;
  private double min;
  private double max;
  private StringProperty warning;

  public MainViewVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    this.heaterModel = heaterModel;
    temperatureModel.addPropertyChangeListener("TemperatureChange",
        this::updateThermometer);
//    temperatureModel
//        .addPropertyChangeListener("TemperatureChange", this::updateHeater);
    heaterModel.addPropertyChangeListener("StateChange", this::updateHeater);

    indoorTemp1 = new SimpleStringProperty("No updates yet");
    indoorTemp2 = new SimpleStringProperty("No updates yet");
    externalTemp = new SimpleStringProperty("No Updates yet");
    heaterPower = new SimpleStringProperty(String.valueOf(heaterModel.getPower()));
    min = 0;
    max = 0;
    warning = new SimpleStringProperty("");
  }

  public void turnUpHeater() throws InterruptedException
  {
    heaterModel.turnUp();
    heaterPower.setValue(String.valueOf(heaterModel.getPower()));
  }

  public StringProperty heaterPowerProperty()
  {
    return heaterPower;
  }

  public int getHeaterPower()
  {
    return heaterModel.getPower();
  }

  public void turnDownHeater()
  {
    heaterModel.turnDown();
    heaterPower.setValue(String.valueOf(heaterModel.getPower()));
  }

  public StringProperty externalTempProperty()
  {
    return externalTemp;
  }
  public StringProperty indoorTemp1Property()
  {
    return indoorTemp1;
  }

  public StringProperty indoorTemp2Property()
  {
    return indoorTemp2;
  }

  public StringProperty warningProperty()
  {
    return warning;
  }

  public void updateHeater(PropertyChangeEvent evt)
  {
    Platform.runLater(() -> {
      heaterPower.setValue(String.valueOf(heaterModel.getPower()));
    });
  }

  public void updateThermometer(PropertyChangeEvent evt)
  {
    Platform.runLater(() -> {
      if (((Temperature) evt.getNewValue()).getId().equals("min"))
      {
        min = ((Temperature) evt.getNewValue()).getValue();
      }
      if (((Temperature) evt.getNewValue()).getId().equals("max"))
      {
        max = ((Temperature) evt.getNewValue()).getValue();
      }
      if (((Temperature) evt.getNewValue()).getId().equals("t1"))
      {
        if ((((Temperature) evt.getNewValue()).getValue() < min
            || ((Temperature) evt.getNewValue()).getValue() > max) && max > 0 && min > 0)
        {
          warningProperty().setValue("Warning!! temp 1 is out of bounds");
        }

        indoorTemp1Property().setValue(evt.getNewValue().toString());
      }
      else if ((((Temperature) evt.getNewValue()).getId()).equals("t2"))
      {
        if ((((Temperature) evt.getNewValue()).getValue() < min
            || ((Temperature) evt.getNewValue()).getValue() > max) && max > 0 && min > 0)
        {
          warningProperty().setValue("Warning!! temp 2 is out of bounds");
        }
        indoorTemp2Property().setValue(evt.getNewValue().toString());
      }
      else if ((((Temperature) evt.getNewValue()).getId().equals("t0")))
      {
        externalTemp.setValue(evt.getNewValue().toString());
      }
    });
  }
}
