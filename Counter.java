import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener{
//Declare variables
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;
  //Create the constructor
  Counter(){
    //Create the frame
    JFrame frm = new JFrame("Let's Count");
    frm.setLayout(new FlowLayout());
    frm.setSize(200,110);
    //Create the buttons
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    //Initialize our counters
    leftCount = 0;
    rightCount = 0;
    //Add ActionListeners
    left.addActionListener(this);
    right.addActionListener(this);
    frm.add(left);
    frm.add(right);
    //Initialize labels
    leftLabel = new JLabel("Count: " + leftCount);
    rightLabel = new JLabel("Count: " + rightCount);
    frm.add(leftLabel);
    frm.add(rightLabel);
    //Reset button
    JButton resetButton = new JButton("Reset");
    resetButton.addActionListener(this);
    frm.add(resetButton);
    frm.setVisible(true);
  }
  //ActionPerformed method
  public void actionPerformed(ActionEvent ae){
    if (ae.getActionCommand().equals("Left")){
      leftCount++;
      leftLabel.setText("Count: " + leftCount);     
    }else if (ae.getActionCommand().equals("Right")){
      rightCount++;
      rightLabel.setText("Count: " + rightCount);
    }else if(ae.getActionCommand().equals("Reset")){
      leftCount = 0;
      rightCount = 0;
      leftLabel.setText("Count: " + leftCount); 
      rightLabel.setText("Count: " + rightCount);
    }
  }
}