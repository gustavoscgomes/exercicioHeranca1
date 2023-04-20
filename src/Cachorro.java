public class Cachorro extends Animal implements Correr {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("auau");
    }

    @Override
    public void correr() {
        System.out.println("o cachorro correu");
    }
}
