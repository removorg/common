package fr.edenmc.common.api;

import fr.edenmc.common.cache.data.ProfileData;

import java.util.UUID;

public interface ProfileAPI {
	ProfileData getProfile(UUID uuid);

	void saveProfile(UUID uuid, ProfileData data);
}
