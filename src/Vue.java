
import java.awt.Button;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

public class Vue extends Button implements Observer {
	
	public Vue() {
		super();
		this.setLabel("0");
		this.setPreferredSize(new Dimension(500,50));
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setLabel((String)arg);
	}

}
