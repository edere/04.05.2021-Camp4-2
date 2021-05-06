package Concrete;

import Abstract.BaseGameSale;
import Abstract.PlayerService;
import DAL.Abstract.GameDal;
import Entities.Game;
import Entities.Player;

public class GameSalesManager extends BaseGameSale{


	private PlayerService playerService;
	
	public GameSalesManager(GameDal games, PlayerService playerService) {
		super(games);
		this.playerService = playerService;
	}

     public void sale(Player player, Game game) {
		
		if(playerService.CheckIfRealPerson(player)) {
			super.sale(player,game);
		}
		else {
			throw new RuntimeException("	Kiþi  Bulunamadý..............");
		}
		
		
	}
}
