package ru.webblog;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static Connection connection;

	public static Connection getConnection(){
		if(connection==null){
			FileInputStream fis;
			Properties property = new Properties();
			String dbname = "";
			String login = "";
			String password = "";
			try {
				fis = new FileInputStream("src/main/resources/db.properties");
				property.load(fis);
				dbname = property.getProperty("db.name");
				login = property.getProperty("db.login");
				password = property.getProperty("db.password");
			} catch (IOException e) {
				System.err.println("ОШИБКА: Не удалось получить файл конфигурации");
			}
			String connStr = "jdbc:mysql://localhost:3306/"+dbname;
			try{
				connection = DriverManager.getConnection(connStr,login,password);

			} catch (SQLException ex){
				System.err.println("Ошибка - не удалось подключиться к БД"); }
		}
		return connection;
	}
}
