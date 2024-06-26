package fr.edenmc.common.cache.server;


public interface IServer {

    boolean isWhitelisted();

    ServerType type();

}
