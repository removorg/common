package fr.edenmc.common.api;

import fr.edenmc.common.cache.data.PunishmentData;

import java.util.List;
import java.util.Queue;
import java.util.UUID;

public interface PunishmentAPI {
    Queue<PunishmentData> getPunishments();

    List<PunishmentData> getPunishments(UUID uuid);

    void updatePunishment(PunishmentData punishmentData);

    void deletePunishment(PunishmentData punishmentData);
}
