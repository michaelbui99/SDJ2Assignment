package core;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.heater.HeaterModel;
import model.temperature.TemperatureModel;
import view.controlView.ControlViewController;
import view.mainView.MainViewController;

import java.io.IOException;

public class ViewHandler extends javafx.application.Application
{

  private Stage stage;
  private ViewModelFactory vmf;




  public ViewHandler(Stage stage, ViewModelFactory vmf)
  {
    this.vmf = vmf;
    this.stage = stage;
  }

  public void openView(String id) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root= null;
    if (id.equals("Main"))
    {
    loader.setLocation(getClass().getResource("../view/mainView/" + id +"View.fxml"));
    root = loader.load();
      MainViewController viewController = loader.getController();
      viewController.init(this, vmf);
      stage.setTitle("Main View");
    }
    else if (id.equals("Control"))
    {
      loader.setLocation(getClass().getResource("../view/controlView/" + id +"View.fxml"));
      root = loader.load();
      ControlViewController viewController = loader.getController();
      viewController.init(this, vmf);
      stage.setTitle("Control View");
    }
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void closeView() throws IOException
  {
    Platform.exit();
  }

  @Override public void start(Stage stage) throws Exception
  {
    openView("Main");
  }
}
