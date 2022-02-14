package DB;

import Pokemons.PKMNS.Bulbassaur;
import Pokemons.Pokemon;

import javax.xml.crypto.Data;
import javax.xml.transform.Result;
import java.util.*;
import java.sql.*;

public class SQLDB implements DataBase
{
    private String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=123";


    public SQLDB() throws SQLException {
        SQLDB sqldb = this;

        Pokemon p1 = new Bulbassaur(Pokemon.Rarity.Comum);
        p1.setCurrentLife(1);

        sqldb.savePokemon(p1);
        sqldb.selectTable();
    }

    public int updateName(int id, String name)
    {
        //Query de comando POSTGRES SQL
        String query = "UPDATE pokemon "
                + "SET name_pokemon = ? "
                + "WHERE id_pokemon = ?";
        //Colunas afetadas pelo comando
        int affectedRows = 0;

        try(Connection connection = connection();
        PreparedStatement pstmt = connection.prepareStatement(query))
        {

            pstmt .setString(1, name);
            pstmt.setInt(2, id);

            affectedRows = pstmt.executeUpdate();

        }catch (SQLException e)
        {
            System.out.println("Conexao falhou");
            System.out.println(e.getMessage());
        }

        return affectedRows;
    }

    public int updateLife(int id, int currentLife)
    {
        //Query de comando POSTGRES SQL
        String query = "UPDATE pokemon "
                + "SET currentLife = ? "
                + "WHERE id_pokemon = ?";
        //Colunas afetadas pelo comando
        int affectedRows = 0;

        try(Connection connection = connection();
            PreparedStatement pstmt = connection.prepareStatement(query))
        {

            pstmt .setInt(1, currentLife);
            pstmt.setInt(2, id);

            affectedRows = pstmt.executeUpdate();

        }catch (SQLException e)
        {
            System.out.println("Conexao falhou");
            System.out.println(e.getMessage());
        }

        return affectedRows;
    }

    void selectTable()
    {

        String query = "SELECT * FROM pokemon";

        try {

            Statement statement = connection().createStatement();

            ResultSet rs = statement.executeQuery(query);

            while(rs.next())
            {
                int id = rs.getInt("id_pokemon");
                int id_pokebola = rs.getInt("id_pokebola");
                String name = rs.getString("name_pokemon");
                String surname = rs.getString("surname_pokemon");
                int currentLife = rs.getInt("currentLife");
                int maxLife = rs.getInt("maxLife");


                System.out.printf("ID: %d\nID PKBL: %d\nName: %s\nSurname: %s\nCurrentLife: %d\nMaxLife: %d\n-------\n\n", id,
                        id_pokebola, name, surname, currentLife, maxLife);
            }
            rs.close();
            statement.close();
            connection().close();
        }catch (SQLException e)
        {
            System.out.println("Conexao falhou");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void savePokemon(Pokemon pokemon) {



        System.out.printf("Rows afected: %d\nRows afected: %d\n", updateName(1, pokemon.getName()),
                updateLife(1, pokemon.getCurrentLife()));
    }

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(url);
    }
}
