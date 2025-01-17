package bankproject;

import bankproject.dao.GenericDao;
import bankproject.dao.GenericDaoImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;
import java.util.List;

public class MainBank {
    public static void main(String[] args) {
        GenericDao<Client> clientDao = new GenericDaoImpl<>(Client.class);
        GenericDao<Account> accountDao = new GenericDaoImpl<>(Account.class);


        Client client = new Client();
        client.setFirstName("Marcin");
        client.setLastName("Najman");
        clientDao.openNew(client);

        Account account = new Account();
        account.setClient(client);
        accountDao.openNew(account);
    }
}
