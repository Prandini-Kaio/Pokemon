package DB;

import Pokemons.PKMNS.Bulbassaur;
import Pokemons.Pokemon;

import javax.xml.crypto.Data;
import javax.xml.transform.Result;
import java.util.*;
import java.sql.*;

public class SQLDB implements DataBase
{
    private String url = "jdbc:postgresql://localhost/postgres";
    private String user = "postgres";
    private String pass = "123";

    public static void main(String[] args) {
        DataBase db = new SQLDB();

        Pokemon pokemon = new Bulbassaur(Pokemon.Rarity.Comum);
        pokemon.setSurname("TESTE");

        //db.insertPokemon(pokemon);

        db.getPokemonData(2);
    }

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    @java.lang.Override
    public long insertPokemon(Pokemon pokemon) {
        StringBuilder query = new StringBuilder();

        query.append("INSERT INTO pokemon(name_pokemon, surname_pokemon)")
        .append("VALUES(?,?)");

        long id = 0;

        try(Connection conn = connection();
            PreparedStatement ps = conn.prepareStatement(query.toString(), Statement.RETURN_GENERATED_KEYS))
        {
            ps.setString(1, pokemon.getName());
            ps.setString(2, pokemon.getSurname());

            System.out.println("Connection sucessfull");

            int affectedRows = ps.executeUpdate();

            if(affectedRows > 0)
            {
                try(ResultSet rs = ps.getGeneratedKeys())
                {
                    if(rs.next())
                    {
                        id = rs.getLong(1);
                        pokemon.setId(id);
                        System.out.println(pokemon.getId());
                    }
                }catch (SQLException ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        }catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }

        return id;
    }

    @Override
    public int getPokemonData(long id) {
        String query = "SELECT * FROM pokemon WHERE id_pokemon = ?";

        int affectedRows = 0;

        try(Connection connection = connection())
        {
            PreparedStatement st = connection.prepareStatement(query);

            st.setLong(1, id);

            System.out.println("Connection sucessfull");
            ResultSet rs = st.executeQuery();

            if(rs.next())
            {
                System.out.printf("Id: %d\nName: %s\nElement: %s\n\n", rs.getInt("id_pokemon"),
                        rs.getString("name_pokemon"), rs.getString("element_pokemon"));
            }
        }catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }

        return affectedRows;
    }

    @Override
    public long updatePokemon(Pokemon pokemon) {
        String query = "UPDATE ";
        return 0;
    }

    @Override
    public long deletePokemon(long id) {
        return 0;
    }
}
