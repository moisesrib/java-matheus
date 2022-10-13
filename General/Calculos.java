package General;

public class Calculos {
	
	static public double aplicaDesconto(double num1, double num2) {
		return num1 - (num1 * (num2 / 100));
	}
	
	static public double incrementarValor(double num1, double num2) {
		return num1 + (num1 * (num2 / 100));
	}
	
	static public double amostragem(double num1, double num2) {
		return (num1 * num2) / 100;
	}
	
	static public double amostragem2(double num1, double num2) {
		return (num1 / num2) * 100;
	}
	
	static public double desconto2(double num1, double num2) {
		return ((num1 - num2) / num1) * 100;
	}
	
	static public double variacaoDelta(double num1, double num2) {
		return ((num2 - num1 / num2) * 100) - ((num1 - num2 / num1) * 100);
	}
	
	static public double pegaValorOriginal(double num1, double num2) {
		return (num1 * 100)/(100 - num2);
	}
	
	public static double regraDeTrês(double num1, double num2, double num3) {
		return (num1 * num2)/num3;
	}

}
