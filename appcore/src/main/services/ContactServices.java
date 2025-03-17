import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ContactServices {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContacts(){
        return contactRepository.fin
    }
}
