package windowBuilder_Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exerc_WindowBuilder {

	
	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exerc_WindowBuilder window = new Exerc_WindowBuilder();
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
	public Exerc_WindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(23, 49, 41, 25);
		frame.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(23, 94, 41, 25);
		frame.getContentPane().add(lblIdade);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(23, 130, 41, 25);
		frame.getContentPane().add(lblCpf);
		
		tfNome = new JTextField();
		tfNome.setBounds(74, 51, 307, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		tfIdade = new JTextField();
		tfIdade.setColumns(10);
		tfIdade.setBounds(74, 96, 307, 20);
		frame.getContentPane().add(tfIdade);
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		tfCpf.setBounds(74, 132, 307, 20);
		frame.getContentPane().add(tfCpf);
		
		JLabel lblTitle = new JLabel("CADASTRO DE PESSOA");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 414, 14);
		frame.getContentPane().add(lblTitle);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnSalvar, "SALVO !");
				
			}
		});
		btnSalvar.setForeground(new Color(64, 0, 0));
		btnSalvar.setBounds(279, 188, 102, 32);
		frame.getContentPane().add(btnSalvar);
			}
	}
	

