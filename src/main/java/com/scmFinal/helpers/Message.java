package com.scmFinal.helpers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Message {

    private String content;
    @Builder.Default
    // message type is a enum used
    private MessageType type = MessageType.blue;

}
