// Classe principal representando o iPhone
public class Iphone {
    public static void main(String[] args) {
        Iphone meuIphone= new Iphone();
        // Testando o reprodutor musical
        System.out.println("Testando o Reprodutor Musical:");
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.pular();
        System.out.println();

        // Testando o aparelho telefônico
        System.out.println("Testando o Aparelho Telefônico:");
        meuIphone.ligar("1234-5678");
        meuIphone.iniciarCorreioVoz();
        meuIphone.atender();
        System.out.println();

        // Testando o navegador na internet
        System.out.println("Testando o Navegador na Internet:");
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.atualizarPagina();
        meuIphone.adicionarNovaAba();
    }
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone() { // Corrigido para "Iphone"
        this.reprodutor = new ReprodutorMusical();
        this.telefone = new AparelhoTelefonico();
        this.navegador = new NavegadorInternet();
    }

    // Métodos do reprodutor musical
    public void tocar() {
        reprodutor.tocar();
    }

    public void pausar() {
        reprodutor.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    public void pular() {
        reprodutor.pular();
    }

    // Métodos do aparelho telefônico
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    public void atender() {
        telefone.atender();
    }

    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    // Métodos do navegador de internet
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}

// Classe representando o reprodutor musical
class ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void pular() {
        System.out.println("Pulando música.");
    }
}

// Classe representando o aparelho telefônico
class AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo telefone.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}

// Classe representando o navegador de internet
class NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
