package com.techno.config;


//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.env.Environment;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.mongodb.MongoDatabaseFactory;
//
//import com.mongodb.client.MongoClient;

//@Configuration
//@ComponentScan(basePackages = {"com.techno.config"})
//@EnableMongoRepositories(basePackages = {"com.techno.config"})

//public class MongoDbConfig {
//    private final Logger LOG = LoggerFactory.getLogger(getClass());
//    @Autowired
//    private Environment env;
//    @Value("${spring.data.mongodb.uri}")
//    private String dbUri;
//    @Value("${spring.data.mongodb.databasename}")
//    private String databaseName;
//    @Value ("${spring.data.mongodb.host}")
//    private String localhost;
//    @Value ("${spring.data.mongodb.port}")
//    private int port;
//
//    @Autowired
//    private MongoDatabaseFactory mongo;


/*
    @Bean
    public SimpleMongoClientDatabaseFactory mongoDbFactory() throws Exception {
        //MongoDatabase mongoDatabase = mongoClient.getDatabase(databaseName);

        //MongoClient mongoClient = new MongoClient(localhost, port);
        //MongoClient mongoClient1 =  (MongoClient)MongoClients.create(env.getProperty(dbUri));

        SimpleMongoClientDatabaseFactory sm = new  SimpleMongoClientDatabaseFactory(mongoClient, databaseName);
        return sm;
    }
*/
//    public @Bean MongoClient mongoClient() {
//        return MongoClients.create("mongodb://localhost:27017");
//    }
//
//    @Primary
//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        MongoTemplate mongoTemplate = null;
//        //MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
//        return mongoTemplate;
//
//    }

    /*
  fun mongoTemplate(mongoDbFactory: MongoDbFactory): MongoTemplate {
        return MongoTemplate(mongoDbFactory)
    }

MongoClient mongoClient = new MongoClient();
    MongoDatabase db = mongoClient.getDatabase(databaseName);
    MongoCollection<Document> plants = db.getCollection("plants");

    FindIterable findIterable = plants.find();
    Iterator iterator = findIterable.iterator();
    while(iterator.hasNext()){
        Document plant = (Document) iterator.next();
        List<Document> plantComments = (List<Document>) ((Document) plant.get("metadata")).get("comments");
        assertEquals(0,plantComments.size());
    }
     */

//}
