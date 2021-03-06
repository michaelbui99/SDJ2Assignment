package view.controlView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.temperature.Temperature;
import view.ViewController;
import core.ViewHandler;
import core.ViewModelFactory;

import java.io.IOException;

public class ControlViewController implements ViewController {

	@FXML private TextField max;
	@FXML private TextField min;
	private ControlViewVM controlViewVM;
	private ViewHandler viewHandler;


	/**
	 * @see view.ViewController#init(core.ViewHandler, core.ViewModelFactory)
	 */
	public void init(ViewHandler viewHandler, ViewModelFactory vmf)
	{
		controlViewVM = vmf.getControlViewVM();
		this.viewHandler = viewHandler;
		max.textProperty().bindBidirectional(controlViewVM.maxProperty());
		min.textProperty().bindBidirectional(controlViewVM.minProperty());
	}

	public void onButtonBack(ActionEvent actionEvent) throws IOException
	{
		viewHandler.openView("Main");
	}

	public void onButtonUpdate(ActionEvent actionEvent)
	{
		controlViewVM.updateMaxAndMin(min.getText(), max.getText());
	}
}
