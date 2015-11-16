package pokerBase;
import org.apache.commons.math3.*;
import org.apache.commons.math3.util.CombinatoricsUtils;

import enums.eGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GamePlayPlayerHand {

	private GamePlay game = null;
	private Player player = null;
	private Hand hand = null;
	
	private Player WinningPlayer = null;
	
	public GamePlayPlayerHand() {
	
	}

	public GamePlay getGame() {
		return game;
	}

	public void setGame(GamePlay game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void addCardToHand( Card c)
	{
		getHand().AddCardToHand(c);
	}
	
	public Player getWinningPlayer() {
		return WinningPlayer;
	}

	public void setWinningPlayer(Player winningPlayer) {
		WinningPlayer = winningPlayer;
	}
	/*public static ArrayList<int[]> TotalHands(ArrayList<Card> cards, Rule rle, int[] list){
		int n = cards.size();
		int k = rle.GetNumberOfCards();
		Iterator<int[]> hand_indices = CombinatoricsUtils.combinationsIterator(n,k);
		return ;
			}

	public static ArrayList<String[]> combinations(String[] arr, int len, int startPosition, String[] result){
		ArrayList<String[]> possible_orders = new ArrayList<String[]>();
			if (len == 0){
            possible_orders.add(result);
        }       
        for (int i = startPosition; i <= arr.length-len; i++){
            result[result.length - len] = arr[i];
            combinations(arr, len-1, i+1, result);
        }
		return possible_orders;
    }
	
	public static void main(String[] args){
		String[] arr = {"1","2","3","4","5","6","7"};
		System.out.println(combinations(arr,5,0, new String[5]));
	}*/
}	
