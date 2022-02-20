package bankproject;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile SingularAttribute<Account, Integer> accountId;
	public static volatile SingularAttribute<Account, BigDecimal> balance;
	public static volatile SingularAttribute<Account, String> accountType;
	public static volatile SingularAttribute<Account, Client> client;
	public static volatile SingularAttribute<Account, String> currency;

	public static final String ACCOUNT_ID = "accountId";
	public static final String BALANCE = "balance";
	public static final String ACCOUNT_TYPE = "accountType";
	public static final String CLIENT = "client";
	public static final String CURRENCY = "currency";

}

