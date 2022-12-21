package com.garanti.repo;

import com.garanti.Constants;
import com.garanti.model.Ders;
import com.garanti.model.DersDTO;
import com.garanti.model.Konu;
import com.garanti.model.Ogretmen;

import java.sql.*;
import java.util.ArrayList;

public class DersRepo {
    public ArrayList< Ders > getALl() {
        ArrayList< Ders > liste = new ArrayList<>();
        Connection connection = null;
        Statement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.createStatement();
            result = stmt.executeQuery("select * from BILGE.DERS");
            while (result.next())
            {
                Ders temp = new Ders(result.getInt("ID"), result.getInt("OGR_ID"), result.getInt("KONU_ID"));
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

    public Ders getById(int id) {
        Ders ders = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("select * from BILGE.DERS where ID = ?");
            stmt.setInt(1,id);
            result = stmt.executeQuery();
            while (result.next())
            {
                ders = new Ders(result.getInt("ID"), result.getInt("OGR_ID"), result.getInt("KONU_ID"));
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            try
            {
                result.close();
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                // throw new mybussinessexception()
            }
        }
        return ders;
    }

    public boolean deleteById(int id) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            connection.setAutoCommit(false);
            stmt = connection.prepareStatement("delete from BILGE.DERS where ID = ?");
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

    public boolean save(Ders ders) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("Insert into BILGE.DERS (OGR_ID, KONU_ID) values (?, ?)");
            stmt.setInt(1, ders.getOGR_ID());
            stmt.setInt(2, ders.getKONU_ID());
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
