package ExemplesModulo23e24.Testes2_;

import ExemplesModulo23e24.Testes2.dao.ContratoDao;
import ExemplesModulo23e24.Testes2.dao.IContratoDao;
import ExemplesModulo23e24.Testes2.dao.mocks.ContratoDaoMock;
import ExemplesModulo23e24.Testes2.service.ContratoService;
import ExemplesModulo23e24.Testes2.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author michele.codes
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}