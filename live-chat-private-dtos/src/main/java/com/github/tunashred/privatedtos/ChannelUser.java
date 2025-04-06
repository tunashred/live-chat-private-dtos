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
public class ChannelUser {
    String channelName;
    String username;

    static public String serialize(ChannelUser channelUser) throws JsonProcessingException {
        ObjectMapper writer = new ObjectMapper();
        return writer.writeValueAsString(channelUser);
    }

    static public ChannelUser deserialize(String channelUserSerialized) throws JsonProcessingException {
        ObjectMapper reader = new ObjectMapper();
        return reader.readValue(channelUserSerialized, ChannelUser.class);
    }
}
