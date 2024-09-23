package exer1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtNum2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][grow][][]", "[][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Número");
		contentPane.add(lblNewLabel, "cell 2 2,alignx trailing");
		
		txtNum = new JTextField();
		contentPane.add(txtNum, "cell 3 2 2 1,growx");
		txtNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número");
		contentPane.add(lblNewLabel_1, "cell 2 3,alignx trailing");
		
		txtNum2 = new JTextField();
		contentPane.add(txtNum2, "cell 3 3 2 1,growx");
		txtNum2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		contentPane.add(lblNewLabel_2, "cell 3 4");
		
		JLabel result = new JLabel("");
		contentPane.add(result, "cell 5 4");
		
		JRadioButton rdbSoma = new JRadioButton("+ Soma:");
		buttonGroup.add(rdbSoma);
		rdbSoma.setSelected(true);
		contentPane.add(rdbSoma, "cell 3 6");
		
		JRadioButton rdbSub = new JRadioButton("- Subtração:");
		buttonGroup.add(rdbSub);
		contentPane.add(rdbSub, "cell 3 7");
		
		JRadioButton rdbMulti = new JRadioButton("x Multiplicação");
		buttonGroup.add(rdbMulti);
		contentPane.add(rdbMulti, "cell 3 8");
		
		JRadioButton rdbDiv = new JRadioButton("/ Divisão:");
		buttonGroup.add(rdbDiv);
		contentPane.add(rdbDiv, "cell 3 9");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtNum.getText();
				String n2 = txtNum2.getText();
				
				String resultado = ""; // inicializa como vazio
				
				// soma
				if(rdbSoma.isSelected() == true) {
					float n1Int = Float.parseFloat(n1);
					float n2Int = Float.parseFloat(n2);
					
					float soma = n1Int + n2Int;
					
					resultado = String.format("%.2f", soma);
				} 
				// subtração
				if(rdbSub.isSelected() == true) {
					float n1Int = Float.parseFloat(n1);
					float n2Int = Float.parseFloat(n2);
					
					float sub = n1Int - n2Int;
					
					resultado = String.format("%.2f", sub);

				} 
				// multiplicação
				if(rdbMulti.isSelected() == true) {
					float n1Int = Float.parseFloat(n1);
					float n2Int = Float.parseFloat(n2);
					
					float multi = n1Int * n2Int;
					
					resultado = String.format("%.2f", multi);
	

				}
				// divisão
				if(rdbDiv.isSelected() == true) {
					float n1Int = Float.parseFloat(n1);
					float n2Int = Float.parseFloat(n2);
					
					float divi = n1Int / n2Int;
					
					resultado = String.format("%.2f", divi);

				}
				
				// mostra o resultado
				result.setText(resultado);
				
				
			}
		});
		contentPane.add(btnCalcular, "cell 4 10");
	}

}
