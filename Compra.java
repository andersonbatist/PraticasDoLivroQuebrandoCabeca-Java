public class Compra {

    

    InterfacePagamento pagamento;
    double valor;

    public void pagar (InterfacePagamento pagamento, double valor) {
        this.pagamento = pagamento;
        this.valor = valor;
        pagamento.pagar(valor);
    }

}
