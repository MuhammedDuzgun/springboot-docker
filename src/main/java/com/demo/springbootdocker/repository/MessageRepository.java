package com.demo.springbootdocker.repository;

import com.demo.springbootdocker.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
