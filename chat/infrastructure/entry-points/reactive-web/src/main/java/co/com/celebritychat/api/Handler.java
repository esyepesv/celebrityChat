package co.com.celebritychat.api;

import co.com.celebritychat.usecase.chat.ChatUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private final ChatUseCase chatUseCase;

    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("Hello world");
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        // useCase2.logic();
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }
}
