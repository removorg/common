package fr.edenmc.common.utils.messaging.list.packets;

import fr.edenmc.common.cache.data.Report;
import fr.edenmc.common.utils.messaging.pigdin.Packet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ReportUpdatePacket implements Packet {

    private final Report report;

}
