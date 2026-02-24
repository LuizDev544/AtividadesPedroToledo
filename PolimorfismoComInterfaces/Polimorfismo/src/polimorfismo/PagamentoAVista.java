/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

public class PagamentoAVista implements RegradePagamento{
    @Override
    public double pagar (Venda venda){
        double total = 0;
        
        if (venda.getTotalVendido() > 500){
            total = venda.getTotalVendido() * 0.85;
        } else {
            
            if (venda.getTotalVendido() > 300) {
                total = venda.getTotalVendido() * 0.90;
            }
        }
        
        return total;
    }
}
