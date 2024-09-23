package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;

import modelo.Posto;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Combustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOleoDiesel;
	private JTextField txtGasolinaComum;
	private JTextField txtGasolinaAditivada;
	private JTextField txtEtanol;
	private JTextField txtOleo500;
	private JTextField txtOleo1;
	private JTextField txtQntOleo500;
	private JTextField txtQntOleo1;
	private JTextField txtQntdLitros;
	private JTextField txtDias;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combustivel frame = new Combustivel();
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
	public Combustivel() {
		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][grow][][][grow][][][][]", "[grow][grow][grow][grow][]\r\n"));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tabela de Pre\u00E7o do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		contentPane.add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[150px][150px]", "[][][][]"));

		JLabel lblNewLabel = new JLabel("Oleo Disel:");
		panel.add(lblNewLabel, "cell 0 0,alignx center");

		txtOleoDiesel = new JTextField();
		panel.add(txtOleoDiesel, "cell 1 0,growx");
		txtOleoDiesel.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Gasolina Comum:");
		panel.add(lblNewLabel_1, "cell 0 1,alignx center");

		txtGasolinaComum = new JTextField();
		panel.add(txtGasolinaComum, "cell 1 1,growx");
		txtGasolinaComum.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Gasolina Aditivada:");
		panel.add(lblNewLabel_2, "cell 0 2,alignx center");

		txtGasolinaAditivada = new JTextField();
		panel.add(txtGasolinaAditivada, "cell 1 2,growx");
		txtGasolinaAditivada.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Etanol:");
		panel.add(lblNewLabel_3, "cell 0 3,alignx center");

		txtEtanol = new JTextField();
		panel.add(txtEtanol, "cell 1 3,growx");
		txtEtanol.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tabela Pre\u00E7o do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel_1, "cell 1 0 9 1,alignx center,growy");
		panel_1.setLayout(new MigLayout("", "[150px][150px]", "[][][]"));

		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml:");
		panel_1.add(lblNewLabel_4, "cell 0 0,alignx center");

		txtOleo500 = new JTextField();
		panel_1.add(txtOleo500, "cell 1 0,growx");
		txtOleo500.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Frasco 1L:");
		panel_1.add(lblNewLabel_5, "cell 0 1,alignx center");

		txtOleo1 = new JTextField();
		panel_1.add(txtOleo1, "cell 1 1,growx");
		txtOleo1.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel_2, "cell 0 1 9 1,grow");
		panel_2.setLayout(new MigLayout("", "[][][][][][][][][][][][][]", "[][][]"));

		JLabel lblNewLabel_8 = new JLabel("Quantidade");
		panel_2.add(lblNewLabel_8, "cell 3 0,alignx center");

		JLabel lblNewLabel_9 = new JLabel("Valor a Pagar");
		panel_2.add(lblNewLabel_9, "cell 7 0,alignx center");

		JLabel lblNewLabel_10 = new JLabel("Total Oleo");
		panel_2.add(lblNewLabel_10, "cell 12 0,alignx center");

		JLabel lblNewLabel_6 = new JLabel("Frasco de 500ml:");
		panel_2.add(lblNewLabel_6, "cell 0 1,alignx center");

		txtQntOleo500 = new JTextField();
		panel_2.add(txtQntOleo500, "cell 3 1,growx");
		txtQntOleo500.setColumns(10);

		JLabel lblFrasco500 = new JLabel("");
		panel_2.add(lblFrasco500, "cell 7 1,alignx center");

		JLabel lblTotalOleo = new JLabel("-");
		panel_2.add(lblTotalOleo, "cell 12 1,alignx center");

		JLabel lblNewLabel_7 = new JLabel("Frasco de 1L:");
		panel_2.add(lblNewLabel_7, "cell 0 2,alignx center");

		txtQntOleo1 = new JTextField();
		panel_2.add(txtQntOleo1, "cell 3 2,growx");
		txtQntOleo1.setColumns(10);

		JLabel lblFrasco1 = new JLabel("-");
		panel_2.add(lblFrasco1, "cell 7 2,alignx center");

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abatecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_3, "cell 0 2,grow");
		panel_3.setLayout(new MigLayout("", "[100px][100px]", "[][][]"));

		JLabel lblNewLabel_15 = new JLabel("Combustível:");
		panel_3.add(lblNewLabel_15, "cell 0 0,alignx center");

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Oleo Disel", "Gasolina Comum", "Gasolina Aditivada", "Etanol" }));
		comboBox.setToolTipText("");
		panel_3.add(comboBox, "cell 1 0,growx");

		JLabel lblNewLabel_16 = new JLabel("Qntd. Litros:");
		panel_3.add(lblNewLabel_16, "cell 0 1,alignx center");

		txtQntdLitros = new JTextField();
		panel_3.add(txtQntdLitros, "cell 1 1,growx");
		txtQntdLitros.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("Total Combutivel:");
		panel_3.add(lblNewLabel_17, "cell 0 2,alignx center");

		JLabel lblTotalComb = new JLabel("");
		panel_3.add(lblTotalComb, "cell 1 2,alignx center");

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(
				new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_4, "cell 2 2 7 1,grow");
		panel_4.setLayout(new MigLayout("", "[][][][][]", "[][][]"));

		JRadioButton rdbAvista = new JRadioButton("À vista");
		buttonGroup.add(rdbAvista);
		panel_4.add(rdbAvista, "cell 0 0");

		JLabel lblNewLabel_19 = new JLabel("Dias:");
		panel_4.add(lblNewLabel_19, "cell 3 0,alignx trailing");

		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 4 0,growx");
		txtDias.setColumns(10);

		JRadioButton rdbAprazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbAprazo);
		panel_4.add(rdbAprazo, "cell 0 1");

		JLabel lblNewLabel_20 = new JLabel("Total a Pagar:");
		panel_4.add(lblNewLabel_20, "cell 1 2");

		JLabel lblTp = new JLabel("");
		panel_4.add(lblTp, "cell 2 2");

		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5, "cell 0 3 9 2,grow");
		panel_5.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][]", "[]"));

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// pegar valor digitado nos textos
				String oleoDiesel = txtOleoDiesel.getText();
				String gasolinaComum = txtGasolinaComum.getText();
				String gasolinaAitivadda = txtGasolinaAditivada.getText();
				String etanol = txtEtanol.getText();

				String qntdLitros = txtQntdLitros.getText();

				// criar um objeto para usar o metodo aqui dentro da janela5
				Posto posto = new Posto();

				// fazer converão dos tipo string -> float
				float precooleoDieselConvert = Float.parseFloat(oleoDiesel);
				float precogasolinaComumConvert = Float.parseFloat(gasolinaComum);
				float precogasolinaAitivaddaConvert = Float.parseFloat(gasolinaAitivadda);
				float precoetanolConvert = Float.parseFloat(etanol);

				float qntdLitrosConvert = Float.parseFloat(qntdLitros);

				// passar os valores para esse objet
				posto.setPrecoGasolinaAditivada(precogasolinaAitivaddaConvert);
				posto.setPrecoGasolinaComum(precogasolinaComumConvert);
				posto.setPrecoDiesel(precooleoDieselConvert);
				posto.setPrecoEtanol(precoetanolConvert);

				posto.setQuantidadeLitro(qntdLitrosConvert);

				// passar o resultado, chamando do metodo getPrecoTotal

				String resultado = "";
				if ("Oleo Disel".equals(comboBox.getSelectedItem())) {
					float totalDiesel = posto.getTotalDiesel();
					resultado = String.format("%.2f", totalDiesel);
				} else if ("Gasolina Comum".equals(comboBox.getSelectedItem())) {
					float totalGasolinaC = posto.getTotalGasolinaComum();
					resultado = String.format("%.2f", totalGasolinaC);
				} else if ("Gasolina Aditivada".equals(comboBox.getSelectedItem())) {
					float totalGasolinaA = posto.getTotalGasolinaAditivada();
					resultado = String.format("%.2f", totalGasolinaA);
				} else if ("Etanol".equals(comboBox.getSelectedItem())) {
					float totalEtanol = posto.getTotalEtanol();
					resultado = String.format("%.2f", totalEtanol);
				}

				// mostrar o reusltado na tela

				lblTotalComb.setText(resultado);

				// ----------------------------------------------------

				// valores digitados nos textos
				String frasco500 = txtOleo500.getText();
				String frasco1 = txtOleo1.getText();

				String qntdFrasco500 = txtQntOleo500.getText();
				String qntdFrasco1 = txtQntOleo1.getText();

				// conversão para float
				float precofrasco500 = Float.parseFloat(frasco500);
				float precofrasco1 = Float.parseFloat(frasco1);

				// conversão para int
				int intqntdFrasco500 = Integer.parseInt(qntdFrasco500);
				int intqntdFrasco1 = Integer.parseInt(qntdFrasco1);

				// colocando os valores no objeto
				posto.setPrecoOleo500ml(precofrasco500);
				posto.setQuantidadeOleo500ml(intqntdFrasco500);
				posto.setPrecoOleo1L(precofrasco1);
				posto.setQuantidadeOleo1L(intqntdFrasco1);

				// passar o resultado, chamando do metodo getPrecoTotal

				float valorPagarOleo500 = posto.getValorPagarOleo500();
				float valorPagarOleo1 = posto.getValorPagarOleo1();
				float valorTotalOleo = posto.getTotalOleo();

				String Valorpagar500 = String.format("%.2f", valorPagarOleo500);
				String Valorpagar1 = String.format("%.2f", valorPagarOleo1);
				String ValorTotalOleoFormat = String.format("%.2f", valorTotalOleo);

				// mostrar o reusltado na tela
				lblFrasco500.setText(Valorpagar500);
				lblFrasco1.setText(Valorpagar1);
				lblTotalOleo.setText(ValorTotalOleoFormat);

				// --------------------------------------------------------
				float resultadoFloat = Float.parseFloat(resultado);

				String dias = txtDias.getText();
				int diasInt = Integer.parseInt(dias);
				
				double total = resultadoFloat + valorTotalOleo;

				if (rdbAvista.isSelected() == true) {
					total *= 0.90;
					String totalString  = String.format("%.2f", total);
					lblTp.setText(totalString);
				}
				if (rdbAprazo.isSelected() == true) {
					if (diasInt > 30) {
						total *= 1.10;
						String totalString  = String.format("%.2f", total);
						lblTp.setText(totalString);
					} 
				}
				
				/*String totalString  = String.format("%.2f", total);
				lblTp.setText(totalString);*/
			}
		});
		panel_5.add(btnNewButton, "cell 2 0");

		JButton btnNewButton_1 = new JButton("Novo Calculo");
		panel_5.add(btnNewButton_1, "cell 7 0");

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel_5.add(btnFechar, "cell 13 0");
	}

}
