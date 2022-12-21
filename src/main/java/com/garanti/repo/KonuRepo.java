package com.garanti.repo;

import com.garanti.Constants;
import com.garanti.model.Ders;
import com.garanti.model.Konu;
import com.garanti.model.Ogrenci;

import java.sql.*;
import java.util.ArrayList;

public class KonuRepo {
    public ArrayList< Konu > getALl() {
        ArrayList< Konu> liste = new ArrayList<>();
        Connection connection = null;
        Statement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.createStatement();
            result = stmt.executeQuery("select * from BILGE.KONU");
            while (result.next())
            {
                Konu temp = new Konu(result.getInt("ID"), result.getString("NAME"));
                liste.add(temp);
            }
        }
        catch (Exception e){
            liste.clear();
            System.err.println(e.getMessage());
        }
        finally{
            try{
                result.close();
                stmt.close();
                connection.close();
            }
            catch (SQLException e){
                // throw new mybussinessexception()
            }
        }
        return liste;
    }

    public Konu getById(int id ) {
        Konu konu = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection = Constants.getConnection();
            statement = connection.prepareStatement("select * from BILGE.KONU where ID = ?");
            statement.setInt(1,id);
            result = statement.executeQuery();
            while ( result.next() ) {
                konu = new Konu(result.getInt(1), result.getString("NAME"));
            }
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        finally {
            try {
                result.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return konu;
    }

    public boolean deleteById(int id) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            connection.setAutoCommit(false);
            stmt = connection.prepareStatement("delete from BILGE.KONU where ID = ?");
            stmt.setInt(1,id);
            result = stmt.executeUpdate() == 1;
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            try
            {
                stmt.close();
                connection.commit();
                connection.close();
            }
            catch (SQLException e)
            {
                // throw new mybussinessexception()
            }
        }
        return result;
    }

    public boolean save(Konu konu) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("Insert into BILGE.KONU (NAME) values (?)");
            stmt.setString(1, konu.getNAME());
            result = stmt.executeUpdate() == 1;
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                // throw new mybussinessexception()
            }
        }
        return result;
    }
}
