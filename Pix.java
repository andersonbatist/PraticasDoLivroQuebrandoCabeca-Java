public class Pix implements InterfacePagamento {

    public void pagar (double valor) {
        System.out.println ("Obrigado! Você realizou o pagamento de R$" + valor + " via PIX");
    }
    
}
