/**
 * Created on: 2015-04-01
 * Klas Tärnström
 * klas ( at ) tarnstrom.se
 */

package vITs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class DBConnect {

    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    /**
     * Reads the database.
     * @param query
     * @throws Exception
     */
    public ResultSet readDB(String query) throws Exception {
        try {
            // Laddar MySQL-driver.
            Class.forName("com.mysql.jdbc.Driver");
            // Setup för DB-uppkopplingen
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/vitsdb?"
                            + "user=root&password=password");

            //Statements möjliggör SQL-queries mot databasen
            statement = connect.createStatement();

            //ResultSet hämtar resultatet för SQL-queries.
            resultSet = statement.executeQuery(query);
            return resultSet;
        } catch (Exception e) {
                throw e;
        } finally {
            close();
        }
    }

    /**
     * Manipulates the database.
     * @param query
     * @throws Exception
     */
    public void writeDB(String query) throws Exception {
        try {
        //Laddar MySQL-driver
            Class.forName("com.mysql.jdbc.Driver");
        //Setup för DB-uppkopplingen
            System.out.println("Kopplar upp mot databasen..");
        connect = DriverManager
                .getConnection("jdbc:mysql://localhost/vitsdb?"
                        + "user=root&password=password");
            System.out.println("Uppkoppling mot DB lyckades..");

        //Statement möjliggör SQL-queries mot databasen.
        statement = connect.createStatement();
            statement.executeUpdate(query);

        } catch(SQLException se){
        //Handle errors for JDBC
        se.printStackTrace();
    } catch(Exception e){
        //Handle errors for Class.forName
        e.printStackTrace();
    } finally {
            close();
        }
    }

    /**
     * Skriver ut ResultSet i console.
     * @param resultSet
     * @throws SQLException
     */
    private void writeResultSet(ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {
            String rid = resultSet.getString("rid");
            String firstname = resultSet.getString("firstname");
            String lastname = resultSet.getString("lastname");
            System.out.println(rid);
            System.out.println(firstname);
            System.out.println(lastname);
        }

    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
    
    /**
     * Skapar ett autoincrement på integerbaserade IDn i databasen. 
     * Ex: getAutoIncrement("SELECT rid FROM rapport"); ger tillbaka nästa RID i storleksordning.
     * @return
     */
    public int getAutoIncrement(String query) {
    	
    	try {
    		
    	ResultSet result = readDB(query);
    	
    	ArrayList<String> idList = new ArrayList<>();
    	
    	int i = 0;
    	
    	while (result.next()) {   		
    		idList.add(result.getString(i));
    		i++;
    	}
    	
    	Collections.sort(idList);
    	
    	return Integer.parseInt(idList.get(i));
    	
    	} catch (Exception e) {
    		
    		System.out.println(e);
    		return 0;
    	}
    	
    	
    }

}
