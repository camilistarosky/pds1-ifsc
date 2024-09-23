package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Conversao;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtTemp;
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
		setTitle("Sistema de Conversão");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTemp = new JTextField();
		txtTemp.setBackground(new Color(255, 255, 255));
		txtTemp.setBounds(178, 35, 123, 27);
		contentPane.add(txtTemp);
		txtTemp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Temperatura (Fº):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(54, 40, 114, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// le o valor digitado no Jtextfiled
				String temp = txtTemp.getText();
				
				/// Criar onjeto da classe conversão
				Conversao convert = new Conversao();
				
				// Cahamr o método converter
				float tempF = Float.parseFloat(temp);
				float tempConvertida = convert.calcularTemperatura(tempF);
				
				//Formata resultado com 2 casas decimais
				String tempFormatada = String.format("%.2f", tempConvertida); // converte para string e formata
				lblResultado.setText("Cº " +tempFormatada);
				
			}
		});
		btnNewButton.setBounds(137, 146, 96, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(71, 99, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(191, 99, 89, 14);
		contentPane.add(lblResultado);
	}
}
