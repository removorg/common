package fr.edenmc.common.api;

import fr.edenmc.common.CommonProvider;
import fr.edenmc.common.cache.server.ServerCache;
import fr.edenmc.common.utils.messaging.Pidgin;

import java.util.UUID;

public interface CommonAPI extends ProfileAPI, RankAPI, PunishmentAPI, ReportAPI, WarnAPI, GrantAPI {
	void deleteAllDataFromAPlayer(UUID uuid);

	ServerCache getServerCache();

	Pidgin getMessaging();

	static CommonAPI create() {
		return new CommonProvider();
	}
}
