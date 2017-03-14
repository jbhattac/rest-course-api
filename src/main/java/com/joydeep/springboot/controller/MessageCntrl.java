package com.joydeep.springboot.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joydeep.springboot.service.MessageService;
import com.joydeep.springboot.vo.Message;

@RestController
public class MessageCntrl {
	
	@Autowired
	MessageService messageService;
	
	@RequestMapping(value="/Messages",method=RequestMethod.GET,produces="application/json")
	public List<Message> getAllMessage(){
		return messageService.getAllMessage();
	}
	
	@RequestMapping(value="/Messages/{id}",method=RequestMethod.GET,produces="application/json")
	public Message getMessage(@PathVariable String id){
		return messageService.getMessage(id);
	}
	
	@RequestMapping(value="/Messages",method=RequestMethod.POST,produces="application/json")
	public List<Message> addMessage(@RequestBody Message msg){
		return messageService.addMessage(msg);
	}
	
	@RequestMapping(value="/Messages/{id}",method=RequestMethod.PUT,produces="application/json")
	public Message updateMessage(@PathVariable String id,@RequestBody Message msg){
		return messageService.updateMessage(id,msg);
	}
	
	@RequestMapping(value="/Messages/{id}",method=RequestMethod.DELETE,produces="application/json")
	public List<Message> deleteMessage(@PathVariable String id){
		return messageService.deleteMessage(id);
	}

}
