import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

public class TimerExample 
{
    Random rand = new Random();
    static int currRand;

    TimerExample() {
        currRand = rand.nextInt(12);
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                currRand = rand.nextInt(12);
            }
        };
		javax.swing.Timer timer = new javax.swing.Timer(50, actionListener);
        timer.start();
    }
}
		
