package client.view;

import client.core.ViewHandler;
import client.core.ViewModelFactory;

public interface ViewController {

	public abstract void init(ViewHandler viewHandler, ViewModelFactory vmf);

}
