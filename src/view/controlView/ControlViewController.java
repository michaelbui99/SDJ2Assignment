package view.controlView;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import view.ViewController;
import core.ViewHandler;
import core.ViewModelFactory;

public class ControlViewController implements ViewController {

	public TextField max;
	public TextField min;
	private ControlViewVM controlViewVM;


	/**
	 * @see view.ViewController#init(core.ViewHandler, core.ViewModelFactory)
	 */
	public void init(ViewHandler viewHandler, ViewModelFactory vmf) {

	}

	public void onButtonBack(ActionEvent actionEvent)
	{
	}

	public void onButtonUpdate(ActionEvent actionEvent)
	{
	}
}
