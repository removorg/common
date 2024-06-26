package fr.edenmc.common.utils.messaging.list.subscribers;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.utils.messaging.list.packets.LobbyUpdatePacket;
import fr.edenmc.common.utils.messaging.pigdin.IncomingPacketHandler;
import fr.edenmc.common.utils.messaging.pigdin.PacketListener;

public class LobbyUpdateSubscriber implements PacketListener {

    @IncomingPacketHandler
    public void onReceive(LobbyUpdatePacket packet) {
        CommonProvider.getInstance().getServerCache().updateLobbyServer(packet.getLobbyServer());
    }

}
