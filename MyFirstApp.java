public class MyFirstApp {
    
    public static void main(String [] args){

        Compra compra = new Compra ();

        Pix pix = new Pix();
        Dinheiro dinheiro = new Dinheiro();
        Cartao cartao = new Cartao();

        compra.pagar(pix, 500);


    }
    
}