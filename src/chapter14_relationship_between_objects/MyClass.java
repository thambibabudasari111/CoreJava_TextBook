package chapter14_relationship_between_objects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//MyClass should implement the methods of ActionListener
public class MyClass implements ActionListener {

	// this method is executed when button is clicked
	public void actionPerformed(ActionEvent ae) {
		// exit the application
		System.exit(0);
	}
}
