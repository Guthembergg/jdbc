package mainproject;

import connector.DBConnection;
import model.User;

import java.sql.SQLException;
import java.util.ArrayList;

public class GestioneDB {
    public static void main( String [] args)  {

        try {
            DBConnection db = new DBConnection();
            User utente = new User("Mario","triop",25,"m.ghuu@example.com");
            db.createUser(utente);

            User utenteLetto=db.findUser(1);
           // System.out.println(utenteLetto);
            //utenteLetto.setAnni(44);
            //utenteLetto.setNome("Gino");
            //db.updateUser(utenteLetto);
            ArrayList<User> userList= db.findAllUsers();
            userList.forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
