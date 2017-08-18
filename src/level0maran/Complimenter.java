package level0maran;

import javax.swing.JOptionPane;

public class Complimenter {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog(null, "what is your name?");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, name+", You're a wizard");
	JOptionPane.showMessageDialog(null, name+", I know");
}
}
