import DB.DataBase;
import DB.SQLDB;
import Screen.ScreenController;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public class Main 
{
    public static void main(String[] args) throws SQLException {

        //new ScreenController();

        DataBase db = new SQLDB();
    }
}