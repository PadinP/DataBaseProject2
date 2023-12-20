package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Base de Transporte");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Monito\\Documents\\Proyectos Java\\DataBaseProject\\bin\\image\\home.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 793);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/image/Transturr.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
		this.repaint();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 21, 159, 728);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				IntChofer a;
				try {
					a = new IntChofer();
					a.setVisible(true);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		lblNewLabel.setBounds(0, 11, 159, 96);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/image/follow2.png")));
		
		JLabel lblNewLabel_1 = new JLabel("Chofer");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				IntChofer a;
				try {
					a = new IntChofer();
					a.setVisible(true);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 109, 159, 50);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				IntCarro b;
				try {
					b = new IntCarro();
					b.setVisible(true);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		label.setIcon(new ImageIcon(Principal.class.getResource("/image/bustransport_bus_4984.png")));
		label.setBounds(0, 170, 159, 96);
		panel.add(label);
		
		JLabel lblCarro = new JLabel("Carro");
		lblCarro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				IntCarro b;
				try {
					b = new IntCarro();
					b.setVisible(true);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		lblCarro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCarro.setBounds(0, 277, 159, 50);
		panel.add(lblCarro);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				IntSolicitud s;
				try {
					s = new IntSolicitud();
					s.setVisible(true);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(Principal.class.getResource("/image/plus2.png")));
		label_1.setBounds(0, 338, 159, 96);
		panel.add(label_1);
		
		JLabel lblSolicitud = new JLabel("Solicitud");
		lblSolicitud.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				IntSolicitud s;
				try {
					s = new IntSolicitud();
					s.setVisible(true);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		lblSolicitud.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolicitud.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSolicitud.setBounds(0, 445, 159, 50);
		panel.add(lblSolicitud);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Info i = new Info();
				i.setVisible(true);
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(Principal.class.getResource("/image/info2.png")));
		label_2.setBounds(0, 506, 159, 96);
		panel.add(label_2);
		
		JLabel lblPlan = new JLabel("Info");
		lblPlan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Info i = new Info();
				i.setVisible(true);
			}
		});
		lblPlan.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlan.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPlan.setBounds(0, 613, 159, 59);
		panel.add(lblPlan);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1367, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/image/logout.png")));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/image/close.png")));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnReportes = new JMenu("Reportes");
		mnReportes.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnReportes);
		
		JMenu mnChofer = new JMenu("Chofer");
		mnChofer.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnChofer.setIcon(new ImageIcon(Principal.class.getResource("/image/friends.png")));
		mnReportes.add(mnChofer);
		
		JMenuItem mntmListado_2 = new JMenuItem("Listado");
		mntmListado_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmListado_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoChoferes ch = new ListadoChoferes();
				ch.setVisible(true);
			}
		});
		mnChofer.add(mntmListado_2);
		
		JMenuItem mntmSituacin_1 = new JMenuItem("Situaci\u00F3n de estos");
		mntmSituacin_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmSituacin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoSitChofer sit = new ListadoSitChofer();
				sit.setVisible(true);
			}
		});
		mnChofer.add(mntmSituacin_1);
		
		JMenu mnCarro = new JMenu("Carro");
		mnCarro.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnCarro.setIcon(new ImageIcon(Principal.class.getResource("/image/bustransport_bus_4984s.png")));
		mnReportes.add(mnCarro);
		
		JMenuItem mntmListado_1 = new JMenuItem("Listado");
		mntmListado_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmListado_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoCarros ca = new ListadoCarros();
				ca.setVisible(true);
			}
		});
		mnCarro.add(mntmListado_1);
		
		JMenuItem mntmSituacin = new JMenuItem("Situaci\u00F3n de estos");
		mntmSituacin.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmSituacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoSitCarros ls = new ListadoSitCarros();
				ls.setVisible(true);
			}
		});
		mnCarro.add(mntmSituacin);
		
		JMenu mnSolicitud = new JMenu("Solicitud");
		mnSolicitud.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnSolicitud.setIcon(new ImageIcon(Principal.class.getResource("/image/notebook.png")));
		mnReportes.add(mnSolicitud);
		
		JMenuItem mntmListado = new JMenuItem("Listado");
		mntmListado.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoSolicitudes so = new ListadoSolicitudes();
				so.setVisible(true);
			}
		});
		mnSolicitud.add(mntmListado);
		
		JMenuItem mntmModificaciones = new JMenuItem("Modificaciones");
		mntmModificaciones.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmModificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifPlan m = new ModifPlan();
				m.setVisible(true);
			}
		});
		mnSolicitud.add(mntmModificaciones);
		
		JMenu mnCarrochofer = new JMenu("Carro-Chofer");
		mnCarrochofer.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnCarrochofer.setIcon(new ImageIcon(Principal.class.getResource("/image/OIP (2).jpg")));
		mnReportes.add(mnCarrochofer);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Listado");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoCarroChofer lcc = new ListadoCarroChofer();
				lcc.setVisible(true);
			}
		});
		mnCarrochofer.add(mntmNewMenuItem_3);
		
		JMenuItem mntmAgregarRelacin = new JMenuItem("Agregar Relaci\u00F3n");
		mntmAgregarRelacin.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmAgregarRelacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IntCarChof cc = new IntCarChof();
				cc.setVisible(true);
			}
		});
		mnCarrochofer.add(mntmAgregarRelacin);
		
		JMenu mnNewMenu_1 = new JMenu("Arrastres");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_1.setIcon(new ImageIcon(Principal.class.getResource("/image/kisspng-arrow-circle-rotation-clockwise-computer-icons-circular-arrows-svg-png-icon-free-download-72298-5c08d3b7c23435.6973637015440823597955.jpg")));
		mnReportes.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Listado");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoArrastres la = new ListadoArrastres();
				la.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmAgregarArrastre = new JMenuItem("Agregar Arrastre");
		mntmAgregarArrastre.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmAgregarArrastre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IntArrastre ia = new IntArrastre();
				ia.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAgregarArrastre);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Hoja de Ruta");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListadoCarrosHojaRuta h = new ListadoCarrosHojaRuta();
				h.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(Principal.class.getResource("/image/note.png")));
		mnReportes.add(mntmNewMenuItem_2);
	}
}
