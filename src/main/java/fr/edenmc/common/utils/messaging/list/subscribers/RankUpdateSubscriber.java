package fr.edenmc.common.utils.messaging.list.subscribers;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.utils.messaging.list.packets.RankUpdatePacket;
import fr.edenmc.common.utils.messaging.pigdin.IncomingPacketHandler;
import fr.edenmc.common.utils.messaging.pigdin.PacketListener;

public class RankUpdateSubscriber implements PacketListener {

    @IncomingPacketHandler
    public void onReceive(RankUpdatePacket packet) {
        CommonProvider.getInstance().ranks.removeIf(rank -> rank.getToken().equals(packet.getRank().getToken()));

        if(!packet.isDelete())
            CommonProvider.getInstance().ranks.add(packet.getRank());
    }

}
