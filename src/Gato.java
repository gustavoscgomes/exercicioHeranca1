public class Gato extends Animal implements Correr{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    @Override
    public void correr() {
        System.out.println("O gato correu");

    }
}
