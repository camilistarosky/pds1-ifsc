package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Gasolina;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janela4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtPagamento;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela4 frame = new janela4();
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
	public janela4() {
		setTitle("Gasolina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preço:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(50, 43, 59, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total Pagamento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(37, 92, 111, 18);
		contentPane.add(lblNewLabel_1);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(171, 42, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		txtPagamento = new JTextField();
		txtPagamento.setBounds(171, 90, 86, 20);
		contentPane.add(txtPagamento);
		txtPagamento.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pegar valor diitado no texto 1
				String precoLitro = txtPreco.getText();
				
				// pegar valor digitado no texto 2
				String totalPagamento = txtPagamento.getText();
				
				// criar um objeto do tipo Gasolina
				Gasolina gasolinas = new Gasolina();
				
				// fazer converão dos tipo string -> float
				float precoLitroConvert = Float.parseFloat(precoLitro);
				float totalPagConvert = Float.parseFloat(totalPagamento);
				
				// passar os valores para esse objeto
				gasolinas.setPrecoLitro(precoLitroConvert);
				gasolinas.setTotalPagar(totalPagConvert);
				
				// passar o resultadp )chamado do metodo getTotalLitros)
				float totalLitros = gasolinas.getTotalLitros();
				
				// formartar
				String totalFormat = String.format("%.2f", totalLitros);
				
				// mostrar o reusltado na tela
				lblResultado.setText(totalFormat);
			}
		});
		btnCalcular.setBounds(106, 141, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblQuantidadeLitros = new JLabel("Quantidade de Litros:");
		lblQuantidadeLitros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantidadeLitros.setBounds(37, 189, 142, 14);
		contentPane.add(lblQuantidadeLitros);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResultado.setBounds(171, 190, 69, 14);
		contentPane.add(lblResultado);
	}

}
