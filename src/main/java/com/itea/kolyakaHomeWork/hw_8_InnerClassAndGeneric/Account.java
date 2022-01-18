package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    int idAccount;
    String accountOwner;
    private class Transaction{
        int idTransaction;
        Date dateTransaction;
        int transactionTypeId;
    }
    ArrayList<Transaction> transactionList;
}
