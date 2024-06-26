package fr.edenmc.common.utils.messaging.list.subscribers;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.utils.messaging.list.packets.ReportUpdatePacket;
import fr.edenmc.common.utils.messaging.pigdin.IncomingPacketHandler;
import fr.edenmc.common.utils.messaging.pigdin.PacketListener;

public class ReportUpdateSubscriber implements PacketListener {

    @IncomingPacketHandler
    public void onReceive(ReportUpdatePacket packet) {
        CommonProvider.getInstance().getReports().removeIf(r -> r.getReportId().equals(packet.getReport().getReportId()));
        CommonProvider.getInstance().getReports().add(packet.getReport());
    }

}
