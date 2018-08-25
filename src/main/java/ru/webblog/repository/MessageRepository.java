package ru.webblog.repository;


import ru.webblog.model.Message;
import ru.webblog.repository.specification.MessageSpecification;

import java.util.List;

public interface MessageRepository {
	void addMessage(Message message);
	void delMessage(Message message);
	void updateMessage(Message message);

	List query(MessageSpecification specification);
}
