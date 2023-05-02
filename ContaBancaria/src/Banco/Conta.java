package Banco;



public abstract class Conta {
	
	   
	    private int numero;
	    private String cpf;
	    private double saldo;
	    private String ativo;
	    private int movimentos;

	   

	    public Conta(int numero, String cpf) {
			super();
			this.numero = numero;
			this.cpf = cpf;
			this.saldo = saldo;
			this.ativo = ativo;
			
			
			
		}
	    
	    public void debito(double valor) {
	    	if(this.movimentos<10 && valor <this.saldo) {
	    		this.saldo-=valor;
	    	}
	    	movimentos++;
	    }
	    
	    public void credito(double valor) {
	    	
	    		this.saldo+=valor;
	    		movimentos++;
	    	}
	    	
	    

		public int getNumero() {
			return numero;
		}



		public void setNumero(int numero) {
			this.numero = numero;
		}



		public String getCpf() {
			return cpf;
		}



		public void setCpf(String cpf) {
			this.cpf = cpf;
		}



		public double getSaldo() {
			return saldo;
		}



		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}



		public String getAtivo() {
			return ativo;
		}



		public void setAtivo(String ativo) {
			this.ativo = ativo;
		}

		public int getMovimentos() {
			return movimentos;
		}

		public void setMovimentos(int movimentos) {
			this.movimentos = movimentos;
		}



		

	   
		
					
		
}