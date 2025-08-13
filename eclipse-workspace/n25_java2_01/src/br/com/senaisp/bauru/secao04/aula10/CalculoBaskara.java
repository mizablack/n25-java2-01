package br.com.senaisp.bauru.secao04.aula10;

public class CalculoBaskara {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double x1;
	private double x2;
//contructor
	public CalculoBaskara() {
		ladoA = 0;
		ladoB = 0;
		ladoC = 0;
		x1 = 0;
		x2 = 0;
		
		
	}
	public double getLadoA() {
		return ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public double getX1() {
		return x1;
	}
	public double getX2() {
		return x2;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	public void calcularDelta() {
		double delta = Math.pow(ladoB, 2) - 4* ladoA * ladoC;//b elevado 2
		if (delta<0) {
			x1 = 0;
			x2 = 0;
			System.out.println(" Não foi possivel calcular Delta");
		} else {
			x1 = ( -ladoB + Math.sqrt(delta) ) / ( 2 * ladoA );
			x2 = ( -ladoB + Math.sqrt(delta) ) / ( 2 * ladoA );
			
		}
	}
}
