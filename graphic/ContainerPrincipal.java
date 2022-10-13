package graphic;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ContainerPrincipal extends JFrame {
	
	Janelas janelas = new Janelas();

	
	private static final long serialVersionUID = 1L;
	
	public void container() {
		
		add(janelas.j1());
		add(janelas.j2());
		add(janelas.j3());
		add(janelas.j4());
		add(janelas.j5());
		add(janelas.j6());
		add(janelas.j7());
		add(janelas.j8());
	
		setTitle("Calculos");
		setSize(1280, 720);
		setLayout(null);
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair do sistema", JOptionPane.YES_NO_OPTION);
				if(opcao == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				} else {
					setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				}
			}
		});
		setVisible(true);
	}
}
