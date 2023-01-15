package test;
import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class BookPriceFilter implements MessageSelector {
    @Override
        public boolean accept(Message<?> message) {
            MyBook MyBook = (MyBook) message.getPayload();
            return MyBook.getPrice() >= 9;
        }
}



