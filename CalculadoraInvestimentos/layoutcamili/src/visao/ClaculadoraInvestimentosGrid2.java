package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaculadoraInvestimentosGrid2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDM;
	private JTextField txtNumM;
	private JLabel lblNewLabel_2;
	private JTextField txtJuros;
	private JLabel lblNewLabel_3;
	private JLabel lblResult;
	private JButton btnNewButton;
	private JPanel panel;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosGrid2 frame = new ClaculadoraInvestimentosGrid2();
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
	public ClaculadoraInvestimentosGrid2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 262);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Sobre");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSobre sobre = new FormSobre();
				sobre.setVisible(true);
			}
		});
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Depósito Mensal R$:");
		contentPane.add(lblNewLabel);
		
		txtDM = new JTextField();
		txtDM.setColumns(10);
		contentPane.add(txtDM);
		
		JLabel lblNewLabel_1 = new JLabel("Num de meses:");
		contentPane.add(lblNewLabel_1);
		
		txtNumM = new JTextField();
		txtNumM.setColumns(10);
		contentPane.add(txtNumM);
		
		lblNewLabel_2 = new JLabel("Juros aos meses %:");
		contentPane.add(lblNewLabel_2);
		
		txtJuros = new JTextField();
		txtJuros.setColumns(10);
		contentPane.add(txtJuros);
		
		lblNewLabel_3 = new JLabel("Total Investido + Juros %:");
		contentPane.add(lblNewLabel_3);
		
		lblResult = new JLabel("");
		contentPane.add(lblResult);
		
		btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// pegar valor digitado no texto
				String mes = txtNumM.getText();
				String pjuros = txtJuros.getText();
				String depm = txtDM.getText();
				
				
				// fazer converão dos tipo string -> int, double
				int mesConvert = Integer.parseInt(mes);
				double jurosConvert = Double.parseDouble(pjuros);
				double dmConvert = Double.parseDouble(depm);
				
				// criar um objeto do tipo investimento
				Investimento invest = new Investimento(mesConvert, jurosConvert, dmConvert);
				
				// passar os valores para esse objeto
				invest.setMeses(mesConvert);
				invest.setJuros(jurosConvert);
				invest.setDeposito_mensal(dmConvert);
				
				// passar o resultado chamado do metodo calcularTotal
				double total = invest.calculaTotal();
				
				// formatar
				String resultado = String.format("%.2f", total);
				
				// mostrar o resultado na tela
				lblResult.setText(resultado);
				
			}
		});
		
		panel = new JPanel();
		contentPane.add(panel);
		contentPane.add(btnNewButton);
	}

}
