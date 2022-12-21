package com.garanti.repo;

import com.garanti.Constants;
import com.garanti.model.Ders;
import com.garanti.model.DersDTO;

import java.sql.*;
import java.util.ArrayList;

public class DersDTORepo {
    public ArrayList< DersDTO > getALl() {
        ArrayList< DersDTO > liste = new ArrayList<>();
        Connection connection = null;
        Statement stmt = null;
        ResultSet result = null;
        try{
            connection = Constants.getConnection();
            stmt = connection.createStatement();
            result = stmt.executeQuery("select * from BILGE.DERSDTO");
            while (result.next())
            {
//                Ders temp = new Ders(result.getInt("ID"), result.getInt("OGR_ID"), result.getInt("KONU_ID"));
                DersDTO temp = new DersDTO(result.getInt(1), result.getString(2), result.getString(3));
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

}
