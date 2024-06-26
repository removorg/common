package fr.edenmc.common.utils.messaging.list.subscribers;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.utils.messaging.list.packets.CTFUpdatePacket;
import fr.edenmc.common.utils.messaging.pigdin.IncomingPacketHandler;
import fr.edenmc.common.utils.messaging.pigdin.PacketListener;

public class CTFUpdateSubscriber implements PacketListener {

    @IncomingPacketHandler
    public void onReceive(CTFUpdatePacket packet) {
        CommonProvider.getInstance().getServerCache().updateCTFServer(packet.getCtfServer());
    }

}
