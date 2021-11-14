package dicer;

import java.util.LinkedList;
import java.util.List;

import contestants.trivial.*;
import contestants.m1ngxu.M1ngXU;
import contestants.tensor.TensorContestant;

public class GameMasterFactory {
	public static GameMaster get(Rules rules) {
		List<Contestant> contestants = new LinkedList<Contestant>();
		contestants.add(new TrivialContestant());
		contestants.add(new TensorContestant());
		contestants.add(new M1ngXU());
		return new GameMaster(rules, contestants);
	}
}
