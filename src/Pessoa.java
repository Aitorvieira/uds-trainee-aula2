import java.util.ArrayList;

public class Pessoa {
//atributos
    private String nome = null;
    private String cep = null;
    private String rua = null;
    private String numero = null;
    private String complemento = null;
    private String bairro = null;
    private String cidade = null;
    private String telefone = null;

    // construtor
    Pessoa(String nome, String cep, String rua, String numero, String complemento, String bairro, String cidade, String telefone){
        this.nome = nome;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
    }
    // método 01
    public String obterInformacoes(){
        return "Nome: " + this.nome + "\n" +
                "CEP: " + this.cep + "\n" +
                "Rua: " + this.rua + "\n" +
                "Numero: " + this.numero + "\n" +
                "Complemento: " + this.complemento + "\n" +
                "Bairro: " + this.bairro + "\n" +
                "cidade: " + this.cidade + "\n" +
                "telefone: " + this.telefone;
    }


}
