package bytebankpoo.src;

public class Client {
    private String name;
    private String cpf;
    private String profession;
    private String sex;
    private String maritalStatus;
    private static int total;

    public Client(String name, String cpf, String profession, String sex, String maritalStatus) {
        Client.total++;
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;
        this.sex = sex;
        this.maritalStatus = maritalStatus;

        System.out.println("Cliente cria com as seguintes informações - Nome: " + this.name + " CPF: "+ this.cpf + " Profissão: " + this.profession + " Sexo: " + this.sex + " Estado civil: " + this.maritalStatus);
        System.out.println("O numero total de Clientes cadastrados no momento é de: " + Client.total);
        System.out.println(" ");
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfession() {
        return profession;
    }

    public String getSex() {
        return sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
