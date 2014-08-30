package deep.zero.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 玩家级别类：
 * 此类用以描述玩家在各个游戏中的级别信息
 * 每一个玩家可以有多个游戏，如A B C D四个游戏，对于每个游戏都有一个级别，
 * 因此这里所说的级别是指一个玩家在某个游戏中的级别，此对象同玩家及游戏对象
 * 有关联，可以用此类表示
 * 
 */
@Entity
@Table(name="p_playerLevel")
public class PlayerLevel {
	@Id
	private Long id;
	//玩家
	private Player plr;
	//游戏
	private Game	game;
	//级别
	private int level;
	
}
