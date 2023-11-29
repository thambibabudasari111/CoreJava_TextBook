package chapter14_relationship_between_objects;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClass extends Frame {

	// creating a push button and providing action to it using inner class
	AnonymousInnerClass() {
		// create a push button b
		Button b = new Button("OK");

		// add push button to frame
		add(b);

		// add action listener to button
		// MyClass is hidden inner class of ActionListener interface
		// whose name is not written but an object to it created.
		b.addActionListener(new ActionListener() {
			// this method is executed when button is clicked
			public void actionPerformed(ActionEvent ae) {
				// exit the application
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {

		//create a frame by creating AnonymousInnerClass object
		AnonymousInnerClass obj = new AnonymousInnerClass();
		
		//set the size of frame to width: 400 px and height: 300 px
		obj.setSize(400,300);
		
		//display the frame
		obj.setVisible(true);
	}

}
