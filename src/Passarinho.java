public class Passarinho extends Animal{

    public Passarinho(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("piupiu");
    }
    public void voar() {
        System.out.println("o passarinho voou");
    }
}
