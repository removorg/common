package fr.edenmc.common.utils.messaging.list.subscribers;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.utils.messaging.list.packets.PunishmentUpdatePacket;
import fr.edenmc.common.utils.messaging.pigdin.IncomingPacketHandler;
import fr.edenmc.common.utils.messaging.pigdin.PacketListener;

public class PunishmentUpdateSubscriber implements PacketListener {

    @IncomingPacketHandler
    public void onReceive(PunishmentUpdatePacket packet) {
        CommonProvider.getInstance().punishments.removeIf(pd -> pd.getPunishmentId().equals(packet.getPunishmentData().getPunishmentId()));

        if (!packet.isDelete())
            CommonProvider.getInstance().punishments.add(packet.getPunishmentData());
    }

}
