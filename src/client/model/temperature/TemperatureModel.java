package client.model.temperature;

import client.model.PropertyChangeSubject;

public interface TemperatureModel extends PropertyChangeSubject {

  void addTemperature(String id, double temperature);

  Temperature getLastInsertedTemperature();

  Temperature getLastInsertedTemperature(String id);

}
