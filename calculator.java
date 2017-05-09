package calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frmCalculator;
	private JTextField value1;
	private JTextField value2;
	private JTextField result;

	public static void main(String[] args) {
		EventQueue.invokeLater
		(
			new Runnable()
			{
				public void run()
				{
					try
					{
						calculator window = new calculator();
						window.frmCalculator.setVisible(true);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		);
	}

	public calculator() {
		initialize();
	}

	private void initialize()
	{
		frmCalculator = new JFrame();
		frmCalculator.setAlwaysOnTop(true);
		frmCalculator.setResizable(false);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mitch\\Desktop\\Calculator-icon.png"));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 451, 302);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		JLabel labelValue1 = new JLabel("Value 1");
		labelValue1.setHorizontalAlignment(SwingConstants.RIGHT);
		labelValue1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		labelValue1.setLabelFor(value1);
		labelValue1.setBounds(109, 142, 88, 23);
		frmCalculator.getContentPane().add(labelValue1);

		value1 = new JTextField();
		value1.setToolTipText("Only Numeric Values");
		value1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		value1.setBounds(207, 125, 190, 56);
		frmCalculator.getContentPane().add(value1);
		value1.setColumns(10);

		JLabel labelValue2 = new JLabel("Value 2");
		labelValue2.setHorizontalAlignment(SwingConstants.RIGHT);
		labelValue2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		labelValue2.setBounds(109, 205, 88, 23);
		frmCalculator.getContentPane().add(labelValue2);

		value2 = new JTextField();
		value2.setToolTipText("Only Numeric Values");
		value2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		value2.setBounds(207, 194, 190, 56);
		frmCalculator.getContentPane().add(value2);
		value2.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					Scanner val1 = new Scanner(value1.getText());
					double valu1 = val1.nextDouble();
					val1.close();
					Scanner val2 = new Scanner(value2.getText());
					double valu2 = val2.nextDouble();
					val2.close();
					result.setText((valu1 + valu2) + "");
				}
			}
		);
		btnAdd.setBounds(10, 125, 89, 23);
		frmCalculator.getContentPane().add(btnAdd);	

		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.setBounds(10, 159, 89, 23);
		frmCalculator.getContentPane().add(btnSubtract);
		btnSubtract.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					Scanner val1 = new Scanner(value1.getText());
					double valu1 = val1.nextDouble();
					val1.close();
					Scanner val2 = new Scanner(value2.getText());
					double valu2 = val2.nextDouble();
					val2.close();
					result.setText((valu1 - valu2) + "");
				}
			}
		);

		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.setBounds(10, 193, 89, 23);
		frmCalculator.getContentPane().add(btnMultiply);
		btnMultiply.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					Scanner val1 = new Scanner(value1.getText());
					double valu1 = val1.nextDouble();
					val1.close();
					Scanner val2 = new Scanner(value2.getText());
					double valu2 = val2.nextDouble();
					val2.close();
					result.setText((valu1 * valu2) + "");
				}
			}
		);

		JButton btnDivide = new JButton("Divide");
		btnDivide.setBounds(10, 227, 89, 23);
		frmCalculator.getContentPane().add(btnDivide);
		btnDivide.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					Scanner val1 = new Scanner(value1.getText());
					double valu1 = val1.nextDouble();
					val1.close();
					Scanner val2 = new Scanner(value2.getText());
					double valu2 = val2.nextDouble();
					val2.close();
					result.setText((valu1 / valu2) + "");
				}
			}
		);

		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblResult.setBounds(10, 11, 123, 81);
		frmCalculator.getContentPane().add(lblResult);

		result = new JTextField();
		result.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		result.setEditable(false);
		result.setBounds(143, 11, 281, 81);
		frmCalculator.getContentPane().add(result);
		result.setColumns(10);
	}
}