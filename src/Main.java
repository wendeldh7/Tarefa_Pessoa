public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "123.456.789-00");
        System.out.println("Pessoa física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa ABC", "ACME Ltda.", "12.345.678/0001-90", "ACME", "Rua Principal, 123");
        System.out.println("\nPessoa jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Nome da empresa: " + pessoaJuridica.getNomeEmpresa());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Razão Social: " + pessoaJuridica.getRazaoSocial());
        System.out.println("Localização: " + pessoaJuridica.getLocalizacao());
    }
}