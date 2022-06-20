// Nama : Gerry Sunjay Junjung
// NIM  : 71200595

package com.rplbo.carisudutjam;
import static java.lang.Math.abs;
import java.sql.*;
public class Database {
    private String urlDB;

    public Database(){
        this.urlDB = "jdbc:sqllite:waktu.db";
    }

    public void createDB(){
        try (Connection con = DriverManager.getConnection(this.urlDB)){
            if(con != null){
                DatabaseMetaData meta = con.getMetaData();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public Connection connect(){
        Connection con = null;
    }

    public void createTable(){

    }

    public void updateAll(){

    }

    public void writeln(){

    }

    public void deleteAll(){

    }
}
