package com.passwordgenerator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class InterfazGenerador extends JFrame implements ActionListener, AdjustmentListener{
	
	private JLabel lblTitulo, lblSubTitulo, lblValor, lblEstado;
	private JTextField txtContraseñaGenerada, txtAliasGenerado;
	private JButton btnGenerarContraseña, btnGenerarAlias, btnUsarAlias, btnUsarContraseña;
	private JScrollBar sBar;
	private JPanel panelBar, panelContraseña, panelAlias;
	private int posicionBar = Generator.LONGITUD_PASS;
	private String aliasInicial = "", aliasGenerado = "";
	private String passwordInicial="", passwordGenerada = "";
	
	public InterfazGenerador () {
		setLayout(null);
		getContentPane().setBackground(new Color(28,129,90));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GENERADOR DE CONTRASEÑAS SEGURAS Y ALIAS");
		setIconImage(new ImageIcon(getClass().getResource("imgs/passwordLock.png")).getImage()); 
		
		Generator generador = new Generator();
		passwordInicial = generador.generarContraseña(passwordInicial);
		
		Dictionary diccionario = new Dictionary();
		aliasInicial = diccionario.cargarAlias();
		
		panelAlias = new JPanel();
		panelAlias.setBounds(0,0,800,160);
		panelAlias.setVisible(false);
		panelAlias.setBackground(new Color(28,129,90));
		panelAlias.setLayout(null);
		add(panelAlias);
		
		lblTitulo = new JLabel("PROTEJA SU CUENTA BANCARIA");
		lblTitulo.setFont(new Font("Name Smile",1,24));
		lblTitulo.setForeground(new Color(255,255,255));
		lblTitulo.setBounds(145,10,540,35);
		panelAlias.add(lblTitulo);
		
		lblSubTitulo = new JLabel("GENERE UN ALIAS SEGURO");
		lblSubTitulo.setFont(new Font("Hack",1,20));
		lblSubTitulo.setForeground(new Color(192,192,192));
		lblSubTitulo.setBounds(235,35,350,35);
		panelAlias.add(lblSubTitulo);
		
		txtAliasGenerado = new JTextField(aliasInicial);
		txtAliasGenerado.setBounds(10,125,580,30);
		txtAliasGenerado.setFont(new Font("Hack",0,24));
		txtAliasGenerado.setForeground(new Color(255,255,255));
		txtAliasGenerado.setBackground(new Color(28,129,90));
		txtAliasGenerado.setEditable(false);
		panelAlias.add(txtAliasGenerado);
		
		btnGenerarAlias = new JButton("GENERAR");
		btnGenerarAlias.setFont(new Font("Hack",1,18));
		btnGenerarAlias.setForeground(new Color(195,195,195));
		btnGenerarAlias.setBackground(new Color(28,129,90));
		btnGenerarAlias.setBorder(BorderFactory.createRaisedBevelBorder());
		btnGenerarAlias.setBounds(610,125,130,28);
		btnGenerarAlias.addActionListener(this);
		panelAlias.add(btnGenerarAlias);
		
		panelContraseña = new JPanel();
		panelContraseña.setBounds(0,0,800,160);
		panelContraseña.setBackground(new Color(28,129,90));
		panelContraseña.setLayout(null);
		add(panelContraseña);
		
		lblTitulo = new JLabel("PROTEJASE  DE  LOS  HACKEOS");
		lblTitulo.setFont(new Font("Name Smile",1,24));
		lblTitulo.setForeground(new Color(255,255,255));
		lblTitulo.setBounds(145,10,500,35);
		panelContraseña.add(lblTitulo);
		
		lblSubTitulo = new JLabel("USE UNA CONTRASEÑA SEGURA");
		lblSubTitulo.setFont(new Font("Hack",1,20));
		lblSubTitulo.setForeground(new Color(192,192,192));
		lblSubTitulo.setBounds(235,35,350,35);
		panelContraseña.add(lblSubTitulo);
		
		lblValor = new JLabel("Longitud: " + posicionBar);
		lblValor.setFont(new Font("Hack",1,18));
		lblValor.setForeground(new Color(255,255,255));
		lblValor.setBounds(10,95,150,35);
		panelContraseña.add(lblValor);
		
		lblEstado = new JLabel("CONSTRASEÑA SEGURA");
		lblEstado.setBounds(540,125,200,28);
		lblEstado.setFont(new Font("Hack",1,18));
		lblEstado.setForeground(new Color(255,255,255));
		panelContraseña.add(lblEstado);
		
		txtContraseñaGenerada = new JTextField(passwordInicial);
		txtContraseñaGenerada.setBounds(10,65,580,30);
		txtContraseñaGenerada.setFont(new Font("Hack",0,24));
		txtContraseñaGenerada.setForeground(new Color(255,255,255));
		txtContraseñaGenerada.setBackground(new Color(28,129,90));
		txtContraseñaGenerada.setEditable(false);
		panelContraseña.add(txtContraseñaGenerada);
		
		btnUsarAlias = new JButton("ALIAS");
		btnUsarAlias.setFont(new Font("Hack",1,18));
		btnUsarAlias.setForeground(new Color(195,195,195));
		btnUsarAlias.setBackground(new Color(28,129,90));
		btnUsarAlias.setBorder(BorderFactory.createRaisedBevelBorder());
		btnUsarAlias.setBounds(10,200,130,28);
		btnUsarAlias.addActionListener(this);
		add(btnUsarAlias);
		
		btnUsarContraseña = new JButton("CONTRASEÑA");
		btnUsarContraseña.setFont(new Font("Hack",1,18));
		btnUsarContraseña.setForeground(new Color(195,195,195));
		btnUsarContraseña.setBackground(new Color(28,129,90));
		btnUsarContraseña.setBorder(BorderFactory.createRaisedBevelBorder());
		btnUsarContraseña.setBounds(645,200,130,28);
		btnUsarContraseña.addActionListener(this);
		add(btnUsarContraseña);
		
		btnGenerarContraseña = new JButton("GENERAR");
		btnGenerarContraseña.setFont(new Font("Hack",1,18));
		btnGenerarContraseña.setForeground(new Color(195,195,195));
		btnGenerarContraseña.setBackground(new Color(28,129,90));
		btnGenerarContraseña.setBorder(BorderFactory.createRaisedBevelBorder());
		btnGenerarContraseña.setBounds(610,65,130,28);
		btnGenerarContraseña.addActionListener(this);
		panelContraseña.add(btnGenerarContraseña);
		
		panelBar = new JPanel();
		panelBar.setBounds(10,130,500,20);
		panelBar.setBackground(new Color(28,129,90));
		panelBar.setLayout(new BorderLayout());
		panelContraseña.add(panelBar);
		sBar = new JScrollBar(JScrollBar.HORIZONTAL);
		sBar.setBackground(new Color(28,129,90));
		sBar.setMinimum(4);
		sBar.setMaximum(50);
		sBar.setUnitIncrement(1);
		sBar.setBlockIncrement(10);
		sBar.addAdjustmentListener(this);
		posicionBar = generador.cambiarLongitud(12);
		sBar.setValue(posicionBar);
		panelBar.add(sBar);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource() == btnUsarAlias) {
			getContentPane().setBackground(new Color(28,129,90));
			btnUsarAlias.setBackground(new Color(28,129,90));
			btnUsarContraseña.setBackground(new Color(28,129,90));
			panelContraseña.setVisible(false);
			panelAlias.setVisible(true);
		}
		else if (evento.getSource() == btnUsarContraseña) {
			Generator generador = new Generator();
			posicionBar = generador.cambiarLongitud(12);
			sBar.setValue(posicionBar);
			panelContraseña.setVisible(true);
			panelAlias.setVisible(false);
		}
		
		if (evento.getSource() == btnGenerarContraseña) {

			txtContraseñaGenerada.setText("");
			
			Generator generador = new Generator();
			generador.cambiarLongitud(posicionBar);
			passwordInicial = generador.generarContraseña(passwordGenerada);
			
			txtContraseñaGenerada.setText(passwordInicial);
		}
		
		if (evento.getSource() == btnGenerarAlias) {
			aliasInicial = "";
			aliasGenerado = Dictionary.cargarAlias();
			txtAliasGenerado.setText(aliasGenerado);
			
		}
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent evento) {
		posicionBar = evento.getValue();
		lblValor.setText("Lenght: " + evento.getValue());
		Generator generador = new Generator();
		generador.cambiarLongitud(posicionBar);
		passwordInicial = generador.generarContraseña(passwordGenerada);
		txtContraseñaGenerada.setText(passwordInicial);
		
		if(posicionBar >= 24) {
			getContentPane().setBackground(new Color(6,119,210));
			txtContraseñaGenerada.setBackground(new Color(6,119,210));
			btnGenerarContraseña.setBackground(new Color(6,119,210));
			panelContraseña.setBackground(new Color(6,119,210));
			btnUsarAlias.setBackground(new Color(6,119,210));
			btnUsarContraseña.setBackground(new Color(6,119,210));
			panelBar.setBackground(new Color(6,119,210));
			sBar.setBackground(new Color(6,119,210));
			lblValor.setText("Longitud: " + posicionBar);
			lblEstado.setText("¡CONSTRASEÑA ANTI-HACK!");
			lblEstado.setBounds(520,125,280,28);
		}
		else if(posicionBar >= 12) {
			getContentPane().setBackground(new Color(28,129,90));
			txtContraseñaGenerada.setBackground(new Color(28,129,90));
			btnGenerarContraseña.setBackground(new Color(28,129,90));
			panelContraseña.setBackground(new Color(28,129,90));
			btnUsarAlias.setBackground(new Color(28,129,90));
			btnUsarContraseña.setBackground(new Color(28,129,90));
			panelBar.setBackground(new Color(28,129,90));
			sBar.setBackground(new Color(28,129,90));
			lblValor.setText("Longitud: " + posicionBar);
			lblEstado.setText("CONSTRASEÑA SEGURA");
			lblEstado.setBounds(540,125,200,28);
		}
		else if(posicionBar > 6 && posicionBar < 12) {
			getContentPane().setBackground(new Color(190,78,58));
			txtContraseñaGenerada.setBackground(new Color(190,78,58));
			btnGenerarContraseña.setBackground(new Color(190,78,58));
			panelContraseña.setBackground(new Color(190,78,58));
			btnUsarAlias.setBackground(new Color(190,78,58));
			btnUsarContraseña.setBackground(new Color(190,78,58));
			panelBar.setBackground(new Color(190,78,58));
			sBar.setBackground(new Color(190,78,58));
			lblValor.setText("Longitud: " + posicionBar);
			lblEstado.setText("CONSTRASEÑA CASI SEGURA");
			lblEstado.setBounds(520,125,280,28);
		}
		else if (posicionBar <= 6) {
			getContentPane().setBackground(new Color(209,54,78));
			txtContraseñaGenerada.setBackground(new Color(209,54,78));
			btnGenerarContraseña.setBackground(new Color(209,54,78));
			panelContraseña.setBackground(new Color(209,54,78));
			btnUsarAlias.setBackground(new Color(209,54,78));
			btnUsarContraseña.setBackground(new Color(209,54,78));
			panelBar.setBackground(new Color(209,54,78));
			sBar.setBackground(new Color(209,54,78));
			lblValor.setText("Longitud: " + posicionBar);
			lblEstado.setText("CONSTRASEÑA DEBIL");
			lblEstado.setBounds(540,125,200,28);
		}
		
	}

	
	public static void main(String[] args) {
		
		InterfazGenerador ventana = new InterfazGenerador();
		ventana.setBounds(0,0,800,280);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}




}
