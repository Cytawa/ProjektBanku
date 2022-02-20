package bankproject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BNK_ID")
    private int bankId;


    private List<Client> clientList;

/*
    public void newClient(Client client) {
        clientList.add(client);
    }

    public void deleteClient(Client client){
        clientList.remove(client);
    }

    public List<Client> getClientList() {
        return clientList;
    }

 */
}
