package br.com.fiap.seriesapi;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.seriesapi.model.Personagem;
import br.com.fiap.seriesapi.service.PersonagemService;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("personagens")
public class PersonagemResource {

    PersonagemService service = new PersonagemService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Personagem> index() throws ClassNotFoundException {
        return service.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarPorId(@PathParam("id") Long id) throws SQLException, ClassNotFoundException {
        var personagem = service.findById(id);
        if (personagem == null) return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(personagem).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) throws SQLException, ClassNotFoundException {
        var personagem = service.findById(id);
        if (personagem == null) return Response.status(Response.Status.NOT_FOUND).build();
        service.delete(personagem);
        return Response.noContent().build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Personagem personagem) throws ClassNotFoundException {
        if (!service.create(personagem)) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok(personagem).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response update(@PathParam("id") Long id, Personagem personagem) throws SQLException, ClassNotFoundException {
        var personagemEncontrado = service.findById(id);
        if (personagemEncontrado == null) return Response.status(Response.Status.NOT_FOUND).build();
        if (!service.update(personagem)) return Response.status(Response.Status.BAD_REQUEST).build();
        return Response.ok(personagem).build();
    }
}
