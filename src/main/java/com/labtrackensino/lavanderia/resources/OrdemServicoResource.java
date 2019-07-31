package com.labtrackensino.lavanderia.resources;

import com.labtrackensino.lavanderia.models.OrdemServico;
import com.labtrackensino.lavanderia.service.AbstractService;
import com.labtrackensino.lavanderia.service.OrdemServicoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/ordens")
public class OrdemServicoResource extends AbstractResource<OrdemServico> {

	@Inject
	private OrdemServicoService service;

	@Override
	protected AbstractService<OrdemServico> getService() {
		return service;
	}

}
