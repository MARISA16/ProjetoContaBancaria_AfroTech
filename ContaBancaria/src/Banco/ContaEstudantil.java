package Banco;

public class ContaEstudantil extends Conta {
	private double  limiteEstudantil;

	public ContaEstudantil(double limiteEstudantil,int numero,String cpf) {
		super(numero,cpf);
		this.limiteEstudantil = limiteEstudantil;
	}
	

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//metodos
	public void usarEstudantil() {
	
		if(this.getMovimentos() >10 && limiteEstudantil<5.000 ) {
				this.setSaldo(limiteEstudantil);
			}
			this.setSaldo(limiteEstudantil);
			
		}
		
	}


