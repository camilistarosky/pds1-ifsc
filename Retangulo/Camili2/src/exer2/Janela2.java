package exer2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela2 frame = new Janela2();
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
	public Janela2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][grow]", "[][][][][][][][]"));
		
		JLabel lblBase = new JLabel("Base:");
		contentPane.add(lblBase, "cell 3 2");
		
		JLabel lblNewLabel = new JLabel("Altura:");
		contentPane.add(lblNewLabel, "cell 5 2");
		
		txtBase = new JTextField();
		contentPane.add(txtBase, "cell 3 3,growx");
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		contentPane.add(txtAltura, "cell 5 3,growx,aligny top");
		txtAltura.setColumns(10);
		
		JRadioButton rdbArea = new JRadioButton("Área");
		buttonGroup.add(rdbArea);
		contentPane.add(rdbArea, "cell 3 4");
		
		JRadioButton rdbPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbPerimetro);
		contentPane.add(rdbPerimetro, "cell 5 4");
		
		JLabel lblÁrea = new JLabel("Resultado:");
		contentPane.add(lblÁrea, "cell 3 6");
		
		JLabel lblResult = new JLabel("");
		contentPane.add(lblResult, "cell 5 6");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String base = txtBase.getText();
				String altura = txtAltura.getText();
				
				String resultado = "";
				
				Retangulo retangulo = new Retangulo();
				float baseConvert = Float.parseFloat(base);
				float alturaConvert = Float.parseFloat(altura);
				
				if(rdbArea.isSelected() == true) {
					float resultadoArea = retangulo.calcularArea(baseConvert, alturaConvert);
					String areaConvert = String.format("%.2f", resultadoArea);
					resultado = String.valueOf(areaConvert);
				}
				if(rdbPerimetro.isSelected() == true) {
					float resultadoPerimetro = retangulo.calcularPerimetro(baseConvert, alturaConvert);
					String perimetroConvert = String.format("%.2f", resultadoPerimetro);
					resultado = String.valueOf(resultadoPerimetro);
				}
				
				lblResult.setText(resultado);
			}
		});
		contentPane.add(btnCalcular, "flowx,cell 3 7");
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
				lblResult.setText("");
				rdbArea.setSelected(false);
				rdbPerimetro.setSelected(false);
			}
		});
		contentPane.add(btnLimpar, "cell 4 7");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnFechar, "cell 5 7");
	}

}
