

public interface ContactRepository extends MongoRepository<Contact,String>{

    Contact findAll();
} 
    
