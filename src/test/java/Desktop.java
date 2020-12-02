import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Довольно удручающе получилось ))

public class Desktop extends JFrame {
	public Desktop() {
		setTitle("Test Window");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(300, 300, 800, 400);
		setLayout(new FlowLayout());

		final JTextArea textArea = new JTextArea();


		JButton button = new JButton("Начните с этой");
		add(button, BorderLayout.PAGE_START);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "1";
				textArea.setText(message);
			}
		});

		final JButton button1 = new JButton("Вторая");
		add(button1, BorderLayout.PAGE_START);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message1 = "2";
				textArea.setText(message1);
			}
		});

		final JButton button2 = new JButton("Третья");
		add(button2, BorderLayout.PAGE_START);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message2 = "3";
				textArea.setText(message2);
			}
		});

		final JButton button3 = new JButton("Четвертая");
		add(button3, BorderLayout.PAGE_START);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message3 = "4";
				textArea.setText(message3);
			}
		});

		final JButton button4 = new JButton("Пятая");
		add(button4, BorderLayout.PAGE_START);
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message4 = "5";
				textArea.setText(message4);
			}
		});

		final JButton button5 = new JButton("Заключительная");
		add(button5, BorderLayout.PAGE_START);
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message5 = "6";
				textArea.setText(message5);
			}
		});

		add(textArea);
		setVisible(true);
	}
}

class MainClass {
	public static void main(String[] args) {
		Desktop Decktop = new Desktop();
	}
}
