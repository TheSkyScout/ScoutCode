
import de.theskyscout.lobbysystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TablistManager {

    public static void setTablist(Player p) {
        //here u can write what u want
        p.setPlayerListHeaderFooter("§8───────────────"+"\n §9§lText" + "\n" +  "\n §8───────────────", "§8───────────────" + "\n§7Made by §aTheSkyScout" + "\n§8───────────────");
    }

  
    public static void setPlayerTeams(Player p) {
        Scoreboard sb = p.getScoreboard();
      // add ur own teams
        Team test = sb.getTeam("atest");

        if(test == null) test = sb.registerNewTeam("atest");
      
        test.setPrefix("§Test §8| §a");
        test.setColor(ChatColor.GREEN);

        if(p.hasPermission("lobby.test")) {
            test.addEntry(p.getName());
        }
  
    public static void setAllPlayerTeams() {
        for(Player all :Bukkit.getOnlinePlayers()) {
            setPlayerTeams(all);
        }
    }
  
    //set this in ur main
    public static void updateTablist() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {

            @Override
            public void run() {
                setAllPlayerTeams();
                for(Player all : Bukkit.getOnlinePlayers()) {
                    setTablist(all);
                }

            }

        }, 0, 20);
    }

}

