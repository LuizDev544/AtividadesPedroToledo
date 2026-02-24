/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

public class TesteVenda {
    public static void main(String[] args) {
        Venda v = new Venda();
        v.setTotalVendido(350.0);
        
        RegradePagamento pagamento = new PagamentoAVista();
        v.setRegraDePagamento(pagamento);
        
        System.out.println(v.calcularTotal());
        
    }
}
