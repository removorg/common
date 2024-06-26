package fr.edenmc.common.utils.messaging.list.subscribers;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.utils.messaging.list.packets.ProfileUpdatePacket;
import fr.edenmc.common.utils.messaging.pigdin.IncomingPacketHandler;
import fr.edenmc.common.utils.messaging.pigdin.PacketListener;

public class ProfileUpdateSubscriber implements PacketListener {

    @IncomingPacketHandler
    public void onReceive(ProfileUpdatePacket packet) {
        CommonProvider.getInstance().players.put(packet.getUuid(), packet.getProfileData());
    }

}
