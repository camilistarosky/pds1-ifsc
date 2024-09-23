package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimeiroNome;
	private JTextField txtSegundoNome;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrimeiroNome = new JLabel("Primeiro Nome:");
		lblPrimeiroNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrimeiroNome.setBounds(55, 51, 120, 26);
		contentPane.add(lblPrimeiroNome);
		
		JLabel lblSegundoNome = new JLabel("Segundo Nome:");
		lblSegundoNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSegundoNome.setBounds(55, 107, 120, 23);
		contentPane.add(lblSegundoNome);
		
		txtPrimeiroNome = new JTextField();
		txtPrimeiroNome.setBounds(185, 53, 184, 26);
		contentPane.add(txtPrimeiroNome);
		txtPrimeiroNome.setColumns(10);
		
		txtSegundoNome = new JTextField();
		txtSegundoNome.setColumns(10);
		txtSegundoNome.setBounds(185, 103, 184, 26);
		contentPane.add(txtSegundoNome);
		
		JButton btnNomeCompleto = new JButton("Mostrar Nome Completo");
		btnNomeCompleto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// le o nome digitado no Jtextfiled]
				String nome = txtPrimeiroNome.getText();
				
				// le o sobrenome
				String sobrenome = txtSegundoNome.getText();
				
				String nomecompleto = (nome + " " + sobrenome);
				
				lblResultado.setText(nomecompleto);
				
			}
		});
		btnNomeCompleto.setBounds(127, 206, 166, 23);
		contentPane.add(btnNomeCompleto);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo: ");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeCompleto.setBounds(55, 161, 120, 14);
		contentPane.add(lblNomeCompleto);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado.setBounds(185, 161, 184, 14);
		contentPane.add(lblResultado);
	}
}
