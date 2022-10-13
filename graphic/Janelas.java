package graphic;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import General.Calculos;
import General.Text;


public class Janelas extends SubContainer {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Janela 1
	 */
	
	private JLabel lblname;
	private JLabel lbldescont;
	private JLabel lblresult;
	private JTextField txfvalueInitial1 = new JTextField();
	private JTextField txfdescont1 = new JTextField();
	private JTextField janelaResult1 = new JTextField();
	
	
	public JInternalFrame j1(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.APLIC_DESCONT, 8, 8);
		janela.add(labelCustom(lblname, Text.VALUE_INITIAL, 10, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial1, 140, 16, 160,28, 0));
		janela.add(labelCustom(lbldescont, Text.DESCONTO, 30, 60, 160, 25, 1));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEMGERAL, 305, 60, 160, 25, 1));
		janela.getContentPane().add(txfCustom(txfdescont1, 140, 56, 160,28, 1));
		janela.add(labelCustom(lblresult, Text.RESULT, 60, 100, 160, 25, 2));
		janela.getContentPane().add(txfCustom(janelaResult1, 140, 96, 160,28, 3));
		janelaResult1.setEnabled(false);
		
		
		
		txfdescont1.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					janelaResult1.setText(""+Calculos.aplicaDesconto(Double.parseDouble(txfvalueInitial1.getText()), Double.parseDouble(txfdescont1.getText())));
				}
			});
		return janela;
	}
	
	/**
	 * 
	 * Janela 2
	 */
	
	private JTextField txfvalueInitial2 = new JTextField();
	private JTextField txfdescont2 = new JTextField();
	private JTextField janelaResult2 = new JTextField();
	
	
	public JInternalFrame j2(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.INCREMENTAR, 370, 8);
		janela.add(labelCustom(lblname, Text.VALUE_INITIAL, 10, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial2, 140, 16, 160,28, 0));
		janela.add(labelCustom(lbldescont, Text.ACRESCIMO, 25, 60, 160, 25, 1));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEMGERAL, 305, 60, 160, 25, 1));
		janela.getContentPane().add(txfCustom(txfdescont2, 140, 56, 160 ,28, 1));
		janela.add(labelCustom(lblresult, Text.RESULT, 60, 100, 160, 25, 2));
		janela.getContentPane().add(txfCustom(janelaResult2, 140, 96, 160,28, 2));
		janelaResult2.setEnabled(false);
		
		txfdescont2.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					janelaResult2.setText(""+Calculos.incrementarValor(Double.parseDouble(txfvalueInitial2.getText()), Double.parseDouble(txfdescont2.getText())));
				}
			});
		return janela;
	}
	
	/**
	 * 
	 * Janela 3
	 */
	
	private JTextField txfvalueInitial3 = new JTextField();
	private JTextField txfdescont3 = new JTextField();
	private JTextField janelaResult3 = new JTextField();
	
	
	public JInternalFrame j3(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.AMOSTRAGEM, 730, 8);
		janela.add(labelCustom(lblname, Text.TOTAL, 75, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial3, 140, 16, 160,28, 0));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEM, 18, 60, 160, 25, 1));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEMGERAL, 305, 60, 160, 25, 1));
		janela.getContentPane().add(txfCustom(txfdescont3, 140, 56, 160,28, 1));
		janela.add(labelCustom(lblresult, Text.CORRESPONDE, 30, 100, 160, 25,2));
		janela.getContentPane().add(txfCustom(janelaResult3, 140, 96, 160,28, 2));
		janelaResult3.setEnabled(false);
		
		txfdescont3.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					janelaResult3.setText(""+Calculos.amostragem(Double.parseDouble(txfvalueInitial3.getText()), Double.parseDouble(txfdescont3.getText())));
				}
			});
		return janela;
	}
	
	/**
	 * 
	 * Janela 4
	 */
	
	private JTextField txfvalueInitial4 = new JTextField();
	private JTextField txfdescont4 = new JTextField();
	private JTextField janelaResult4 = new JTextField();
	
	
	public JInternalFrame j4(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.AMOSTRAGEM2, 8, 218);
		janela.add(labelCustom(lblname, Text.TOTAL, 75, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial4, 140, 16, 160,28, 0));
		janela.add(labelCustom(lbldescont, Text.PARTE, 75, 60, 160, 25, 1));
		janela.getContentPane().add(txfCustom(txfdescont4, 140, 56, 160,28, 1));
		janela.add(labelCustom(lblresult, Text.CORRESPONDE2, 12, 100, 160, 25, 2));
		janela.getContentPane().add(txfCustom(janelaResult4, 140, 96, 160,28, 2));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEMGERAL, 305, 96, 160, 28, 2));
		janelaResult4.setEnabled(false);
		
		
		txfdescont4.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					janelaResult4.setText(""+Calculos.amostragem2(Double.parseDouble(txfvalueInitial4.getText()), Double.parseDouble(txfdescont4.getText())));
				}
			});
		return janela;
	}
	
	
	/**
	 * 
	 * Janela 5
	 */
	
	private JTextField txfvalueInitial5 = new JTextField();
	private JTextField txfdescont5 = new JTextField();
	private JTextField janelaResult5 = new JTextField();
	
	
	public JInternalFrame j5(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.VALORAEB, 370, 218);
		janela.add(labelCustom(lblname, Text.VALORORIGINAL, 20, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial5, 140, 16, 160,28, 0));
		janela.add(labelCustom(lbldescont, Text.VALORDESC, 0, 60, 160, 25, 1));
		janela.getContentPane().add(txfCustom(txfdescont5, 140, 56, 160,28, 1));
		janela.add(labelCustom(lblresult, Text.RESULTDESCONT, 50, 100, 160, 25, 3));
		janela.getContentPane().add(txfCustom(janelaResult5, 140, 96, 160,28, 2));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEMGERAL, 305, 96, 160, 28, 2));
		janelaResult5.setEnabled(false);
		
		txfdescont5.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					janelaResult5.setText(""+Calculos.desconto2(Double.parseDouble(txfvalueInitial5.getText()), Double.parseDouble(txfdescont5.getText())));
				}
			});
		return janela;
	}
	
	
	/**
	 * 
	 * Janela 6
	 */
	
	private JTextField txfvalueInitial6 = new JTextField();
	private JTextField txfdescont6 = new JTextField();
	private JTextField janelaResult6 = new JTextField();
	
	
	public JInternalFrame j6(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.DELTA, 730, 218);
		janela.add(labelCustom(lblname, Text.VALUE_INITIAL2, 30, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial6, 140, 16, 160,28, 0));
		janela.add(labelCustom(lbldescont, Text.VALUE_FINAL, 40, 60, 160, 25, 1));

		janela.getContentPane().add(txfCustom(txfdescont6, 140, 56, 160,28, 1));
		janela.add(labelCustom(lblresult, Text.VALUE_FINAL, 40, 100, 160, 25, 3));
		janela.getContentPane().add(txfCustom(janelaResult6, 140, 96, 160,28, 2));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEMGERAL, 305, 96, 160, 28, 2));
		janelaResult6.setEnabled(false);
		
		txfdescont6.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					janelaResult6.setText(""+Calculos.variacaoDelta(Double.parseDouble(txfvalueInitial6.getText()), Double.parseDouble(txfdescont6.getText())));
				}
			});
		return janela;
	}
	
	/**
	 * 
	 * Janela 7
	 */
	
	private JTextField txfvalueInitial7 = new JTextField();
	private JTextField txfdescont7 = new JTextField();
	private JTextField janelaResult7 = new JTextField();
	
	
	public JInternalFrame j7(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.VALUE_ORIGINAL, 8, 432);
		janela.add(labelCustom(lblname, Text.VALUE_F, 20, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial7, 140, 16, 160,28, 0));
		janela.add(labelCustom(lbldescont, Text.PORCENTAGEMGERAL, 305, 60, 160, 25, 1));
		janela.add(labelCustom(lbldescont, Text.DESCONTO, 25, 60, 160, 25, 1));
		janela.getContentPane().add(txfCustom(txfdescont7, 140, 56, 160,28, 1));
		janela.add(labelCustom(lblresult, Text.VALOR_INICIAL3, 45, 100, 160, 25, 3));
		janela.getContentPane().add(txfCustom(janelaResult7, 140, 96, 160,28, 2));
		janelaResult7.setEnabled(false);
		
		txfdescont7.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					janelaResult7.setText(""+Calculos.pegaValorOriginal(Double.parseDouble(txfvalueInitial7.getText()), Double.parseDouble(txfdescont7.getText())));
				}
			});
		return janela;
	}
	
	private JTextField txfvalueInitial8 = new JTextField();
	private JTextField txfr1 = new JTextField();
	private JTextField txfvalueInitial9 = new JTextField();
	private JTextField txfr2 = new JTextField();
	
	
	public JInternalFrame j8(){
		JInternalFrame janela = createContainer();
		statusContainer(janela,Text.REGRA, 370, 432);
		janela.add(labelCustom(lblname, Text.A, 20, 20, 160,25, 0));
		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(txfCustom(txfvalueInitial8, 35, 16, 120,28, 0));
		janela.add(labelCustom(lblname, Text.IGUAL, 165, 20, 160,25, 3));
		janela.add(labelCustom(lblname, Text.R1, 180, 20, 160,25, 4));
		janela.getContentPane().add(txfCustom(txfr1, 200, 16, 120,28, 4));
		janela.add(labelCustom(lbldescont, Text.B, 20, 60, 160, 25, 4));
		janela.getContentPane().add(txfCustom(txfvalueInitial9, 35, 56, 120,28, 1));
		janela.add(labelCustom(lblname, Text.IGUAL, 165, 56, 160,25, 3));
		janela.add(labelCustom(lbldescont, Text.R2, 180, 60, 160, 25, 5));
		janela.getContentPane().add(txfCustom(txfr2, 200, 56, 120,28, 5));
		txfr2.setEnabled(false);
		
		txfr1.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					txfr2.setText(""+Calculos.regraDeTrês(Double.parseDouble(txfr1.getText()), Double.parseDouble(txfvalueInitial9.getText()), Double.parseDouble(txfvalueInitial8.getText())));
				}
			});
		return janela;
	}
}
