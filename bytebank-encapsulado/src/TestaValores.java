
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(107, 13578);
		Conta conta2 = new Conta(789, 1245);
		Conta conta3 = new Conta(189,5745);
		
		
		System.out.println(conta.getAgencia());
		
		System.out.println(Conta.getTotal()); // retorna o total de contas criadas
	
	}
}
