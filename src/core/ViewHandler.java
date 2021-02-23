package core;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.heater.HeaterModel;
import model.temperature.TemperatureModel;
import view.ViewController;
import view.controlView.ControlViewController;
import view.mainView.MainViewController;

import javax.naming.ldap.Control;
import java.io.IOException;

public class ViewHandler
{

  private Stage stage;
  private Scene currentScene;
  private ViewModelFactory vmf;
  private TemperatureModel temperatureModel;
  private HeaterModel heaterModel;
//  private MainViewController mainViewController;
//  private ControlViewController controlViewController;


  public ViewHandler(Stage stage, ViewModelFactory vmf)
  {
    this.vmf = vmf;
    this.stage = stage;
  }


  public void start() throws IOException
  {
    openView("Main");
  }

  public void openView(String id) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root= null;
    loader.setLocation(getClass().getResource(id+"View.fxml"));
    root = loader.load();
    if (id.equals("Main"))
    {
      MainViewController viewController = loader.getController();
      viewController.init(this, vmf);
      stage.setTitle("Main View");
    }
    else if (id.equals("Control"))
    {
      ControlViewController viewController = loader.getController();
      viewController.init(this, vmf);
      stage.setTitle("Control View");
    }
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

}
