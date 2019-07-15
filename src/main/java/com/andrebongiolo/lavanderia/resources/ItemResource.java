package com.andrebongiolo.lavanderia.resources;

import com.andrebongiolo.lavanderia.models.Item;
import com.andrebongiolo.lavanderia.service.AbstractService;
import com.andrebongiolo.lavanderia.service.ItemService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/itens")
public class ItemResource extends AbstractResource<Item> {

	@Inject
	private ItemService service;

	@Override
	protected AbstractService<Item> getService() {
		return service;
	}

}
