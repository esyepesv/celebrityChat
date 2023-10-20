package co.com.celebritychat.model.chat;
import co.com.celebritychat.model.message.Message;
import co.com.celebritychat.model.user.User;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Chat {
    private String id;
    private List<User> participants;
    private List<Message> messages;
}
