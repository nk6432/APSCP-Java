package com.github.nk6432.csp2023.Lab;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Snowman extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Snowman frame = new Snowman();
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
	public Snowman() {
		setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1_4_1_1 = new JPanel();
		contentPane_1_4_1_1.setBounds(378, 40, 5, 5);
		contentPane.add(contentPane_1_4_1_1);
		contentPane_1_4_1_1.setLayout(null);
		contentPane_1_4_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_4_1_1.setBackground(Color.BLACK);
		
		JPanel contentPane_1_4_1 = new JPanel();
		contentPane_1_4_1.setBounds(359, 40, 5, 5);
		contentPane_1_4_1.setLayout(null);
		contentPane_1_4_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_4_1.setBackground(Color.BLACK);
		contentPane.add(contentPane_1_4_1);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(0, 214, 450, 58);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(0, 0, 255));
		contentPane.add(contentPane_1);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setBounds(312, 121, 100, 100);
		contentPane_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 500, true));
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBackground(new Color(0, 255, 255));
		
		
		contentPane.add(contentPane_1_1);
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setBounds(333, 69, 56, 53);
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 500, true));
		contentPane_1_1_1.setBackground(Color.CYAN);
		contentPane.add(contentPane_1_1_1);
		
		JPanel contentPane_1_1_2 = new JPanel();
		contentPane_1_1_2.setBounds(349, 30, 40, 40);
		contentPane_1_1_2.setLayout(null);
		contentPane_1_1_2.setBorder(new LineBorder(new Color(255, 255, 255), 500, true));
		contentPane_1_1_2.setBackground(Color.CYAN);
		contentPane.add(contentPane_1_1_2);
		
		JPanel contentPane_1_5 = new JPanel();
		contentPane_1_5.setBounds(4, 18, 30, 11);
		contentPane_1_1_2.add(contentPane_1_5);
		contentPane_1_5.setLayout(null);
		contentPane_1_5.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_5.setBackground(new Color(255, 255, 255));
		
		JPanel contentPane_1_1_2_1 = new JPanel();
		contentPane_1_1_2_1.setBounds(6, 18, 28, 16);
		contentPane_1_1_2.add(contentPane_1_1_2_1);
		contentPane_1_1_2_1.setLayout(null);
		contentPane_1_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 50, true));
		contentPane_1_1_2_1.setBackground(new Color(255, 255, 255));
		
		JPanel contentPane_1_2 = new JPanel();
		contentPane_1_2.setBounds(333, 30, 79, 1);
		contentPane_1_2.setLayout(null);
		contentPane_1_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_2.setBackground(new Color(0, 0, 0));
		contentPane.add(contentPane_1_2);
		
		JPanel contentPane_1_3 = new JPanel();
		contentPane_1_3.setBounds(349, 15, 40, 16);
		contentPane.add(contentPane_1_3);
		contentPane_1_3.setLayout(null);
		contentPane_1_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_3.setBackground(new Color(0, 0, 0));
		
		JPanel contentPane_1_4 = new JPanel();
		contentPane_1_4.setBounds(295, 94, 117, 1);
		contentPane.add(contentPane_1_4);
		contentPane_1_4.setLayout(null);
		contentPane_1_4.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_4.setBackground(new Color(0, 0, 0));
		
		JPanel contentPane_1_1_3 = new JPanel();
		contentPane_1_1_3.setBounds(-35, -37, 100, 100);
		contentPane_1_1_3.setLayout(null);
		contentPane_1_1_3.setBorder(new LineBorder(new Color(255, 255, 0), 500, true));
		contentPane_1_1_3.setBackground(Color.CYAN);
		contentPane.add(contentPane_1_1_3);
	}
}
