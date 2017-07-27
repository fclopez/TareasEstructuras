package ModalCajaTexto;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	//Atributos
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	JPanel p1;
	JTextField tf1, tf2;
	JTextArea ta1;

	public VentanaPrincipal(){
		setBounds(600,400,300,200);
		setTitle("Uso horario");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1 = new JButton("Contar");
		b1.addActionListener(this);
		b1.setActionCommand("a");
		
		b2 = new JButton("Calcular");
		b2.addActionListener(this);
		b2.setActionCommand("b");
		
		b3 = new JButton("Limpiar");
		b3.addActionListener(this);
		b3.setActionCommand("c");
		
		
		l1 = new JLabel("Entero a contar:");
		l2 = new JLabel("Hora a calcular");
		l3 = new JLabel("Resultado");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		
		ta1 = new JTextArea();
		ta1.setEditable(false);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(5,2));
		
		
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(ta1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		add(p1);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String act = arg0.getActionCommand();
		
		Calculadora ob1 = new Calculadora();
		
		
		if (act.equals("a")) {
			ta1.setText(ob1.contarNumeros(Integer.parseInt(tf1.getText())));
		}else if (act.equals("b")) {
			ta1.setText(ob1.calcularHora(Integer.parseInt(tf2.getText())));
		}else if (act.equals("c")) {
			tf1.setText("");
			tf2.setText("");
			ta1.setText("");
		}
		
		
	}
}
