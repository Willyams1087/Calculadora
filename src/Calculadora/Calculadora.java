package Calculadora;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{

	private JTextField textfield1;
	private JButton boton1, boton2, boton3, boton4, boton5, boton6,
			boton7, boton8, boton9, boton0, botonpunto, botonmas, botonmenos, botonmultiplicar, botondividir, botonigual;
	
	public Calculadora () {
		
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(25, 25, 225, 30);
		add(textfield1);
		
		boton1 = new JButton("1");
		boton1.setBounds(25, 190, 45, 45);
		add(boton1);
		
		boton2 = new JButton("2");
		boton2.setBounds(85, 190, 45, 45);
		add(boton2);
		
		boton3 = new JButton("3");
		boton3.setBounds(145, 190, 45, 45);
		add(boton3);
		
		boton4 = new JButton("4");
		boton4.setBounds(25, 130, 45, 45);
		add(boton4);
		
		boton5 = new JButton("5");
		boton5.setBounds(85, 130, 45, 45);
		add(boton5);
		
		boton6 = new JButton("6");
		boton6.setBounds(145, 130, 45, 45);
		add(boton6);
		
		boton7 = new JButton("7");
		boton7.setBounds(25, 70, 45, 45);
		add(boton7);
		
		boton8 = new JButton("8");
		boton8.setBounds(85, 70, 45, 45);
		add(boton8);
		
		boton9 = new JButton("9");
		boton9.setBounds(145, 70, 45, 45);
		add(boton9);
		
		boton0 = new JButton("0");
		boton0.setBounds(25, 250, 45, 45);
		add(boton0);
		
		botonpunto = new JButton(".");
		botonpunto.setBounds(85, 250, 45, 45);
		add(botonpunto);
		
		botonigual = new JButton("=");
		botonigual.setBounds(145, 250, 45, 45);
		add(botonigual);
		
		botondividir = new JButton("/");
		botondividir.setBounds(205, 70, 45, 45);
		add(botondividir);
		
		botonmultiplicar = new JButton("*");
		botonmultiplicar.setBounds(205, 130, 45, 45);
		add(botonmultiplicar);
		
		botonmenos = new JButton("-");
		botonmenos.setBounds(205, 190, 45, 45);
		add(botonmenos);
		
		botonmas = new JButton("+");
		botonmas.setBounds(205, 250, 45, 45);
		add(botonmas);

	}
	
	public static void main(String[] args) {
		
		Calculadora ventanaPrincipal = new Calculadora();
		ventanaPrincipal.setBounds(0, 0, 290, 355);
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setLocationRelativeTo(null);
		
	}
	
}
