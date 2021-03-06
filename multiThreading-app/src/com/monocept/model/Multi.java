package com.monocept.model;

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Multi extends JFrame implements ActionListener {
	ActionListener{

	private JButton hello;
	private JButton printSync;
	private JButton printAsync;

	private Container container;

	public Multi() {

		setTitle("Async Frame");
		setBounds(300, 90, 900, 600);
		setSize(490, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		hello = new JButton("Hello");
		hello.setSize(80, 30);
		hello.setLocation(30, 55);
		hello.addActionListener(this);
		container.add(hello);

		printSync = new JButton("Print Sync");
		printSync.setSize(120, 30);
		printSync.setLocation(150, 55);
		printSync.addActionListener(this);
		container.add(printSync);

		printAsync = new JButton("Print Async");
		printAsync.setSize(120, 30);
		printAsync.setLocation(300, 55);
		printAsync.addActionListener(this);
		container.add(printAsync);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == hello) {
			System.out.println("Hello");
		}

		if (e.getSource() == printSync) {
			System.out.println("Hi !! I'm sync");
		}

		if (e.getSource() == printAsync) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						System.out.println("Hi !! I'm ASYNC");
						try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}
			});

			t.start();

		}

	}

	public static void main(String[] args) {

		Multi af = new Multi();
	}

}
