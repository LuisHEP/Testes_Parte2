package ExemplesModulo23e24.Testes2.service;

import ExemplesModulo23e24.Testes2.dao.IClienteDao;

/**
 * @author michele.codes
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}