package com.cos.chatapp.repository;

import com.cos.chatapp.collection.Chat;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;

public interface ChatRepository extends ReactiveMongoRepository<Chat, String> {

    @Tailable // 커서를 닫지 않고 유지한다.
    @Query("{sender:?0, receiver:?1}")
    Flux<Chat> mFindBySender(String sender, String receiver);
}
