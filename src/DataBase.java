import Personnage.Personnage;

import java.sql.*;
import java.util.Scanner;

public class DataBase {

    static final String DB_URL = "jdbc:mysql://localhost/donjonsetdragons";
    static final String USER = "EHoudon";
    static final String PASS = "QyapAV627";
    public Connection mydb;

    public DataBase() {
        System.out.println("Connecting to a selected database...");
        // Open a connection
        try {
            this.mydb = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = mydb.createStatement();
            System.out.println("Connected database successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CreateHero(Personnage joueur) {

        try {
            PreparedStatement pstmt = mydb.prepareStatement
                    ("insert into hero (Type,Nom,NiveauVie,BaseAttack,TotalAttack,TypeWeapon) values (?,?,?,?,?,?)");
            pstmt.setString(1, joueur.getType());
            pstmt.setString(2, joueur.getName());
            pstmt.setInt(3, joueur.getLife());
            pstmt.setInt(4, joueur.getAttackStrength());
            pstmt.setInt(5, joueur.getAttackStrength());
            pstmt.setString(6, joueur.TypeWeapon);

            int i = pstmt.executeUpdate();
            System.out.println(i + " records inserted");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void UpdateHero(Personnage joueur) {
        String NomJoueur = joueur.getName();
        int Life = joueur.getLife();
        int TotalAttack = joueur.getTotalAttack();
        try {
            PreparedStatement pstmt = mydb.prepareStatement
                    ("update hero set NiveauVie = ?, TotalAttack = ?  WHERE Nom = ?");

            pstmt.setInt(1, Life);
            pstmt.setInt(2, TotalAttack);
            pstmt.setString(3, NomJoueur);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void DeleteHero() {
        Scanner newMenu = new Scanner(System.in);
        System.out.println("Quel personnage voulez vous supprimer?");
        System.out.println("Ecrire son ID: ");
        String IdCharacter = newMenu.nextLine();

        try {
            PreparedStatement pstmt = mydb.prepareStatement
                    ("delete from hero WHERE id = ?");
            pstmt.setString(1, IdCharacter);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void ListPlayer() {
        try {
            Statement stmt = mydb.createStatement();
            //Query to retrieve records
            String query = "Select * from hero";
            //Executing the query
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Mes Personnages: ");
            //Moving the cursor from default position to 1st row.
            while (rs.next()) {
                //Current record details.
                System.out.print("id: " + rs.getInt("id") + ", ");
                System.out.print("Type: " + rs.getString("Type") + ", ");
                System.out.print("Name: " + rs.getString("Nom") + ", ");
                System.out.print("Vie: " + rs.getInt("NiveauVie") + ", ");
                System.out.print("Attaque: " + rs.getInt("TotalAttack") + ". ");
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


}





