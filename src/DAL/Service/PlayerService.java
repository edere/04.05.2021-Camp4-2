package DAL.Service;

import java.time.LocalDate;
import java.util.List;

import DAL.Abstract.PlayerDal;
import Entities.Player;

public class PlayerService implements PlayerDal{

	List<Player> players;
	
	public PlayerService() {
		this.players.add(new Player(1,"esra","dere",LocalDate.of(1993,4,1),"1111111111111111"));
	}
	
	@Override
	public List<Player> getAllPlayer() {
		return this.players;
	}

}
