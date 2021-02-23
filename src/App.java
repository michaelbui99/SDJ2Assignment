import Mediator.TemperatureModelManager;
import core.ModelFactory;
import core.ViewModelFactory;
import core.ViewHandler;
import javafx.stage.Stage;
import model.temperature.Thermometer;

public class App extends javafx.application.Application {

	@Override public void start(Stage stage) throws Exception
	{
			ModelFactory modelFactory = new ModelFactory();
			ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory);
			ViewHandler viewHandler = new ViewHandler(stage, viewModelFactory);
			viewHandler.start();
	}

	private void runTemperature(TemperatureModelManager temperatureModelManager)
	{
		Thermometer thermometer1 = new Thermometer("t1")
	}
}
