package Mediator;

import model.PropertyChangeSubject;
import model.heater.HeaterModel;
import model.heater.HeaterState;
import model.heater.PowerOffState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class HeaterModelManager implements HeaterModel {

  private HeaterState currentState = new PowerOffState();
  private PropertyChangeSupport support = new PropertyChangeSupport(this);


  @Override public void turnUp() throws InterruptedException
  {
    currentState.turnUp(this);
  }

  @Override public void turnDown()
  {
    currentState.turnDown(this);
  }

  @Override public int getPower()
  {
    return currentState.getPower();
  }

  @Override public void setState(HeaterState heater)
  {
    currentState = heater;
    support.firePropertyChange("StateChange", null, currentState);
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(name, listener);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(name, listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }
}
