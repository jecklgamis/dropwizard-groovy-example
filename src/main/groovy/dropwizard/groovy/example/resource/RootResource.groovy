package dropwizard.groovy.example.resource

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Response

import static javax.ws.rs.core.MediaType.APPLICATION_JSON

@Path("/")
class RootResource {

    @GET
    @Produces(APPLICATION_JSON)
    def defaultResource() {
        def entity = ["name"           : "dropwizard-groovy-example", "message": "It works for sure!",
                      "java.version"   : System.getProperty("java.version"),
                      "java.vm.version": System.getProperty("java.vm.version")]
        Response.ok().entity(entity).build()

    }
}
