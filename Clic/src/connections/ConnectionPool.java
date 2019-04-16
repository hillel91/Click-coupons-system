package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import exceptions.GetConnectionException;
import exceptions.LoadDriver;

/**
 * 
 * @author hbpe9 This class represents a pool of connections to the DB
 */

	//this is a singleton class - only one instance of this class can be created
	// Steps of singleton class:
		//1. create a private CTOR 
		//2. create a private static instance of this class
		//3. create public static method to obtain the instance
public class ConnectionPool {

	private static ConnectionPool instance; // 1st step of singelton
	private static Set<Connection> connections = new HashSet<>();
	public static final int max_Connenctions = 10;
	private String driverName = "jdbc:derby://localhost:1527/dbCompany;create=true;";
	private String url = "";

	private ConnectionPool() throws LoadDriver { /* 2nd step of singelton: private constructor */

		Class.forName(driverName);
		for (int i = 0; i < max_Connenctions; i++) {
			connections.add(DriverManager.getConnection(url));
		}
	}

	public static ConnectionPool getInstance() throws LoadDriver { // 3th step of singelton
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

	public synchronized Connection getConnection() {
		if (connections.size() > 0) {

			connections.remove(connections.size() - 1);
			return (Connection) connections;
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				GetConnectionException getConnectionException = new GetConnectionException();
				getConnectionException.error();
			}
		}
		return null;
	}

	public synchronized Connection getConnection() {
		try {
			while(connections.isEmpty()) {
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Iterator<Connection> it = connections.iterator();
		Connection con = it.hasNext();
		it.remove();
		return null;
	}
	
	public synchronized void restoreConnection(Connection con) {
		connections.add(con);
		notify();
	}
	
	public void closeAllConnections() {
		//Don't use "foreach()". It's not nice to "cat" the use in the connections
		// It's batter to hold the connections which allready in the connectionPool
		//and do not get it for someone who requires it.
		//And wait to the connections which will return
	}

}
