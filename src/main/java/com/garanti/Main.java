package com.garanti;

import com.garanti.model.*;
import com.garanti.repo.*;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        /*OgretmenRepo repo = new OgretmenRepo();
        ArrayList< Ogretmen > ogretmenler = repo.getALl();
        System.err.println(ogretmenler.toString());
        System.err.println(repo.getById(4));
        System.err.println(repo.getAnnoyings(true));
        if ( repo.deleteById(6) ) {
            System.err.println("Başarı ile silindi");
        }
        else {
            System.err.println("Başarı ile silinemedi");
        }
        if ( repo.save(new Ogretmen("Deniz", true)))
        {
            System.err.println("Başarı ile kaydedildi");
        }
        else {
            System.err.println("Başarı ile kaydedilemedi");
        }*/

//        System.err.println(repo.getALlLike("e"));
//        System.err.println(repo.getALlLike("e"));



       /* DersDTORepo dersDTO = new DersDTORepo();
        ArrayList<DersDTO> dtolar = dersDTO.getALl();
        System.err.println(dtolar.toString());*/

        /*DersRepo ders = new DersRepo();
        ArrayList< Ders > dersler = ders.getALl();
//        System.err.println(dersler.toString());
//        System.err.println(repo.getById(5));
         *//*if ( ders.deleteById(4) ) {
            System.err.println("Başarı ile silindi");
        }
        else System.err.println("Silme işlemi başarısız!");*//*
        if ( ders.save(new Ders(5,4)))
        {
            System.err.println("Başarı ile kaydedildi");
        }
        else System.err.println("Başarı ile kaydedilemedi");*/

//        KonuRepo konu = new KonuRepo();
//        ArrayList< Konu > konular = konu.getALl();
//        System.err.println(konular.toString());
//        System.err.println(konu.getById(3));
        /*if ( konu.deleteById(4) ) {
            System.err.println("Başarı ile silindi");
        }
        else System.err.println("Silme işlemi başarısız!");*/
        /*if ( konu.save(new Konu("Threads")))
        {
            System.err.println("Başarı ile kaydedildi");
        }
        else System.err.println("Başarı ile kaydedilemedi");*/

        /*OgrenciRepo ogrenci = new OgrenciRepo();
        ArrayList< Ogrenci > ogrenciler = ogrenci.getALl();
//        System.err.println(ogrenciler.toString());
//        System.err.println(ogrenci.getById(2));
//        System.err.println(ogrenci.getByInfo(7, "Ali"));
        if ( ogrenci.deleteById(7) ) {
            System.err.println("Başarı ile silindi");
        }
        else System.err.println("Silme işlemi başarısız!");

        if ( ogrenci.save(new Ogrenci("Gürcan", 1289, 3)))
        {
            System.err.println("Başarı ile kaydedildi");
        }
        else System.err.println("Başarı ile kaydedilemedi");*/


//        Ders_OgrenciRepo dersOgrenci = new Ders_OgrenciRepo();
//        ArrayList<Ders_Ogrenci> derslerVeOgrenciler = dersOgrenci.getALl();
//        System.err.println(derslerVeOgrenciler.toString());
//        System.err.println(dersOgrenci.getByNote(50));
        /*if ( dersOgrenci.save(new Ders_Ogrenci(85,6,4,1)) ) {
            System.err.println("Başarı ile kaydedildi");
        }
        else System.err.println("Başarı ile kaydedilemedi.");*/
        /*if ( dersOgrenci.deleteById(6)) {
            System.err.println("Başarı ile silindi");
        }
        else System.err.println("Başarı ile silinemedi");*/

    }
}


/**
 * catch (PSQLException e)
 *         {
 *             if (e.getServerErrorMessage() != null)
 *             {
 *                 System.err.println(e.getServerErrorMessage().getSchema());
 *                 System.err.println(e.getServerErrorMessage().getConstraint());
 *                 System.err.println(e.getServerErrorMessage().getHint());
 *                 System.err.println(e.getServerErrorMessage().getTable());
 *                 System.err.println(e.getServerErrorMessage().getSQLState());
 *                 System.err.println(e.getServerErrorMessage().getSeverity());
 *                 System.err.println(e.getServerErrorMessage().getRoutine());
 *                 System.err.println(e.getServerErrorMessage().getPosition());
 *                 System.err.println(e.getServerErrorMessage().getInternalQuery());
 *                 System.err.println(e.getServerErrorMessage().getColumn());
 *                 System.err.println(e.getServerErrorMessage().getWhere());
 *                 System.err.println(e.getServerErrorMessage().getFile());
 *                 System.err.println(e.getServerErrorMessage().getDetail());
 *                 System.err.println(e.getServerErrorMessage().getMessage());
 *             }
 *             else
 *             {
 *                 System.err.println("PSQL -> " + e.getLocalizedMessage());
 *             }
 *         }
 *         catch (SQLException e)
 *         {
 *             System.err.println("SQL -> " + e.getMessage());
 *         }
 *         catch (Exception e)
 *         {
 *             System.err.println("EXC -> " + e.getMessage());
 *         }
 */