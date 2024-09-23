package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Retangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtBase;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JLabel lblArea;
	private JLabel lblPerimetro;
	private JLabel lblResultadoArea;
	private JLabel lblResultadoPerimetro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela3 frame = new Janela3();
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
	public Janela3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Digite a Base:");
		lblBase.setBounds(28, 36, 94, 14);
		contentPane.add(lblBase);
		
		txtBase = new JTextField();
		txtBase.setBounds(170, 33, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		lblAltura = new JLabel("Digite a Altura");
		lblAltura.setBounds(28, 83, 94, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(170, 80, 86, 20);
		contentPane.add(txtAltura);
		
		lblArea = new JLabel("Área:");
		lblArea.setBounds(28, 149, 49, 14);
		contentPane.add(lblArea);
		
		lblPerimetro = new JLabel("Perímetro:");
		lblPerimetro.setBounds(28, 174, 76, 14);
		contentPane.add(lblPerimetro);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String base = txtAltura.getText();
				String altura = txtBase.getText();
				
				Retangulo retangulo = new Retangulo();
				
				float baseConvert = Float.parseFloat(base);
				float alturaConvert = Float.parseFloat(altura);
				
				float resultadoPerimetro = retangulo.calcularPerimetro(baseConvert, alturaConvert);
				float resultadoArea = retangulo.calcularArea(baseConvert, alturaConvert);
				
				String areaConvert = String.format("%.2f", resultadoArea);
				lblResultadoArea.setText(areaConvert);
				
				String perimetroConvert = String.format("%.2f", resultadoPerimetro);
				lblResultadoPerimetro.setText(perimetroConvert);
			}
		});
		btnCalcular.setBounds(127, 121, 89, 23);
		contentPane.add(btnCalcular);
		
		lblResultadoArea = new JLabel("");
		lblResultadoArea.setBounds(126, 149, 46, 14);
		contentPane.add(lblResultadoArea);
		
		lblResultadoPerimetro = new JLabel("");
		lblResultadoPerimetro.setBounds(127, 174, 46, 14);
		contentPane.add(lblResultadoPerimetro);
	}
}
