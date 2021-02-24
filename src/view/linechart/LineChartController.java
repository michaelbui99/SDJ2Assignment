package view.linechart;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import view.ViewController;
import view.mainView.MainViewVM;

import java.io.IOException;

public class LineChartController implements ViewController
{

  @FXML private LineChart lineChart;
  private LineChartVM lineChartVM;
  private ViewHandler viewHandler;

  @Override public void init(ViewHandler viewHandler, ViewModelFactory vmf)
  {
    lineChartVM = vmf.getLineChartVM();
    this.viewHandler = viewHandler;

  }

  public void onButtonBack(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Main");
  }

  public void onButtonUpdateChart(ActionEvent actionEvent)
  {
  }

}
