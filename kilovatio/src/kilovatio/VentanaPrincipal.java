package kilovatio;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	JButton b1,b2;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JPanel p1;
	
	public VentanaPrincipal(){
		setBounds(600, 400, 300,200);
		setTitle("Kilovatios");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1 = new JButton("Calcular");
		b1.addActionListener(this);
		b1.setActionCommand("a");
		
		b2 = new JButton("Clear");
		b2.addActionListener(this);
		b2.setActionCommand("b");
		
		l1 = new JLabel("Total KW mes:");
		l2 = new JLabel("Estrato:");
		l3 = new JLabel("Costo Total:");
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t3.setEditable(false);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(4,2));
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);
		p1.add(b2);
		add(p1);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String act = arg0.getActionCommand();
		//instancia de kilovatio
		Kilovatio kw = new Kilovatio();
		
		if (act.equals("a")) {
			t3.setText(""+kw.calcularCostoKilovatios(Double.parseDouble(t1.getText()),Integer.parseInt(t2.getText())));
		}
		
		if (act.equals("b")) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}		
	}
}
