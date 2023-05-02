package Banco;

public class ContaPoupanca extends Conta {
	
	private int diaAniversarioPoupanca;
	
	

	public ContaPoupanca(int diaAniversarioPoupanca,int numero,String cpf) {
		super(numero,cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	//metodo
	 
		public void correcao(int dataUsuario) {
			if(dataUsuario== this.getDiaAniversarioPoupanca()) {
				this.setSaldo( (this.getSaldo() * 0.05)+this.getSaldo());
			}
				
			
		
	}
	
	
	

}
