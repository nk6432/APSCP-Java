package com.github.nk6432.csp2023.Lab;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Target extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Target frame = new Target();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Target() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel[] arr = new JPanel[5];

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 500, true));
		panel.setBounds(88, 6, 250, 250);
		for (int i = 0; i < 5; i++) {
			Color color = new Color(0, 0, 0);
			Color color2 = new Color(255, 255, 255);

			if (i % 2 == 0) {
				color = new Color(255, 255, 255);
				color2 = new Color(0, 0, 0);
			}
			if (i==3) {
				color = new Color(0, 0, 0);
				color2 = new Color(255, 0, 0);
			}
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(color);
			panel_1.setBorder(new LineBorder(color2, 500, true));
			panel_1.setBounds(87+i*35, 6+i*35, 250-i*70, 250-i*70);
			arr[i] = panel_1;

		}

		for (int i = 4; i >= 0; i--) {
			contentPane.add(arr[i]);
		}


		contentPane.add(panel);

	}
}
