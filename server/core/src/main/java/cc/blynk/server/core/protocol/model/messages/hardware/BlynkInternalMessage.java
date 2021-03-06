package cc.blynk.server.core.protocol.model.messages.hardware;

import cc.blynk.server.core.protocol.model.messages.StringMessage;

import static cc.blynk.server.core.protocol.enums.Command.BLYNK_INTERNAL;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class BlynkInternalMessage extends StringMessage {

    public BlynkInternalMessage(int messageId, String body) {
        super(messageId, BLYNK_INTERNAL, body.length(), body);
    }

    @Override
    public String toString() {
        return "BlynkInternalMessage{" + super.toString() + "}";
    }
}
