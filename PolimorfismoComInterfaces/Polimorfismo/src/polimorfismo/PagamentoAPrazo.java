/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

public class PagamentoAPrazo implements RegradePagamento{
    @Override
    public double pagar (Venda venda){
        return venda.getTotalVendido() * 0.08;
    }
}
