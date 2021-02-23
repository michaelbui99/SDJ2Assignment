package view.mainView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import view.ViewController;
import core.ViewHandler;
import core.ViewModelFactory;

import java.io.IOException;

public class MainViewController implements ViewController {

	@FXML public Label insideTemperature;
	@FXML public Label heaterStage;
	@FXML public Label warning;
	@FXML public Label outsideTemperature;
  @FXML public Label insideTemperatureOne;
	@FXML public Label outsideTemperatureThree;
	@FXML public Label insideTemperatureTwo;

	private MainViewVM mainViewVM;
	private ViewHandler viewHandler;
	/**
	 * @see view.ViewController#init(core.ViewHandler, core.ViewModelFactory)
	 */
	public void init(ViewHandler viewHandler, ViewModelFactory vmf)
	{
		mainViewVM = vmf.getMainViewVM();
		this.viewHandler = viewHandler;
	}

	public void onButtonUp(ActionEvent actionEvent)
	{

	}

	public void onButtonDown(ActionEvent actionEvent)
	{
	}

	public void onButtonClose(ActionEvent actionEvent)
	{
	}

	public void onButtonSettings(ActionEvent actionEvent) throws IOException
	{
		viewHandler.openView("Control");
	}
}
