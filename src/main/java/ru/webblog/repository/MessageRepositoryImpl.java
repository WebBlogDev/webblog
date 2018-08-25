package ru.webblog.repository;

import ru.webblog.DBConnection;
import ru.webblog.model.Message;
import ru.webblog.repository.specification.MessageSpecification;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class MessageRepositoryImpl implements MessageRepository {
	@Override
	public void addMessage(Message message) {
		Connection connection = DBConnection.getConnection();
		try{
			PreparedStatement ps = connection.prepareStatement("INSERT INTO Message (Text,AuthorID,IsReaded) VALUES(?,?,0");
			ps.setString(1,message.getText());
			ps.setLong(2,message.getAuthorId());
			ps.execute();

		} catch (SQLException ex){
			System.err.println("Ошибка добавления сообжения");
			ex.printStackTrace();
		}
	}

	@Override
	public void delMessage(Message message) {
		if(message.getId()==0L) return;
		Connection connection = DBConnection.getConnection();
		try{
			PreparedStatement ps = connection.prepareStatement("DELETE FROM Message WHERE ID = ?");
			ps.setLong(1,message.getId());
			ps.execute();
		}catch (SQLException ex){
			System.err.println("Невозможно удалить сообщение с ID="+message.getId());
			ex.printStackTrace();
		}
	}

	/**
	 * Обновлять сообщения пока нет необходимости,выходим
	 * TODO реализовать возможность редактирования сообщений
	 * @param message объект сообщения
	 */
	@Override
	public void updateMessage(Message message) {
		return;
	}

	@Override
	public List query(MessageSpecification specification) {
		return null;
	}
}
