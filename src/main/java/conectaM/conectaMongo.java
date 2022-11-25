package conectaM;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.sql.SQLOutput;

public class conectaMongo {
    String database = "archDoc";
    String collection = "archDoc";

    public void getValues(){
        String url = "mongodb://localhost";
        MongoClient mongo = MongoClients.create(url);
        MongoDatabase db = mongo.getDatabase(database);
        MongoCollection<Document> docs = db.getCollection(collection);
        for(Document doc: docs.find()){
            System.out.println(doc);
        }

    }

    public String selectValues(int codigo){
        String a = "";
        String url = "mongodb://localhost";
        MongoClient mongo = MongoClients.create(url);
        MongoDatabase db = mongo.getDatabase(database);
        MongoCollection<Document> docs = db.getCollection(collection);
        Document doc = docs.find(Filters.eq("_id", codigo)).first();
        a = doc.getString("nome");
        return a;
    }

    public void insertValues(String user, String password, String justificativa){
        String url = "mongodb://localhost";
        MongoClient mongo = MongoClients.create(url);
        MongoDatabase db = mongo.getDatabase(database);
        MongoCollection<Document> docs = db.getCollection(collection);
        Document docBuilder = new Document();
        docBuilder.append("user", user);
        docBuilder.append("password", password);
        docBuilder.append("justificativa", justificativa);
        docs.insertOne(docBuilder);
    }
}
