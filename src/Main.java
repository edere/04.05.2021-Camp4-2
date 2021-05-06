import java.awt.List;

import Adapters.MernisServiceAdapter;
import Concrete.GameSalesManager;
import DAL.Service.GameService;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
	   GameSalesManager gameSaleManager = new GameSalesManager(new GameService(),new MernisServiceAdapter());
		
	   GameService gameList = new GameService();
		var games = gameList.getAllGame();
		
		System.out.println(games);
		
	}

}
