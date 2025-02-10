package com.github.tunashred.privatedtos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tunashred.dtos.MessageInfo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProcessedMessage {
    MessageInfo messageInfo;
    String processedMessage;
    boolean isCensored;

    static public String serialize(ProcessedMessage message) throws JsonProcessingException {
        ObjectMapper writer = new ObjectMapper();
        return writer.writeValueAsString(message);
    }

    static public ProcessedMessage deserialize(String messageSerialized) throws JsonProcessingException {
        ObjectMapper reader = new ObjectMapper();
        return reader.readValue(messageSerialized, ProcessedMessage.class);
    }
}
