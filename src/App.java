import client.core.ModelFactory;
import client.core.ViewModelFactory;
import client.core.ViewHandler;
import javafx.stage.Stage;
import client.model.heater.HeaterModel;
import client.model.temperature.TemperatureModel;
import client.model.temperature.Thermometer;

public class App extends javafx.application.Application {

	@Override public void start(Stage stage) throws Exception
	{
			ModelFactory modelFactory = new ModelFactory();
			ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory);
			ViewHandler viewHandler = new ViewHandler(stage, viewModelFactory);
			viewHandler.start(stage);
			runTemperature((TemperatureModel) modelFactory.getTemperatureModel(), (HeaterModel) modelFactory.getHeaterModel());
	}

	private void runTemperature(TemperatureModel temperatureModel, HeaterModel heaterModel)
	{
		Thermometer thermometer1 = new Thermometer("t1", 15, 1, temperatureModel, heaterModel);
		Thermometer thermometer2 = new Thermometer("t2", 10, 7, temperatureModel, heaterModel);


		Thread thread1 = new Thread(thermometer1);
		Thread thread2 = new Thread(thermometer2);


		thread1.start();
		thread2.start();


	}
}
