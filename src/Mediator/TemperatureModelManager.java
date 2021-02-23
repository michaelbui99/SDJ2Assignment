package Mediator;

import model.temperature.Temperature;
import model.temperature.TemperatureList;
import model.temperature.TemperatureModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TemperatureModelManager implements TemperatureModel {

  private TemperatureList temperatureList;
  private PropertyChangeSupport property;

  public TemperatureModelManager()
  {

    temperatureList = new TemperatureList();
    property = new PropertyChangeSupport(this);
  }

  @Override public void addTemperature(String id, double value)
  {
    Temperature temperature = new Temperature(id, value);
    Temperature old = getLastInsertedTemperature();
    this.temperatureList.addTemperature(temperature);
    if (old != null && old.getValue() != temperature.getValue())
    {
      System.out.println("-->" + temperature + " (from: " + old + ")");
    }
  }

  @Override public Temperature getLastInsertedTemperature()
  {
    return temperatureList.getLastTemperature(null);
  }

  @Override public Temperature getLastInsertedTemperature(String id)
  {
    return temperatureList.getLastTemperature(id);
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {

  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {

  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {

  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {

  }
}
