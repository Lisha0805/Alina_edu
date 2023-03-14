import Observer.ChatObserver;
import Observer.Chats;
import Observer.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChatsTest {

    Chats chat;
    ChatObserver chatObserver;

    @BeforeEach
    void createChatAndCreateObserver() {
        chat = new Chats();
        chatObserver = new User("Юзер1");
    }

    @Test
    void addObserverTest(){
        int expectedChatSize = 1;
        chat.addObserver(chatObserver);
        assertEquals(expectedChatSize, chat.getObservers().size());
    }

    @Test
    void removeObserverTest(){
        chat.addObserver(chatObserver);
        int expectedChatSize = 1;
        chat.removeObserver(chatObserver);
        assertEquals(expectedChatSize - 1, chat.getObservers().size());
    }
}