package Banco;


	
	public class ContaCorrente extends Conta {

		
		private int contadorTalao;

		public ContaCorrente(int contadorTalao, int numero,String cpf) {
			super(numero,cpf);
			this.contadorTalao = contadorTalao;
		}
		
		

		public int getContadorTalao() {
			return contadorTalao;
		}

		public void setContadorTalao(int contadorTalao) {
			this.contadorTalao = contadorTalao;
		}
		
		//metodo
		public void pediTalao(boolean solicitaCheque, boolean pedirSair) { 
			if(this.getMovimentos()>10 || pedirSair) {
				
            if(solicitaCheque && contadorTalao<=3 ) {
            	this.debito(30.00);
            }
		}
		}



		
		}
	
        



