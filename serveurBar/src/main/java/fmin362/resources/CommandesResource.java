package fmin362.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fmin362.model.Commande;

@Path( "/commande" )
public class CommandesResource {
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Commande> commandes(){
		return null;
		//TODO	
		
	}

}