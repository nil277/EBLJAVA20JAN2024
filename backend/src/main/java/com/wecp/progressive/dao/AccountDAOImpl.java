package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Accounts;

public class AccountDAOImpl implements AccountDAO {

    private static List<Accounts> accounts = new ArrayList<>();

    @Override
    public int addAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
        return -1;
    }

    @Override
    public Accounts getAccountById(int accountId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
        return null;
    }

    @Override
    public void updateAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccounts() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
        return null;
    }

}
