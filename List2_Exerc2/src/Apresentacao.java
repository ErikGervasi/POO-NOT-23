import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Apresentacao {

	private JFrame frame;
	private JTextField fraseTF;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() {
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
		
		JLabel lblNewLabel = new JLabel("Digite a frase:");
		lblNewLabel.setBounds(10, 24, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		fraseTF = new JTextField();
		fraseTF.setBounds(99, 21, 228, 20);
		frame.getContentPane().add(fraseTF);
		fraseTF.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frase objeto = new Frase(fraseTF.getText());
				String[] resultado = objeto.decompor();
				textArea.setText("Palavras da frase:\n");
				for (int i=0; i < resultado.length; i++) {
					textArea.append("\n"+resultado[i]+ " - "
									+resultado[i].length());
				}
			}
		});
		btnNewButton.setBounds(335, 20, 64, 23);
		frame.getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 389, 182);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
	}
}
