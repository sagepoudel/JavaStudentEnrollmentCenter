package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {
	public static PreparedStatement connect(String sql) {

        //String query = "SELECT * FROM TableNaran";
		PreparedStatement ps=null;
        try {
                // Load the jdbc-odbc bridge driver

                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                String url = "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=Saroj;username=sa;password=123ppp;";
				Connection con = DriverManager.getConnection(url);
				System.out.println("connection success");
				 ps=con.prepareStatement(sql);
				


                // Create a Statement object so we can submit
                // SQL statements to the driver
               // Statement stmt = con.createStatement ();

         // Submit a query, creating a ResultSet object

 //ResultSet rs = stmt.executeQuery (query);

         // Display all columns and rows from the resultset
               // printResultSet (rs);

                //rs.close();
               //stmt.close();
               // con.close();
        }
        catch (SQLException ex) {
                while (ex != null) {
                        System.out.println ("SQL Exception:  " +

                                ex.getMessage ());
                        ex = ex.getNextException ();
                }
        }
        catch (java.lang.Exception ex) {
                ex.printStackTrace ();
        }
		return ps;
		
}
}



/*private static void printResultSet (ResultSet rs)
        throws SQLException
{
        int numCols = rs.getMetaData().getColumnCount ();

        while ( rs.next() ) {
                for (int i=1; i<=numCols; i++) {
                    System.out.print(rs.getString(i) + " | ");
                }
                System.out.println();
        }
}
}
*/
