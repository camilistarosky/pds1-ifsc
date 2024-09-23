package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Prato;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janela5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrecoQuilo;
	private JTextField txtPesoPrato;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela5 frame = new janela5();
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
	public janela5() {
		setTitle("Restaurante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrecoQuilo = new JLabel("Digite o Preço do Quilo:");
		lblPrecoQuilo.setBounds(41, 40, 122, 14);
		contentPane.add(lblPrecoQuilo);
		
		JLabel lblQuilo = new JLabel("Digite o peso do prato(k):");
		lblQuilo.setBounds(41, 86, 133, 14);
		contentPane.add(lblQuilo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pegar valor diitado no texto
				String precoPrato = txtPrecoQuilo.getText();
				String pesoPrato = txtPesoPrato.getText();
				
				// criar um objeto do tipo Gasolina
				Prato comida = new Prato();
				
				// fazer converão dos tipo string -> float
				float precoPratoConvert = Float.parseFloat(precoPrato);
				float pesoPratoConvert = Float.parseFloat(pesoPrato);
				
				// passar os valores para esse objeto
				comida.setPrecoQuilo(precoPratoConvert);
				comida.setQuilo(pesoPratoConvert);
				
				// passar o resultadp )chamado do metodo getTotalLitros)
				float totalPagar = comida.getPrecoPrato();
				
				// formatar
				String resultadoPagar = String.format("%.2f", totalPagar);
				
				// mostrar o resultado na tela
				lblResultado.setText(resultadoPagar);
			}
		});
		btnCalcular.setBounds(126, 130, 97, 33);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_2 = new JLabel("Valor a pagar:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(41, 185, 97, 25);
		contentPane.add(lblNewLabel_2);
		
		txtPrecoQuilo = new JTextField();
		txtPrecoQuilo.setText("9.95");
		txtPrecoQuilo.setBounds(173, 37, 86, 20);
		contentPane.add(txtPrecoQuilo);
		txtPrecoQuilo.setColumns(10);
		
		txtPesoPrato = new JTextField();
		txtPesoPrato.setBounds(173, 83, 86, 20);
		contentPane.add(txtPesoPrato);
		txtPesoPrato.setColumns(10);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado.setBounds(148, 191, 75, 14);
		contentPane.add(lblResultado);
	}

}
