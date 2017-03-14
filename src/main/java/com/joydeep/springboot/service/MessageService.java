package com.joydeep.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joydeep.springboot.Test1;
import com.joydeep.springboot.vo.Message;

@Service
public class MessageService {
	
	List<Message> msgList = new ArrayList<Message>(Arrays.asList(
			new Message("1","Hello 1","J1",new Date()),
			new Message("2","Hello 2","J2",new Date()),
			new Message("3","Hello 3","J3",new Date())
			));
	
	
	
	public List<Message> getAllMessage(){
		return msgList;
	}
	
	public Message getMessage(String id){
		return msgList.stream().filter(m->m.getId().equals(id)).findFirst().get();
	}
	
	public List<Message> addMessage(Message msg){
		msg.setCreated(new Date());
		msgList.add(msg);
		return msgList;
	}
	
	public Message updateMessage(String id,Message msg){
		Message msgl = msgList.stream().filter(m->m.getId().equals(id)).findFirst().get();
		msgl.setAuthor(msg.getAuthor());
		msgl.setCreated(new Date());
		msgl.setText(msg.getText());
		return msgl;
	}
	
	public List<Message> deleteMessage(String id){
		msgList.removeIf(m->m.getId().equals(id));
		return msgList;
	}

}
