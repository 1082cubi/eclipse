package ch09nested.book.p423.moonje7;

import ch08interface.book.p369.C;

public class Chatting {
    class Chat{
        void start(){}
        void senmessage(String message){}
    }
    void startChat(String chatId) {
//        String nickName = null;
//        nickName = chatId;

        final String nickName = chatId;

        Chat chat = new Chat(){
            @Override
            public void start(){
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]"+inputData;
                    senmessage(message);
                }
            }
        };
        chat.start();

    }
}
