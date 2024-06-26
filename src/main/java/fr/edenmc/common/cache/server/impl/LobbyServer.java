package fr.edenmc.common.cache.server.impl;

import fr.edenmc.common.cache.server.ServerType;
import fr.edenmc.common.cache.server.IServer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@Getter
@RequiredArgsConstructor
public class LobbyServer implements IServer {

    private final int port;

    private final boolean restricted;
    private final int players;
    private final HashMap<String, Integer> ranks;

    @Override
    public boolean isWhitelisted() {
        return false;
    }

    @Override
    public ServerType type() {
        return ServerType.Lobby;
    }
}
