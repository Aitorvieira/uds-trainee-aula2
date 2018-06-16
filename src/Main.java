import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Aitor" , "87080-989", "Rua X", "587", "casa A", "Jardim X", "Maringá - PR","44 9818-7858");

        System.out.println(pessoa.obterInformacoes());
    }
}
