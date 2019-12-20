package eg.edu.alexu.csd.oop.game;
import eg.edu.alexu.csd.oop.game.MainGui.MainFrame;
import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;
import java.util.logging.*;


public class Main {
	public static void main(String[] args)  {
         Log.getInstance().getLog().info("Game opened ");
		SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
	}
}

