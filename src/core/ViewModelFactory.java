package core;

import view.controlView.ControlViewVM;
import view.mainView.MainViewVM;

public class ViewModelFactory {

	private ControlViewVM controlViewVM;
	private MainViewVM mainViewVM;

	public ViewModelFactory(ModelFactory mf)
	{
		controlViewVM = new ControlViewVM(mf.getTemperatureModel(),
				mf.getHeaterModel());
		mainViewVM = new MainViewVM(mf.getTemperatureModel(), mf.getHeaterModel());
	}

	public ControlViewVM getControlViewVM()
	{
		return controlViewVM;
	}

	public MainViewVM getMainViewVM()
	{
		return mainViewVM;
	}
}
