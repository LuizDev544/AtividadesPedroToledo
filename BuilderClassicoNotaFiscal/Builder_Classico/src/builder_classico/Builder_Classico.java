/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder_classico;

import java.util.List;

/**
 *
 * @author PTOLEDO
 */
public class Builder_Classico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        
        builder.comRazaoSocial("Maria");
        builder.comCnpj("123456");
        builder.comDataEmissao(01, 01, 1990);
        builder.comValorBruto(1000.0);
        builder.comImpostos(100.0);
        builder.comItens(List.of(new ItemDaNota("Produto 1", 100.0)));
        builder.comObservacoes("Observações da nota fiscal");

        NotaFiscal nf = builder.constroi();

    }
    
}
