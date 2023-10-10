package is.test.minimal.ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public final class AppPanel extends JPanel {

  public AppPanel() {
    setLayout(new BorderLayout());
    add(new JLabel("Testing"), BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, new AppPanel());
  }
}
