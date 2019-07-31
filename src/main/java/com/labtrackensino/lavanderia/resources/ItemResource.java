package com.labtrackensino.lavanderia.resources;

import com.labtrackensino.lavanderia.models.Item;
import com.labtrackensino.lavanderia.service.AbstractService;
import com.labtrackensino.lavanderia.service.ItemService;

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
