package bytebankpoo;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private String sexo;
    private String estadoCivil;
    private static int total;

    public Cliente(String nome, String cpf, String profissao, String sexo, String estadoCivil) {
        Cliente.total++;
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;

        System.out.println(this.nome + this.cpf + this.profissao + this.sexo + this.estadoCivil);
        System.out.println("O numero total de Clientes cadastrados no momento é de: " + Cliente.total);
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}
