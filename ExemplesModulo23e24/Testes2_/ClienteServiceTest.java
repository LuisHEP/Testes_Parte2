package ExemplesModulo23e24.Testes2_;

import ExemplesModulo23e24.Testes2.dao.ClienteDao;
import ExemplesModulo23e24.Testes2.dao.ClienteDaoMock;
import ExemplesModulo23e24.Testes2.dao.IClienteDao;
import ExemplesModulo23e24.Testes2.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author michele.codes
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
