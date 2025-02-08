package com.github.tunashred.messageformats;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class MessageInfo {
    GroupChat groupChat;
    User user;
    String message;
}
