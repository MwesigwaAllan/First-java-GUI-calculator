import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_frame extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_frame frame = new Main_frame();
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
	public Main_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setForeground(new Color(0, 128, 255));
		txt1.setBounds(25, 36, 128, 37);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setForeground(new Color(0, 128, 255));
		txt2.setColumns(10);
		txt2.setBounds(260, 36, 128, 37);
		contentPane.add(txt2);
		
		JLabel lbl1 = new JLabel("First Number");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Sitka Heading", Font.PLAIN, 16));
		lbl1.setBounds(25, 0, 128, 36);
		contentPane.add(lbl1);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondNumber.setFont(new Font("Sitka Heading", Font.PLAIN, 16));
		lblSecondNumber.setBounds(260, 0, 128, 36);
		contentPane.add(lblSecondNumber);
		
		final JLabel lblResult = new JLabel("");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(new Color(255, 0, 0));
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResult.setBounds(25, 139, 363, 71);
		contentPane.add(lblResult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(txt1.getText());
					num2=Integer.parseInt(txt2.getText());
					ans=num1+num2;
					lblResult.setText(Integer.toString(ans));
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "enter valid number");
				}
			}
		});
		btnAdd.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAdd.setBounds(191, 36, 41, 17);
		contentPane.add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(txt1.getText());
					num2=Integer.parseInt(txt2.getText());
					ans=num1-num2;
					lblResult.setText(Integer.toString(ans));
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "enter valid number");
				}
			}
		});
		btnSubtract.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSubtract.setBounds(191, 64, 41, 17);
		contentPane.add(btnSubtract);
		
		JButton btnCls = new JButton("Cls");
		btnCls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText("");
				txt1.setText("");
				txt2.setText("");
			}
		});
		btnCls.setBounds(170, 92, 89, 23);
		contentPane.add(btnCls);
		
		
	}
}
