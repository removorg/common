package fr.edenmc.common.utils.messaging.list.packets;

import fr.edenmc.common.cache.server.impl.CTFServer;
import fr.edenmc.common.utils.messaging.pigdin.Packet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CTFUpdatePacket implements Packet {

    private final CTFServer ctfServer;

}
