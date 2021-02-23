package view.mainView;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import view.ViewController;
import core.ViewHandler;
import core.ViewModelFactory;

public class MainViewController implements ViewController {

	public Label insideTemperature;
	public Label heaterStage;
	public Label warning;
	public Label outsideTemperature;
	private MainViewVM mainViewVM;


	/**
	 * @see view.ViewController#init(core.ViewHandler, core.ViewModelFactory)
	 */
	public void init(ViewHandler viewHandler, ViewModelFactory vmf) {

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

	public void onButtonSettings(ActionEvent actionEvent)
	{
	}
}
