package co.com.celebritychat.model.message;
import co.com.celebritychat.model.user.User;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Message {
    private String id;
    private User sender;
    private String content;
    private LocalDateTime timestamp;
}
