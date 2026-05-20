import java.util.Scanner;

public abstract class Pessoa {
    private String nome;
    private String fone;
    private String cpf;
    
    // Construtor
    public Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getFone() {
        return fone;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setFone(String fone) {
        this.fone = fone;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public abstract String saudacao();
    
  
    public String obterInformacoes() {
        return String.format("Nome: %s | Telefone: %s | CPF: %s", nome, fone, cpf);
    }
    
    
    public void apresentarSe() {
        System.out.println(saudacao());
        System.out.println(obterInformacoes());
    }
    
  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return cpf.equals(pessoa.cpf);
    }
    
    @Override
    public String toString() {
        return String.format("%s [%s]", getClass().getSimpleName(), nome);
    }
}
