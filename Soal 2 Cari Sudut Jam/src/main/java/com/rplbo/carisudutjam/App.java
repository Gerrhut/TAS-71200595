package com.rplbo.carisudutjam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Database db = new Database();
        db.createDB();
        db.connect();
        db.createTable();
        System.out.println();
        db.updateAll();
        System.out.println();
        db.writeln();
    }
}
