package mainpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.face.bo.PlayerBO;
import com.face.dao.PlayerDAO;
import com.face.dao.SkillDAO;
import com.face.utility.ConnectionManager;

public class Player {
	String player;
	String country;
	String skill;
	String team;
	Player(){
		
	}
	public Player(String player, String country, String skill, String team) {
		super();
		this.player = player;
		this.country = country;
		this.skill = skill;
		this.team = team;
	}
	ConnectionManager conn=new ConnectionManager();
	public void add() {
		// TODO Auto-generated method stub
		PlayerBO pbo=new PlayerBO();
		pbo.setPlayer(player);
		pbo.setCountry(country);
		pbo.setSkill(skill);
		pbo.setTeam(team);
		
		try {
			Skill s=new Skill(skill);
			Team t=new Team(team);
			int skillId=s.getSkillName(conn.getConnection());
			int teamId=t.getTeamId(conn.getConnection());
			PlayerDAO.createPlayer(conn.getConnection(),pbo,skillId,teamId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void list() {
		// TODO Auto-generated method stub
		//List<Player>
		try {
			PlayerDAO.getAllPlayerDetails(conn.getConnection());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void search() throws IOException {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the skill");
			String skillName=br.readLine();
			PlayerDAO.searchByTeam(conn.getConnection(),skillName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
