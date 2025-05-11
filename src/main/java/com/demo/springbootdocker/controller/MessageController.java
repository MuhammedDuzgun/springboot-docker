package com.demo.springbootdocker.controller;

import com.demo.springbootdocker.entity.Message;
import com.demo.springbootdocker.repository.MessageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    private final MessageRepository messageRepository;


    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        Message savedMessage = messageRepository.save(message);
        return ResponseEntity.ok(savedMessage);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getMessageById(@PathVariable("id") Long id) {
        Message message = messageRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("message not found"));
        return ResponseEntity.ok(message);
    }

}
