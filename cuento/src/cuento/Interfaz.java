package cuento;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
//Contador de cuentos
//Hay que escribir el cuento de a 3 personas
//
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Interfaz extends JFrame	implements ActionListener{
	
	JTextArea ta1;
	JPanel p1;
	JButton b1;
	
	public Interfaz(){
		setBounds(600,400,300,200);
		//setLayout(new GridLayout(2,2));
		setTitle("Contador de cuentos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1 = new JButton("Contar");
		b1.addActionListener(this);
		b1.setActionCommand("a");
		
		ta1 = new JTextArea();
		ta1.setEditable(false);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,2));
		
		p1.add(ta1);
		p1.add(b1);
		
		add(p1);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String act = arg0.getActionCommand();
		Logica logic = new Logica();
				
		if (act.equals("a")) {
			ta1.setText(logic.subir());
		}
		
	}

}
