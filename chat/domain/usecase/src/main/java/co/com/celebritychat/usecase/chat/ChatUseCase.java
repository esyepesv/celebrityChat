package co.com.celebritychat.usecase.chat;

import co.com.celebritychat.model.chat.Chat;
import co.com.celebritychat.model.chat.gateways.ChatRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ChatUseCase {

    private final ChatRepository chatRepository;

    public Mono<Chat> findById(String chatId){
        return chatRepository.findById(chatId);
    }
    public Mono<Chat> save(Chat chat){
        return chatRepository.save(chat);
    }
    public Mono<Void> delete(String chatId){
       return chatRepository.delete(chatId);
    }

}
