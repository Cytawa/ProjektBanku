package bankproject;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bank.class)
public abstract class Bank_ {

	public static volatile SingularAttribute<Bank, Integer> bankId;
	public static volatile ListAttribute<Bank, Client> clientList;

	public static final String BANK_ID = "bankId";
	public static final String CLIENT_LIST = "clientList";

}

