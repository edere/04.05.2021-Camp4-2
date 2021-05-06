package DAL.Service;

import java.util.List;

import DAL.Abstract.GameDal;
import Entities.Game;

public class GameService  implements GameDal{
	
	private List<Game> games; 
	
	public GameService() {
		
		this.games.add(new Game(2,"aaa",10));
		this.games.add(new Game(3,"ssss",20));
		this.games.add(new Game(4,"wrwrw",35));
		this.games.add(new Game(5,"sssdsfw",44));
		this.games.add(new Game(6,"wrwrw45454",50));
	}
	
	@Override
	public List<Game> getAllGame() {
		
		System.out.println("Listlendi.");
		return this.games;
	}

	@Override
	public void Add(Game game) {
	
		this.games.add(game);
		System.out.println("Eklendi.");
	}

	@Override
	public void Delete(int id) {
		System.out.println("Silindi.");
	}

	@Override
	public void Update(int id) {
		
		System.out.println("Güncellendi.");
	}

}
