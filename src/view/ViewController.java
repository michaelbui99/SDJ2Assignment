package view;

import core.ViewHandler;
import core.ViewModelFactory;

public interface ViewController {

	public abstract void init(ViewHandler viewHandler, ViewModelFactory vmf);

}
