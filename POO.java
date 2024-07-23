import java.util.Scanner;


public class POO implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{

    public void tocar(){
        System.out.println("Reproduzindo música.");
    }
    public void pausar(){
        System.out.println("Música pausada.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Sua musica é " + musica);
    }


    public void atender(){
        System.out.println("Atendeu telefone.");
    }
    public void ligar(String numero){
        System.out.println("Estamos ligando para "+ numero); 
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciou o Correio de Voz.");
    }


    public void atualizarPagina(){
        System.out.println("Atualizou página.");
    }
    public void adicionarNovaAba(){
        System.out.println("Add nova aba"); 
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo a página com url: "+ url);
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        POO iphone = new POO();


        System.out.print("Digite o nome da música para selecionar: ");
        String musica = scanner.nextLine();
        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();

        System.out.print("Digite o número para ligar: ");
        String numero = scanner.nextLine();
        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.print("Digite a URL da página para exibir: ");
        String url = scanner.nextLine();
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        scanner.close();
    }
}
