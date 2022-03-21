package com.muwaffaq.innopolis.solid.homework;

public class Business {
    private Account account;

    Business(Account account) {
        this.account = account;
    }

    Business() {
        this(new Account());
    }

    Account getAccount() {
        return account;
    }

    public void ownCompany() {
    }

    public void becomeEmployee() {
    }
}
