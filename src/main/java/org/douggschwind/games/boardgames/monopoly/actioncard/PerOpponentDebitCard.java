package org.douggschwind.games.boardgames.monopoly.actioncard;

import org.douggschwind.games.boardgames.monopoly.Monopoly;
import org.douggschwind.games.boardgames.monopoly.Player;

/**
 * An instance of this class represents an amount that is known a priori,
 * that the Player must pay to each opponent.
 * @author Doug Gschwind
 */
public class PerOpponentDebitCard extends AbstractDebitCard {
	public PerOpponentDebitCard(String cardName, int amount) {
		super(cardName, amount);
	}
	
	@Override
	public final void takeAction(Monopoly gameInProgress, Player player, int playerDiceRollTotal) {
		gameInProgress.playerPaysToEachOpponent(player, getAmount());
	}
}