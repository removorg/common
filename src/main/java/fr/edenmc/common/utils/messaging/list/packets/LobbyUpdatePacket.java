package fr.edenmc.common.utils.messaging.list.packets;

import fr.edenmc.common.cache.server.impl.LobbyServer;
import fr.edenmc.common.utils.messaging.pigdin.Packet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LobbyUpdatePacket implements Packet {

    private final LobbyServer lobbyServer;

}
