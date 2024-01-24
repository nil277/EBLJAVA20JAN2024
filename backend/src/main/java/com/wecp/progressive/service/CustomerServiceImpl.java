package com.wecp.progressive.service;

import java.sql.SQLException;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.entity.Customers;

import java.util.*;
import java.sql.*;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customers> list = new ArrayList<>();
    private static CustomerDAO customerDAO;
    public CustomerServiceImpl(CustomerDAO customerDAO)
    {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        // TODO Auto-generated method stub
        return list;
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
        return null;
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
        list.add(customers);
        return customers.getCustomerId();
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
        return null;
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
        return null;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
        return null;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
        List<Customers> listCopy = new ArrayList<>(list);
        Collections.sort(listCopy);
        return listCopy;
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }


}