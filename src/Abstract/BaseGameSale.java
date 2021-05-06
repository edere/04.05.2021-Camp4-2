package Abstract;

import DAL.Abstract.GameDal;
import Entities.Game;
import Entities.Player;

public class BaseGameSale implements GameService {

    private GameDal games;
	

	public BaseGameSale(GameDal games) {
		this.games = games;
	}

	@Override
	public void sale(Player player, Game game) {
		games.Delete(game.getId());
		System.out.println("Satýcýsý : "+ player.getFirstName() + " Oyuncusu : " + game.getName());
		
	}
}
