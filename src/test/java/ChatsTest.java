import Observer.ChatObserver;
import Observer.Chats;
import Observer.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChatsTest {

    Chats chat;
    ChatObserver chatObserver;
    int expectedChatSize;

    @BeforeEach
    void createChatAndCreateObserver() {
        chat = new Chats();
        chatObserver = new User("Юзер1");
        expectedChatSize = 1;
    }

    @Test
    void addObserverTest(){
        chat.addObserver(chatObserver);
        assertEquals(expectedChatSize, chat.getObservers().size());
    }

    @Test
    void removeObserverTest(){
        chat.addObserver(chatObserver);
        chat.removeObserver(chatObserver);
        assertEquals(expectedChatSize - 1, chat.getObservers().size());
    }
}