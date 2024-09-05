package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
    double numero1;
    double numero2;
    double resultado;
    String operacao;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setBackground(new Color(0, 64, 0));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 362, 379);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(0, 64, 0));
		layeredPane.setForeground(new Color(192, 192, 192));
		frmCalculadora.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		txtField = new JTextField();
		txtField.setFont(new Font("Arial", Font.BOLD, 20));
		txtField.setBounds(10, 25, 290, 20);
		layeredPane.add(txtField);
		txtField.setColumns(10);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");;
			}
		});
		btnc.setForeground(new Color(255, 0, 0));
		btnc.setFont(new Font("Arial", Font.BOLD, 20));
		btnc.setBounds(245, 56, 55, 23);
		layeredPane.add(btnc);
		
		JButton btnmais = new JButton("+");
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao= "+";
			}
		});
		btnmais.setForeground(new Color(255, 0, 0));
		btnmais.setFont(new Font("Arial", Font.BOLD, 20));
		btnmais.setBounds(245, 90, 55, 23);
		layeredPane.add(btnmais);
		
		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao= "-";
			}
		});
		btnmenos.setForeground(new Color(255, 0, 0));
		btnmenos.setFont(new Font("Arial", Font.BOLD, 20));
		btnmenos.setBounds(245, 124, 55, 23);
		layeredPane.add(btnmenos);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao= "x";
			}
		});
		btnX.setForeground(new Color(255, 0, 0));
		btnX.setFont(new Font("Arial", Font.BOLD, 20));
		btnX.setBounds(245, 157, 55, 23);
		layeredPane.add(btnX);
		
		JButton btndivisao = new JButton("/");
		btndivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao= "/";
			}
		});
		btndivisao.setForeground(new Color(255, 0, 0));
		btndivisao.setFont(new Font("Arial", Font.BOLD, 20));
		btndivisao.setBounds(245, 191, 55, 23);
		layeredPane.add(btndivisao);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 20));
		btn9.setBounds(180, 93, 55, 23);
		layeredPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 20));
		btn8.setBounds(110, 93, 55, 23);
		layeredPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 20));
		btn7.setBounds(45, 93, 55, 23);
		layeredPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn4.getText());
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 20));
		btn4.setBounds(45, 127, 55, 23);
		layeredPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 20));
		btn5.setBounds(110, 127, 55, 23);
		layeredPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 20));
		btn6.setBounds(180, 127, 55, 23);
		layeredPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn1.getText());
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		btn1.setBounds(45, 160, 55, 23);
		layeredPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		btn2.setBounds(110, 160, 55, 23);
		layeredPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 20));
		btn3.setBounds(180, 157, 55, 23);
		layeredPane.add(btn3);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btnponto.getText());
			}
		});
		btnponto.setForeground(new Color(255, 0, 0));
		btnponto.setFont(new Font("Arial", Font.BOLD, 20));
		btnponto.setBounds(45, 194, 55, 23);
		layeredPane.add(btnponto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn0.getText());
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 20));
		btn0.setBounds(110, 194, 55, 23);
		layeredPane.add(btn0);
		
		JButton vtnigual = new JButton("=");
		vtnigual.setForeground(new Color(255, 0, 0));
		vtnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2=Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
				resultado = numero1+numero2;
				txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("-")){
				resultado =numero1-numero2;
				txtField.setText(String.valueOf(resultado));
			}else if(operacao.equals("*")){
			resultado =numero1*numero2;
			txtField.setText(String.valueOf(resultado));
		}else if(operacao.equals("/")){
		resultado =numero1/numero2;
		txtField.setText(String.valueOf(resultado));
		
	
			}
			}
		});
		vtnigual.setFont(new Font("Arial", Font.BOLD, 20));
		vtnigual.setBounds(180, 194, 55, 23);
		layeredPane.add(vtnigual);
	}
}
