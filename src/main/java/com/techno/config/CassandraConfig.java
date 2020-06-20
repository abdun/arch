package com.techno.config;

//import com.datastax.driver.core.AuthProvider;
//import com.datastax.driver.core.PlainTextAuthProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;


@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {
    private static final Log LOGGER = LogFactory.getLog(CassandraConfig.class);

//    @Value("${spring.data.cassandra.contact-points:placeholder}")
//    private String contactPoints;

    @Value("${spring.data.cassandra.port:0000}")
    private int port;

    @Value("${spring.data.cassandra.keyspace:placeholder}")
    private String keySpace;

    @Value("${spring.data.cassandra.username}")
    private String username;

    @Value("${spring.data.cassandra.password}")
    private String password;

    @Value("${spring.data.cassandra.schema-action}")
    private String schemaAction;

    @Override
    protected String getKeyspaceName() {
        return keySpace;
    }

//    @Override
//    protected String getContactPoints() {
//        return contactPoints;
//    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.valueOf(schemaAction);
    }


    @Override
    protected String getLocalDataCenter() {
        return "dc1";
    }
//    @Override
//    protected AuthProvider getAuthProvider() {
//        return new PlainTextAuthProvider(username, password);
//    }
}