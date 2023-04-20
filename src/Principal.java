public class Principal {

    public static void main(String[] args) {

        Passarinho p = new Passarinho("fulano");
        Cachorro c = new Cachorro("rex");
        Gato g = new Gato("xaninho");

        p.emitirSom();
        p.voar();

        c.emitirSom();
        c.correr();

        g.emitirSom();
        g.correr();


    }
}
