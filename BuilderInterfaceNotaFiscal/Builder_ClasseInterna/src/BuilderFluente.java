/**
 *
 * @author Luiz
 */
public class BuilderFluente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BuilderFluente p = new BuilderFluente()
                .comNome("Maria")
                .comCpf("123456")
                .comDataNascimento(01, 01, 1990)
                .comAltura(170)
                .comPeso(60)
                .comTipoSanguineo("A+")
                .doSexoFeminino()
                .doadorDeOrgaos()
                .comEndereco("Rua Norte", 100)
                .constroi();
    }
    
}
