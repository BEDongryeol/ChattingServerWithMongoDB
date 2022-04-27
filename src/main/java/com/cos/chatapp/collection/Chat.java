package com.cos.chatapp.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "chat")
public class Chat {

    @Id
    private String id;
    private String msg;
    // 채팅은 room에 메세지를 보내는 형식으로 구현하는 것이 편하다.
    private String sender;   // 보내는 사람
    private String receiver; // 받는 사람(귓속말)
    private Integer roomNum; // 방번호

    private LocalDateTime createdAt;
}
