package fr.edenmc.common.utils.messaging.list.packets;

import fr.edenmc.common.cache.rank.Rank;
import fr.edenmc.common.utils.messaging.pigdin.Packet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RankUpdatePacket implements Packet {

    private final Rank rank;
    private final boolean delete;

}
