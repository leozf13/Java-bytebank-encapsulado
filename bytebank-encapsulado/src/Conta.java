public class Conta { // Inicia com valores zerados por padrão
	private double saldo; //tornando o atributo saldo privado
	private int agencia; 
	private int numero;
	private Cliente titular;
	private static int total; // static diz que total é um atributo da classe, não uma referência
	
	public Conta(int agencia, int numero) { // rotina de inicialização // construtor
		
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		System.out.println("Conta: "+ this.numero + " criada com sucesso!");
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) { // boolean pois pode sacar com sucesso ou não
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			System.out.println("Operação concluída com sucesso");
			return true;
		}else {
			
			System.out.println("Não foi possível concluir esta operação");
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta conta) {
		
		if(this.saldo >= valor) {
			
			conta.depositar(valor); // reaproveitando método para depoisitar valor na conta de referência
			this.sacar(valor); // usando o método de sacar para retirar o valor da conta referida
			
			System.out.println("Transferência concluída com sucesso");
			return true;
		} else {
			
			System.out.println("Não foi possível concluir a transferência, verifique seu saldo");
			return false;
		}
	}
	
	public double getSaldo() { // getter
		
		return this.saldo;
	}
	
	public int getAgencia() { // get se cria com o tipo da instância
		
		return this.agencia;
	}
	
	public void setAgencia(int agencia) { // set se cria com void pois não retornada nada (geralmente)
		if(agencia <= 0) {
			
			System.out.println("Agência inválida");
			return;
		} else {
			
			this.agencia = agencia;
		}
		
	}
	
	public int getNumero() {
		
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			
			System.out.println("Número inválido");
			return;
		} else {
			
			this.numero = numero;
		}
		
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() { // static pois este método é da classe
		
		return Conta.total;
	}
}