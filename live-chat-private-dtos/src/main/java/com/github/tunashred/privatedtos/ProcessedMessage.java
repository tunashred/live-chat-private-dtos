package com.github.tunashred.privatedtos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tunashred.dtos.UserMessage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProcessedMessage {
    String channelName;
    UserMessage userMessage;
    String originalMessage;
    Boolean isModerated;

    static public String serialize(ProcessedMessage processedMessage) throws JsonProcessingException {
        ObjectMapper writer = new ObjectMapper();
        return writer.writeValueAsString(processedMessage);
    }

    static public ProcessedMessage deserialize(String processedMessageSerialized) throws JsonProcessingException {
        ObjectMapper reader = new ObjectMapper();
        return reader.readValue(processedMessageSerialized, ProcessedMessage.class);
    }
}
