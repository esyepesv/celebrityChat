package co.com.celebritychat.model.chat.gateways;

import co.com.celebritychat.model.chat.Chat;
import reactor.core.publisher.Mono;

public interface ChatRepository {
    Mono<Chat> findById(String chatId);
    Mono<Chat> save(Chat chat);
    Mono<Void> delete(Chat chat);
}
