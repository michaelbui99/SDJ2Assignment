package view.linechart;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import view.ViewController;

import java.io.IOException;

public class LineChartController implements ViewController
{
  @FXML private LineChart lineChart;
  private NumberAxis xA = new NumberAxis();
  private NumberAxis yA = new NumberAxis();
  private LineChartVM lineChartVM;
  private ViewHandler viewHandler;

  @Override public void init(ViewHandler viewHandler, ViewModelFactory vmf)
  {
    lineChartVM = vmf.getLineChartVM();
    this.viewHandler = viewHandler;
    lineChart = new LineChart(xA, yA);

  }

  public void onButtonBack(ActionEvent actionEvent) throws IOException
  {
    viewHandler.openView("Main");
  }

  public void onButtonUpdateChart(ActionEvent actionEvent)
  {
    xA.setLabel(String.valueOf(lineChartVM.getXaProperty()));
    yA.setLabel(String.valueOf(lineChartVM.getYaProperty()));
  }

}
