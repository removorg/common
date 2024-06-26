package fr.edenmc.common.utils.messaging.list.packets;

import fr.edenmc.common.cache.server.impl.UHCServer;
import fr.edenmc.common.utils.messaging.pigdin.Packet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UHCUpdatePacket implements Packet {

    private final UHCServer uhcServer;

}
