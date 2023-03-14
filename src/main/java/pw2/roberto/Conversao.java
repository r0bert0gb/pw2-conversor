package pw2.roberto;

public class Conversao {

	private double valorEmNos;
	private double valorEmKm;

	public Conversao() {
	}

	@Override
	public String toString() {
		return "Conversao [valorEmNos=" + valorEmNos + ", valorEmKm=" + valorEmKm + "]";
	}

	public double getValorEmNos() {
		return valorEmNos;
	}

	public void setValorEmNos(double valorEmNos) {
		this.valorEmNos = valorEmNos;
	}

	public double getValorEmKm() {
		return valorEmKm;
	}

	public void setValorEmKm(double valorEmKm) {
		this.valorEmKm = valorEmKm;
	}

}
