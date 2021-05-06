package DAL.Abstract;

import java.util.List;

import Entities.Game;

public interface GameDal {
	
	public List<Game> getAllGame(); 
	public void Add(Game game);
	public void Delete(int id);
	public void Update(int id);

}
