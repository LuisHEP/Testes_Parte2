package ExemplesModulo23e24.Testes2.service;

import ExemplesModulo23e24.Testes2.dao.IContratoDao;

/**
 * @author michele.codes
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}