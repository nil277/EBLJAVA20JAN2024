package com.wecp.progressive.dao;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;

import java.sql.*;
import java.util.*;

public class CustomerDAOImpl implements CustomerDAO{
    public int addCustomer(Customers customers){
        String sql = "insert into Customers (name,email,username,password,role) values(?,?,?,?,?)";
        try{
            Connection con  = DatabaseConnectionManager.getConnection();
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, customers.getName());
            st.setString(2, customers.getEmail());
            st.setString(3, customers.getUserName());
            st.setString(4, customers.getPassword());
            st.setString(5, customers.getRole());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if(rs.next()){
                customers.setCustomerId(rs.getInt(1));
            }
            con.close();
            st.close();
            return 1;
        }catch(SQLException e){
            e.printStackTrace();;
        }
        return 0;
    }
    public Customers getCustomerById(int customerId){
        String sql = "select * from customers where customer_Id = "+ customerId;
        Customers customers = null;
        try{
            Connection con  = DatabaseConnectionManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                customers = new Customers(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
            }
            con.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return customers;
    }
    public void updateCustomer(Customers customers){
        String sql = "update customers set name = ?, email = ?, username = ?, password = ?, role = ? where customer_id = ?";
        try{
            Connection con  = DatabaseConnectionManager.getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, customers.getName());
            st.setString(2, customers.getEmail());
            st.setString(3, customers.getUserName());
            st.setString(4, customers.getPassword());
            st.setString(5, customers.getRole());
            st.setInt(6, customers.getCustomerId());
            st.executeUpdate();
            con.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();;
        }
    }
    public void deleteCustomer(int customerId){
        String sql = "delete from customers where customer_id = " + customerId;
        try{
            Connection con  = DatabaseConnectionManager.getConnection();
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public List<Customers> getAllCustomers(){
        List<Customers> list = new ArrayList<Customers>();
        String sql = "select * from customers";
        try{
            Connection con  = DatabaseConnectionManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Customers customers = new Customers(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(customers);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public CustomerAccountInfo getCustomerAccountInfo(int customerId){
        return new  CustomerAccountInfo();
    }
}
