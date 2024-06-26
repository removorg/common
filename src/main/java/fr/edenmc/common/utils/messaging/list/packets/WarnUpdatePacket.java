package fr.edenmc.common.utils.messaging.list.packets;

import fr.edenmc.common.cache.data.Warn;
import fr.edenmc.common.utils.messaging.pigdin.Packet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class WarnUpdatePacket implements Packet {

    private final Warn warn;

}
