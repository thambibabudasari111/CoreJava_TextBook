package chapter14_relationship_between_objects;

import java.awt.Button;
import java.awt.Frame;

public class Button_Class extends Frame {

	Button_Class() {
		// create a push button b
		Button b = new Button("OK");

		// add push button to frame
		add(b);

		// add action listener to button.
		// MyClass is implementation class of ActionListener interface
		b.addActionListener(new MyClass());
	}

	public static void main(String[] args) {

		// create a frame by creating Button_Class object
		Button_Class obj = new Button_Class();

		// set the size of frame to width: 400 px and height: 300 px
		obj.setSize(400, 300);

		// display the frame
		obj.setVisible(true);

	}

}
