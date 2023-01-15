package test;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

public class MyBookSplitter extends AbstractMessageSplitter {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object splitMessage(Message<?> message) {
        MyBook myBook = (MyBook) message.getPayload();
        if (!myBook.getType().equals(type)) {
            return myBook;
        }
        return null;
    }
}