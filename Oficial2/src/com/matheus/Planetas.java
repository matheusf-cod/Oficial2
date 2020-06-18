package com.matheus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Planetas extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planetas frame = new Planetas();
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
	public Planetas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesoNaTerrakg = new JLabel("Peso na terra(kg)");
		lblPesoNaTerrakg.setBounds(170, 55, 118, 14);
		contentPane.add(lblPesoNaTerrakg);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(170, 80, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblSelecioneOPlaneta = new JLabel("Selecione o planeta");
		lblSelecioneOPlaneta.setBounds(170, 122, 118, 14);
		contentPane.add(lblSelecioneOPlaneta);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtPeso.setText("");
				
			}
		});
		btnLimpar.setBounds(266, 79, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnMerc = new JButton("Merc\u00FArio");
		btnMerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtPeso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite seu peso!");
				}
				
				double pt = Double.parseDouble(txtPeso.getText());
				
				double pp = pt*0.37;
				
				JOptionPane.showMessageDialog(null, "Seu peso em Mercúrio é de: "+pp+" Kgs");
				
			}
		});
		btnMerc.setBounds(10, 161, 89, 23);
		contentPane.add(btnMerc);
		
		JButton btnMarte = new JButton("Marte");
		btnMarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtPeso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite seu peso!");
				}
				
				double pt = Double.parseDouble(txtPeso.getText());
				
				double pp = pt*0.38;
				
				JOptionPane.showMessageDialog(null, "Seu peso em Marte é de: "+pp+" Kgs");
		
			}
		});
		btnMarte.setBounds(167, 161, 89, 23);
		contentPane.add(btnMarte);
		
		JButton btnSaturno = new JButton("Saturno");
		btnSaturno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtPeso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite seu peso!");
				}
				
				double pt = Double.parseDouble(txtPeso.getText());
				
				double pp = pt*1.15;
				
				JOptionPane.showMessageDialog(null, "Seu peso em Saturno é de: "+pp+" Kgs");
				
			}
		});
		btnSaturno.setBounds(335, 161, 89, 23);
		contentPane.add(btnSaturno);
		
		JButton btnVenus = new JButton("Venus");
		btnVenus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtPeso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite seu peso!");
				}
				
				double pt = Double.parseDouble(txtPeso.getText());
				
				double pp = pt*0.88;
				
				JOptionPane.showMessageDialog(null, "Seu peso em Vênus é de: "+pp+" Kgs");
				
			}
		});
		btnVenus.setBounds(10, 227, 89, 23);
		contentPane.add(btnVenus);
		
		JButton btnJupiter = new JButton("Jupiter");
		btnJupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtPeso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite seu peso!");
				}
				
				double pt = Double.parseDouble(txtPeso.getText());
				
				double pp = pt*2.64;
				
				JOptionPane.showMessageDialog(null, "Seu peso em Júpiter é de: "+pp+" Kgs");

			}
		});
		btnJupiter.setBounds(170, 227, 89, 23);
		contentPane.add(btnJupiter);
		
		JButton btnUrano = new JButton("Urano");
		btnUrano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtPeso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite seu peso!");
				}
				
				double pt = Double.parseDouble(txtPeso.getText());
				
				double pp = pt*1.17;
				
				JOptionPane.showMessageDialog(null, "Seu peso em Urano é de: "+pp+" Kgs");

			}
		});
		btnUrano.setBounds(335, 227, 89, 23);
		contentPane.add(btnUrano);
	}
	
	
}
