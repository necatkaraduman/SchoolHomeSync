/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqliteconnection;

/**
 *
 * @author 23723
 */
public class JavaSQLiteConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sqlite conn = new Sqlite("ExtraLessons.sqlite");
        conn.connect();
    }
    
}
