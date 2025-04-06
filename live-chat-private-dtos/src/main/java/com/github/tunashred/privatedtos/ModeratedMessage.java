package com.github.tunashred.privatedtos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ModeratedMessage {
    String originalMessage;
    String moderatedMessage;

    static public String serialize(ModeratedMessage message) throws JsonProcessingException {
        ObjectMapper writer = new ObjectMapper();
        return writer.writeValueAsString(message);
    }

    static public ModeratedMessage deserialize(String messageSerialized) throws JsonProcessingException {
        ObjectMapper reader = new ObjectMapper();
        return reader.readValue(messageSerialized, ModeratedMessage.class);
    }
}
