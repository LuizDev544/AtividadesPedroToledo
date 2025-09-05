/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia_comdao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PTOLEDO
 */
public class Persistencia_comDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        try {
            ProdutoDAO pdao = new ProdutoDAO();
            Produto p = new Produto();
            System.out.println("Digite a descrição: ");
            p.setDescricao(scanner.nextLine());
            
            System.out.println("Digite o valor:");
            p.setPreco(Double.parseDouble(scanner.nextLine()));
            
            System.out.println("Digite o fornecedor:");
            p.setFornecedor(scanner.nextLine());
            
            pdao.cadastrar(p);
            System.out.println("Cadastrado com sucesso.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        
        scanner.close();
        
        ProdutoDAO pdao = new ProdutoDAO();
        try {
            
            
            List<Produto> lprod = pdao.consultarTodos();
            for(int i=0; i < lprod.size(); i++ ){
                Produto p = lprod.get(i);
                System.out.println("\nID..........: " + p.getId() );
                System.out.println("Decricao....: " + p.getDescricao());
                System.out.println("Preco.......: " + p.getPreco() );
            }
            
            
           
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
       
    }

}
