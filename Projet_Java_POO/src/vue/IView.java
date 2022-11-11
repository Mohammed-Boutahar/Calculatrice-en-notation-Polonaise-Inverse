package vue;

import java.awt.event.ActionEvent;
import java.util.List;

public interface IView {
	
	public void affiche();
	public void change(List<String> data) ;
	public void change(String accu);
	void handle(ActionEvent arg0);
}
