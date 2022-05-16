
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(007, 13578);
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente leonardo = new Cliente();
		conta.setTitular(leonardo);
		
		leonardo.setNome("Leonardo");
		leonardo.setCpf("088.318.219-03");
		leonardo.setProfissao("Desenvolvedor");
		
		System.out.println(conta.getTitular().getNome()); //acessando nome pelo getNome através do getTitular de 'conta'
														  // leonardo.getNome
		
		conta.getTitular().setProfissao("Desenvolvedor Sênior");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(leonardo.getProfissao()); // mesmo resultado
	}
}
