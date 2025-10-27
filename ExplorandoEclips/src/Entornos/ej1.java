package Entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class ej1 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej1 window = new ej1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ej1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(90, 22, 0, 0);
		panel.add(table);
		
		JButton button = new JButton("New button");
		button.setBounds(10, 18, 89, 23);
		panel.add(button);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(100, 121, 89, 23);
		panel.add(btnNewButton);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(315, 147, 55, 34);
		panel.add(internalFrame);
		internalFrame.setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(343, 21, 1, 1);
		panel.add(layeredPane);
	}

}
