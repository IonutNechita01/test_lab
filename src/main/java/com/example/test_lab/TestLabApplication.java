package com.example.test_lab;

import com.example.test_lab.models.Message;
import com.example.test_lab.models.MessagePrintVisitor;
import com.example.test_lab.models.MessageVisitee;
import com.example.test_lab.models.MessageVisitor;
import com.example.test_lab.services.MessageDecoderContext;
import com.example.test_lab.services.MessageReader;
import com.example.test_lab.services.MessageReaderSingleton;
import com.example.test_lab.services.MessiDecoder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class TestLabApplication {

	public static void main(String[] args) {
		try {
			MessageReader messageReader = MessageReaderSingleton.getInstance();
			List<Message> messages = messageReader.readMessagesFromFile("D:\\dev\\test_lab\\test_lab\\src\\main\\java\\com\\example\\test_lab\\messages.json");

			MessageDecoderContext decoderContext = new MessageDecoderContext();

			for (Message message : messages) {
				String decodedMessage = decoderContext.decodeMessage(message.getMessage());
				System.out.println("Decoded Message: " + decodedMessage);
			}

			MessageVisitee messageVisitee = new MessageVisitee(messages);
			MessageVisitor printVisitor = new MessagePrintVisitor();
			messageVisitee.accept(printVisitor);
		} catch (IOException e) {
			System.err.println("Eroare la citirea mesajelor din fișier: " + e.getMessage());
		}
	}

}

// build 1p - un punct prea muncit
// git repo 1p
// Message class 1p
// Singleton 2p
// Strategy 2p
// Visitee & Visitor 2p
// total 9p
