package Banco;

public class ContaEmpresa extends Conta {

	private double  emprestimoEmpresa;

	public ContaEmpresa(double emprestimoEmpresa,int numero,String cpf) {
		super(numero,cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	//metodo
	public void pedirEmprestimo() {
		if(this.getMovimentos() >10 && emprestimoEmpresa<10.000 ) {
			this.setSaldo(emprestimoEmpresa);
		}
		this.setSaldo(emprestimoEmpresa);
		
	}
	
	
}
