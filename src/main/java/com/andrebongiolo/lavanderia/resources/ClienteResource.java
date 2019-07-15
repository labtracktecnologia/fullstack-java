package com.andrebongiolo.lavanderia.resources;

import com.andrebongiolo.lavanderia.models.Cliente;
import com.andrebongiolo.lavanderia.service.AbstractService;
import com.andrebongiolo.lavanderia.service.ClienteService;


import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }

}
