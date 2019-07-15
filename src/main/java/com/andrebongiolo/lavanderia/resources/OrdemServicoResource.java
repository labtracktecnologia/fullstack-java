package com.andrebongiolo.lavanderia.resources;

import com.andrebongiolo.lavanderia.models.OrdemServico;
import com.andrebongiolo.lavanderia.service.AbstractService;
import com.andrebongiolo.lavanderia.service.OrdemServicoService;

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
