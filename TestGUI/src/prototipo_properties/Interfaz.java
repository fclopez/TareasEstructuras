package prototipo_properties;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Interfaz extends JFrame implements ActionListener{
	
	JTextArea ta1;
	JPanel p1;
	JButton b1;
	Font f1,f2;
	String TIPO_LETRA = "Trebuchet MS";
	String ESTILO = "PLAIN";
	int TAMANO = 20;
	JColorChooser paleta;
	Color colorLetra;
			
	public Interfaz(){
		setBounds(600,400,300,200);
		//setLayout(new GridLayout(2,2));
		setTitle("Contador de cuentos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1 = new JButton("pagina");
		b1.setBackground(new Color(0, 155, 155));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b1.setActionCommand("a");

		f1 = new Font(TIPO_LETRA,Font.PLAIN, TAMANO);
		
		ta1 = new JTextArea();
		ta1.setEditable(false);
		ta1.setText("Hola a todos");
		ta1.setFont(f1);
		ta1.setForeground(Color.red);
		
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
		
		TAMANO+=10;
		if (act.equals("a")) {
			f2 = new Font(ESTILO, Font.PLAIN, TAMANO);
			ta1.setFont(f2);
			//colorLetra = paleta.showDialog(ta1, null, null);
			//ta1.setForeground(colorLetra);
			ta1.setText(logic.subir());
		}	
	}
}
