package fr.edenmc.common.utils.messaging.list.subscribers;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.utils.messaging.list.packets.UHCUpdatePacket;
import fr.edenmc.common.utils.messaging.pigdin.IncomingPacketHandler;
import fr.edenmc.common.utils.messaging.pigdin.PacketListener;

public class UHCUpdateSubscriber implements PacketListener {

    @IncomingPacketHandler
    public void onReceive(UHCUpdatePacket packet) {
        CommonProvider.getInstance().getServerCache().updateUhcServer(packet.getUhcServer());
    }

}
