package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Frame extends JFrame{

	private JPanel contentPane;
	private JTextField txtDescripcion;
	private JLabel lblDescripcion, lblImagen, lblTitulo;
	int count = 0;
	//Creacion del un objeto - arreglo de imagenes
	ImageIcon imagenes[] = new ImageIcon[3];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(10, 367, 305, 67);
		txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		lblTitulo = new JLabel("Descripcion de Fotos");
		lblTitulo.setBounds(111, 11, 125, 14);
		contentPane.add(lblTitulo);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(accion);
		btnEnviar.setBounds(10, 445, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblSubtitulo = new JLabel("Descripcion:");
		lblSubtitulo.setBounds(10, 257, 105, 23);
		contentPane.add(lblSubtitulo);
		
		lblDescripcion = new JLabel();
		lblDescripcion.setBounds(10, 291, 305, 65);
		lblDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		contentPane.add(lblDescripcion);
		
		lblImagen = new JLabel();
		//lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/naipe02.jpg")));
		lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblImagen.setBounds(72, 56, 177, 198);
		contentPane.add(lblImagen);
		
		//ciclo para el cambio de imagenes con cada clic de boto siguiente
				for (int i = 1; i<3; i++){
					imagenes[i] = new ImageIcon(getClass().getResource("/imagenes/naipe0"+i+".jpg"));
				}
			//actualizacion de la imagen en el lblImagen
				lblImagen.setIcon(imagenes[1]);
		
		JLabel lblContador = new JLabel("");
		lblContador.setBounds(269, 11, 46, 14);
		contentPane.add(lblContador);
		
		//*********************************************************
		// empezar a extraer el action listener de forma gral
		//*********************************************************
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (count==4){
					count = 0;
				}	
				count++;
				lblContador.setText(Integer.toString(count));
				lblImagen.setIcon(imagenes[count]);
			}	
		});
		btnSiguiente.setBounds(226, 445, 89, 23);
		contentPane.add(btnSiguiente);
		
		
		//Boton atras
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count==1){
					count = 4;
				}
				count--;
				lblContador.setText(Integer.toString(count));
				lblImagen.setIcon(imagenes[count]);
			}
		});
		btnAtras.setBounds(127, 445, 89, 23);
		contentPane.add(btnAtras);
	
		
		
	}//*********************************************************
	//*********************************************************
	
	ActionListener accion = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			lblDescripcion.setText(txtDescripcion.getText());
			
		}
	};
}
