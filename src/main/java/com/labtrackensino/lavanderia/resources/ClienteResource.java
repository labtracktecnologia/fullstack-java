package com.labtrackensino.lavanderia.resources;

import com.labtrackensino.lavanderia.models.Cliente;
import com.labtrackensino.lavanderia.service.AbstractService;
import com.labtrackensino.lavanderia.service.ClienteService;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response insert(Cliente bean) {

		return Response
				.status(Response.Status.CREATED)
				.entity(getService().insert(bean)).build();
	}
}
