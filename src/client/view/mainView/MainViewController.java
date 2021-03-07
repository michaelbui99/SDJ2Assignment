package client.view.mainView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import client.view.ViewController;
import client.core.ViewHandler;
import client.core.ViewModelFactory;

import java.io.IOException;

public class MainViewController implements ViewController {

	@FXML public Label heaterStage;
	@FXML public Label warning;
	@FXML public Label outsideTemperature;
  @FXML public Label insideTemperature2;
	@FXML public Label insideTemperature1;


	private MainViewVM mainViewVM;
	private ViewHandler viewHandler;
	/**
	 * @see client.view.ViewController#init(client.core.ViewHandler, client.core.ViewModelFactory)
	 */
	public void init(ViewHandler viewHandler, ViewModelFactory vmf)
	{
		mainViewVM = vmf.getMainViewVM();
		this.viewHandler = viewHandler;
		insideTemperature1.textProperty().bind(mainViewVM.indoorTemp1Property());
		insideTemperature2.textProperty().bind(mainViewVM.indoorTemp2Property());
		outsideTemperature.textProperty().bind(mainViewVM.externalTempProperty());
		heaterStage.textProperty().bind(mainViewVM.heaterPowerProperty());
		warning.textProperty().bind(mainViewVM.warningProperty());
	}

	public void onButtonUp(ActionEvent actionEvent) throws InterruptedException
	{

		mainViewVM.turnUpHeater();
	}

	public void onButtonDown(ActionEvent actionEvent)
	{

		mainViewVM.turnDownHeater();
	}

	public void onButtonClose(ActionEvent actionEvent) throws IOException
	{
		System.exit(0);
	}

	public void onButtonSettings(ActionEvent actionEvent) throws IOException
	{
		viewHandler.openView("Control");
	}

}
