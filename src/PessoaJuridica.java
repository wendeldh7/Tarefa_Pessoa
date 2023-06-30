public class PessoaJuridica extends Pessoa {
    private String nomeEmpresa;
    private String cnpj;
    private String razaoSocial;
    private String localizacao;

    public PessoaJuridica(String nome, String nomeEmpresa, String cnpj, String razaoSocial, String localizacao) {
        super(nome);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.localizacao = localizacao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}