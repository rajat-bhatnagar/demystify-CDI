package bl.producers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import bl.qualifiers.MySqlConnection;

public class JdbcConnectionProducer {
	
	@Inject
	private Logger logger;
	
	@Produces
	@MySqlConnection
	private Connection createConnection() throws SQLException{
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "password");
		logger.info("Connection to mysql database has been established");
		return connection;
	}
	/*
	 * Disposes will close the database connection once connection is established and is used
	 */
	@SuppressWarnings("unused")
	private void closeConnection(@Disposes @MySqlConnection Connection connection) throws SQLException {
		connection.close();
		logger.info("Connection to mysql database is CLOSED");
    }

}
