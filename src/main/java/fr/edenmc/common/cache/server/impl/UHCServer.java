package fr.edenmc.common.cache.server.impl;

import fr.edenmc.common.cache.server.IServer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class UHCServer implements IServer {

    private final int port;
    private final ServerType type;
    private final String customName;

    private final String host;
    private final int slots;
    private final ServerStatus status;
    private final int players;
    private final int teamSize;
    private final int borderStartSize;
    private final int borderEndSize;
    private final int pvpTimer;
    private final int borderTimer;
    private final List<String> enabledScenarios;
    private final List<UUID> uuids;
    private final List<UUID> whitelistedPlayers;

    @Override
    public boolean isWhitelisted() {
        return status == ServerStatus.FULL || status == ServerStatus.CLOSED;
    }

    @Override
    public fr.edenmc.common.cache.server.ServerType type() {
        return fr.edenmc.common.cache.server.ServerType.UHC;
    }

    @Getter
    @RequiredArgsConstructor
    public enum ServerStatus {
        FULL("&cFull"),
        CLOSED("&cWhitelist"),
        OPENED("&aOuvert"),
        PLAYING("&6En Jeu");

        private final String name;
    }

    @Getter
    @RequiredArgsConstructor
    public enum ServerType {
        MHA("MHA"),
        MUGIWARA("Mugiwara");

        private final String name;
    }


}
