package rest.config;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class JaxRsConfig extends javax.ws.rs.core.Application {
    {
        System.out.println("GOOD");
    }

}
