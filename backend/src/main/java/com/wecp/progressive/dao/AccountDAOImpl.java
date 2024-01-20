package com.wecp.progressive.dao;

import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Accounts;
import java.sql.*;

public class AccountDAOImpl implements AccountDAO{

    public static Connection con = null;
    static{
        try{
            con = DatabaseConnectionManager.getConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int addAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        String sql = "insert int accounts(cutomer_id,balance) values(?,?)";
        try{

        }catch(Exception e){

        }
        return 0;
    }

    @Override
    public Accounts getAccountById(int accountId) {
        // TODO Auto-generated method stub
        Accounts account = null;
        return account;
    }

    @Override
    public void updateAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccounts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }

}
