package endterm_project;

import java.sql.*;

public class sql extends Board{
    String connectionUrl="jdbc:postgresql://localhost:5432/java_project";
    Connection con;
    ResultSet insert;
    ResultSet rs;
    Statement stmt;
    public void player2Won() { //sending data to DBMS if player2 won
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "2106");
            stmt = con.createStatement();
            insert = stmt.executeQuery("insert into GameResults(Gamer1, Gamer2) values ('lose','won')");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }
    public void player1Won(){ //sending data to DBMS if player1 won
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "2106");
            stmt = con.createStatement();
            insert = stmt.executeQuery("insert into GameResults(Gamer1, Gamer2) values ('won','lose')");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }
    public void Player1Stat(){ //getting data about win count of player 1 from DBMS
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "2106");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select count(*) from GameResults where Gamer1 ='won';");
            while (rs.next()) {
                System.out.println("Player1 total wins: " + rs.getInt("count"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }
    public void Player2Stat(){ //getting data about win count of player 1 from DBMS
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "2106");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select count(*) from GameResults where Gamer2 ='won';");
            while (rs.next()) {
                System.out.println("Player2 total wins: " + rs.getInt("count"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }
}
