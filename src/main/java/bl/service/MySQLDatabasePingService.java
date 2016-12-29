package bl.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import bl.qualifiers.MySqlConnection;

@ApplicationScoped
public class MySQLDatabasePingService {
	
	@Inject
	private Logger logger;
	
	/*
	 * Inject Database Connection to MySql Database from JdbcConnectionProducer
	 */
	
	@Inject @MySqlConnection
	private Connection connection;
	
	public void pingDatabase() throws SQLException{
		logger.info("Executing Sql Query");
		connection.createStatement().executeQuery("select count(*) from help_category");
	}
	
}
