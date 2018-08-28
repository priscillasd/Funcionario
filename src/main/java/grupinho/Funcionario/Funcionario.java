package grupinho.Funcionario;

public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBase;
	private int nroDependentes;
	private boolean insalubridade;
	
	public Funcionario(int matricula, String nome, double salarioBase, 
            			int nroDependentes, boolean insalubridade) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.nroDependentes = nroDependentes;
		this.insalubridade = insalubridade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public int getNroDependentes() {
		return nroDependentes;
	}
	
	public boolean getInsalubridade() {
		return insalubridade;
	}
	
	public double getSalarioBruto() {
		return 0;
	}
	
	public double getSalarioLiquido() {
		return 0;
	}
}
