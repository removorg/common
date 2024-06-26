package fr.edenmc.common.api;

import fr.edenmc.common.cache.rank.Rank;

import java.util.Queue;

public interface RankAPI {
	Queue<Rank> getRanks();

	Rank getRank(String token);

	void addRank(Rank rank);

	void removeRank(String token);
}
