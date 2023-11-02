package co.com.celebritychat.mongo;

import co.com.celebritychat.model.chat.Chat;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<Chat, String>, ReactiveQueryByExampleExecutor<Chat> {
}
