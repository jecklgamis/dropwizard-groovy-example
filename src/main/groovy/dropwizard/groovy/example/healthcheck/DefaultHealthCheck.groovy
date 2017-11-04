package dropwizard.groovy.example.healthcheck

import com.codahale.metrics.health.HealthCheck
import groovy.transform.CompileStatic

@CompileStatic
class DefaultHealthCheck extends HealthCheck {

    @Override
    protected HealthCheck.Result check() throws Exception {
        HealthCheck.Result.healthy()
    }
}
