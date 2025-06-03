package org.redhat;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private static final String HOSTNAME = System.getenv().getOrDefault("HOSTNAME", "unknown");

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        // Updated message for version 2 (Green)
        String versionMessage = "Hello from app-v2 (Green) 🟢 - New and Improved!";
        return String.format("%s served by host: %s", versionMessage, HOSTNAME);
    }
}
