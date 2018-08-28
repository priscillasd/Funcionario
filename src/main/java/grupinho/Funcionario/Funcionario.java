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
		double salarioBruto = salarioBase;
		if(insalubridade) {
			salarioBruto += (salarioBase*0.1);
		}
		if(getNroDependentes() > 0) {
			for(int i = 0; i < getNroDependentes(); i++) {
				salarioBruto += (salarioBase*0.01);
			}
		}
		return salarioBruto;
	}
	
	public double getSalarioLiquido() {
		double salarioLiquido = getSalarioBruto();
		if(getSalarioBase() <= 1693.72) {
			salarioLiquido -= (getSalarioBase()*0.08);
		}
		if(getSalarioBase() > 1693.72 && getSalarioBase() <= 2822.90) {
			salarioLiquido -= (getSalarioBase()*0.09);
		}
		if(getSalarioBase() > 2822.90 && getSalarioBase() <= 5645.80) {
			salarioLiquido -= (getSalarioBase()*0.11);
		}
		if(getSalarioBase() > 5645.80) {
			salarioLiquido -= 621.04;
		}
		return salarioLiquido;
	}
}
