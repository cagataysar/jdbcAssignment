package com.garanti.repo;

import com.garanti.Constants;
import com.garanti.model.Ogretmen;

import java.sql.*;
import java.util.ArrayList;

public class OgretmenRepo {


    public ArrayList<Ogretmen> getALlLike(String name) {
        ArrayList<Ogretmen> liste = new ArrayList<>();
        Ogretmen ogretmen = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
//            stmt = connection.prepareStatement("select * from BILGE.OGRETMEN where NAME LIKE '%" + name + "%'");
            stmt = connection.prepareStatement("select * from BILGE.OGRETMEN where NAME LIKE ?");
            stmt.setString(1, "%" + name + "%");
            result = stmt.executeQuery();
            while (result.next())
            {
                Ogretmen temp = new Ogretmen(result.getInt("ID"), result.getString("NAME"), result.getBoolean("IS_GICIK"));
                liste.add(temp);
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
        return liste;
    }

    public ArrayList<Ogretmen> getALl() {
        ArrayList<Ogretmen> liste = new ArrayList<>();
        Connection connection = null;
        Statement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.createStatement();
            result = stmt.executeQuery("select * from BILGE.OGRETMEN");
            while (result.next())
            {
                Ogretmen temp = new Ogretmen(result.getInt("ID"), result.getString("NAME"), result.getBoolean("IS_GICIK"));
                liste.add(temp);
            }
        }
        catch (Exception e){
            liste.clear();
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
        return liste;
    }

    public Ogretmen getById(int id) {
        Ogretmen ogretmen = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("select * from BILGE.OGRETMEN where ID = ?");
            stmt.setInt(1,id);
            result = stmt.executeQuery();
            while (result.next())
            {
                ogretmen = new Ogretmen(result.getInt("ID"), result.getString("NAME"), result.getBoolean("IS_GICIK"));
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
        return ogretmen;
    }

    public ArrayList< Ogretmen > getAnnoyings(boolean annoying) {
        ArrayList<Ogretmen> liste = new ArrayList<>();
        Ogretmen ogretmen = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("select * from BILGE.OGRETMEN where IS_GICIK = ?");
            stmt.setObject(1, annoying);
            result = stmt.executeQuery();
            while (result.next())
            {
                Ogretmen temp = new Ogretmen(result.getInt("ID"), result.getString("NAME"), result.getBoolean("IS_GICIK"));
                liste.add(temp);
                if ( !annoying ) {
                    liste.remove(temp);
                }
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
        return liste;
    }

    public boolean deleteById(int id) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            connection.setAutoCommit(false);
            stmt = connection.prepareStatement("delete from BILGE.OGRETMEN where ID = ?");
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

    public boolean save(Ogretmen ogretmen) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("Insert into BILGE.OGRETMEN (NAME, IS_GICIK) values (?, ?)");
            stmt.setString(1, ogretmen.getNAME());
            stmt.setBoolean(2, ogretmen.isIS_GICIK());
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
