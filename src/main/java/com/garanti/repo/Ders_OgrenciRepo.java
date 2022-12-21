package com.garanti.repo;

import com.garanti.Constants;
import com.garanti.model.Ders_Ogrenci;
import com.garanti.model.Ogretmen;

import java.sql.*;
import java.util.ArrayList;

public class Ders_OgrenciRepo {
    public ArrayList< Ders_Ogrenci > getALl() {
        ArrayList< Ders_Ogrenci> liste = new ArrayList<>();
        Connection connection = null;
        Statement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.createStatement();
            result = stmt.executeQuery("select * from BILGE.DERS_OGRENCI");
            while (result.next())
            {
//                Ogrenci ogrenci = new Ogrenci(result.getInt("ID"), result.getString("NAME"), result.getInt("OGR_NUMBER"), result.getInt("YEAR"));
                Ders_Ogrenci dersOgrenci = new Ders_Ogrenci(result.getInt("ID"), result.getInt("NOTE"), result.getInt("DEVAMSIZLIK"), result.getInt("DERS_ID"), result.getInt("OGRENCI_ID"));
                liste.add(dersOgrenci);
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

    public Ders_Ogrenci getByNote(int note) {
        Ders_Ogrenci dersOgrenci = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("select * from BILGE.DERS_OGRENCI where NOTE = ?");
            stmt.setInt(1,note);
            result = stmt.executeQuery();
            while (result.next())
            {
                dersOgrenci = new Ders_Ogrenci(result.getInt("ID"), result.getInt("NOTE"), result.getInt("DEVAMSIZLIK"), result.getInt("DERS_ID"), result.getInt("OGRENCI_ID"));
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
        return dersOgrenci;
    }

    public boolean deleteById(int id) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            connection.setAutoCommit(false);
            stmt = connection.prepareStatement("delete from BILGE.DERS_OGRENCI where ID = ?");
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

    public boolean save(Ders_Ogrenci ders_ogrenci) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.prepareStatement("Insert into BILGE.DERS_OGRENCI (NOTE, DEVAMSIZLIK, DERS_ID, OGRENCI_ID) values (?, ?, ?, ?)");
            stmt.setInt(1, ders_ogrenci.getNOTE());
            stmt.setInt(2, ders_ogrenci.getDEVAMSIZLIK());
            stmt.setInt(3, ders_ogrenci.getDERS_ID());
            stmt.setInt(4, ders_ogrenci.getOGRENCI_ID());
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
