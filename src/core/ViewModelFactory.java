package core;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import view.controlView.ControlViewVM;
import view.linechart.LineChartVM;
import view.mainView.MainViewVM;

public class ViewModelFactory {

	private ControlViewVM controlViewVM;
	private MainViewVM mainViewVM;
	private LineChartVM lineChartVM;
	private XYChart.Data x = new LineChart.Data(0, 0);

	public ViewModelFactory(ModelFactory mf)
	{
		controlViewVM = new ControlViewVM(mf.getTemperatureModel(),
				mf.getHeaterModel());
		mainViewVM = new MainViewVM(mf.getTemperatureModel(), mf.getHeaterModel());
		lineChartVM = new LineChartVM(mf.getTemperatureModel(), mf.getHeaterModel());
	}

	public ControlViewVM getControlViewVM()
	{
		return controlViewVM;
	}

	public MainViewVM getMainViewVM()
	{
		return mainViewVM;
	}

	public LineChartVM getLineChartVM()
	{
		return lineChartVM;
	}
}
