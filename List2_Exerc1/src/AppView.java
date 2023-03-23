import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AppView {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfUf;
	private JTextField tfRenda;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppView window = new AppView();
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
	public AppView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow][][][]", "[][][][][][][][][]"));
		
		JLabel lblNewLabel_3 = new JLabel("IMPOSTO DE RENDA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNewLabel_3, "cell 1 0");
		
		JLabel lblNome = new JLabel("Nome:");
		frame.getContentPane().add(lblNome, "cell 0 2,alignx trailing");
		
		tfNome = new JTextField();
		frame.getContentPane().add(tfNome, "cell 1 2,growx");
		tfNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		frame.getContentPane().add(lblCpf, "cell 0 4,alignx trailing");
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		frame.getContentPane().add(tfCpf, "cell 1 4,growx");
		
		JLabel lblUf = new JLabel("UF:");
		frame.getContentPane().add(lblUf, "cell 0 6,alignx trailing");
		
		tfUf = new JTextField();
		tfUf.setColumns(10);
		frame.getContentPane().add(tfUf, "cell 1 6,growx");
		
		JLabel lblRendaAnual = new JLabel("Renda Anual:");
		frame.getContentPane().add(lblRendaAnual, "cell 0 8,alignx trailing");
		
		tfRenda = new JTextField();
		tfRenda.setColumns(10);
		frame.getContentPane().add(tfRenda, "cell 1 8,growx");
		 
			
		JButton btnNewButton = new JButton("OK!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte objeto = new Contribuinte(tfNome.getText(), tfCpf.getText(), tfUf.getText(), Double.parseDouble(tfRenda.getText()));
				JOptionPane.showMessageDialog(btnNewButton, "Seu nome é " + tfNome.getText() + "\nSeu CPF é " + tfCpf.getText()
				+ "\nSua UF é: " + tfUf.getText() + "\nSua Renda Anual é: " + tfRenda.getText() + "\n\nVocê deve pagar de imposto o valor de R$:" + objeto.calcularImposto());
	
			}
		});
		frame.getContentPane().add(btnNewButton, "cell 4 8");
	}

}
