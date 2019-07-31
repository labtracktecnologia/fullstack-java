package com.labtrackensino.lavanderia.service;


import com.labtrackensino.lavanderia.exception.ValidaDocumentoException;
import com.labtrackensino.lavanderia.models.Cliente;
import com.labtrackensino.lavanderia.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.validation.Valid;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ClienteService extends AbstractService<Cliente> {

	@Inject
	private GenericDao<Cliente> dao;

	@Override
	protected GenericDao<Cliente> getDao() {
		return dao;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Cliente insert(@Valid Cliente bean) {
		if(bean.getDocumento().matches("[0-9]+")){
			return getDao().insert(bean);
		}

		throw new ValidaDocumentoException();
	}
}
