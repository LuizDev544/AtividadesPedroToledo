import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PTOLEDO
 */
public class NotaFiscalbuilder {
    private String razaoSocial;
    private String cnpj;
    private Date dataEmissao;
    private double valorBruto;
    private double impostos;
    private List<ItemDaNota> itens;
    private String observacoes;

    public void comRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    public void comCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public void comDataEmissao(int dia, int mes, int ano){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = dia + "/" + mes + "/" + ano;
        try{
            dataEmissao = sdf.parse(data);
        } catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
        
    }
    
    public void comValorBruto(double valorBruto){
        this.valorBruto = valorBruto;
    }
    
    public void comImpostos(double impostos){
        this.impostos = impostos;
    }
    
    public void comItens(List<ItemDaNota> itens){
        this.itens = itens;
    }
    
    public void comObservacoes(String observacoes){
        this.observacoes = observacoes;
    }

    public NotaFiscal constroi(){
        return new NotaFiscal();
    }
}
