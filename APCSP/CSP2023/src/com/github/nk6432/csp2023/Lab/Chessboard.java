package com.github.nk6432.csp2023.Lab;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Chessboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chessboard frame = new Chessboard();
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
	public Chessboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				JPanel panel_1 = new JPanel();
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						panel_1.setBackground(new Color(0, 0, 0));
					}
				}
				else if (j % 2 == 0) {
					panel_1.setBackground(new Color(255, 255, 255));
				}
				else {
					panel_1.setBackground(new Color(0, 0, 0));
				}
				panel_1.setBounds(18 + i*26, 6 + j*26, 26, 26);
				contentPane.add(panel_1);
			}
		}

	}
}
