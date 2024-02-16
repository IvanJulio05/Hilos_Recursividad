public class Hilos {

    public static void main(String[] args) {
        Thread musica=new Thread(new Musica());
        Thread reloj=new Thread(new Reloj());
        
        reloj.start();
        musica.start();
        
    }
}
