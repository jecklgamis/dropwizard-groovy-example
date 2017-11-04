package dropwizard.groovy.example

import dropwizard.groovy.example.healthcheck.DefaultHealthCheck
import dropwizard.groovy.example.resource.RootResource
import groovy.transform.CompileStatic
import io.dropwizard.Application
import io.dropwizard.setup.Environment

@CompileStatic
class ExampleApp extends Application<ExampleAppConfig> {

    @Override
    void run(ExampleAppConfig config, Environment env) throws Exception {
        env.jersey().register(new RootResource())
        env.healthChecks().register('default', new DefaultHealthCheck())
    }

    static void main(String... args) {
        new ExampleApp().run(args)
    }
}