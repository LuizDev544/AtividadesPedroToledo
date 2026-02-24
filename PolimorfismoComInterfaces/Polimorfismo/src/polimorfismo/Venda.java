/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

public class Venda {
    private double TotalVendido;
    private RegradePagamento pagamento;
    
    public double getTotalVendido() {
        return TotalVendido;
    }
    
    public void setTotalVendido(double totalVendido) {
        this.TotalVendido = totalVendido;
    }
    
    
    public void setRegraDePagamento(RegradePagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public double calcularTotal () {
        return pagamento.pagar(this);
    }
}
