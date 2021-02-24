package view.controlView;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import model.heater.HeaterModel;
import model.temperature.TemperatureModel;


public class ControlViewVM {

  private TemperatureModel temperatureModel;
  private StringProperty max;
  private StringProperty min;

  public ControlViewVM(TemperatureModel temperatureModel, HeaterModel heaterModel)
  {
    this.temperatureModel = temperatureModel;
    max = new SimpleStringProperty();
    min = new SimpleStringProperty();
  }



  public void updateMaxAndMin(String min, String max)
  {
    temperatureModel.addTemperature("max", Double.parseDouble(max));
    temperatureModel.addTemperature("min", Double.parseDouble(min));
  }


}
