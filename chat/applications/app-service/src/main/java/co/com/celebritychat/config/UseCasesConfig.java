package co.com.celebritychat.config;

import co.com.celebritychat.model.chat.Chat;
import co.com.celebritychat.model.chat.gateways.ChatRepository;
import co.com.celebritychat.mongo.MongoDBRepository;
import co.com.celebritychat.mongo.MongoRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import reactor.core.publisher.Mono;

@Configuration
@ComponentScan(basePackages = "co.com.celebritychat.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        @Bean
        public ChatRepository chatRepository() {
                // Aquí debes configurar y retornar la implementación adecuada de ChatRepository,
                // por ejemplo, JpaChatRepository.
                return new ChatRepository() {
                        @Override
                        public Mono<Chat> findById(String chatId) {
                                return null;
                        }

                        @Override
                        public Mono<Chat> save(Chat chat) {
                                return null;
                        }

                        @Override
                        public Mono<Void> delete(String chatId) {
                                return null;
                        }
                }; // Esto es solo un ejemplo, asegúrate de configurar adecuadamente tu implementación.
        }

}
