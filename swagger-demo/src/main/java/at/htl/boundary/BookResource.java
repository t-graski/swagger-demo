package at.htl.boundary;


import at.htl.model.Book;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/book")
public class BookResource extends OpenApiResource {

    public BookResource() {
        super();
    }

    @GET
    @Path("")
    @Operation(summary = "Get all books",
            description = "Returns a list of all books in the database",
            tags = {"book"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "List of books",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON,
                                    schema = @Schema(implementation = Book.class)
                            )
                    )
            }
    )
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return Book.listAll();
    }



}
