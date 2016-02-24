package simple.essentials.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class MessageManager {
	
	private static String messagePrefix = ChatColor.GRAY + "[" + ChatColor.DARK_AQUA + "InfoBot" + ChatColor.GRAY + "] " + ChatColor.RESET;
	
	public enum MsgType{
        WARNING(messagePrefix + ChatColor.RED),
        SENDMESSAGE(messagePrefix + ChatColor.GOLD),
        JOIN(ChatColor.GRAY + ""),
        NO_PERMS(messagePrefix + ChatColor.RED);
     
        private String prefix;
          
        MsgType(String prefix){
            this.prefix = prefix;
        }
     
        @Override
        public String toString(){
            return this.prefix;
        }    
    }
	
	public static void broadcastAEmptyLineOfText() {
		for (int i = 0; i < 44; i++) {
			Bukkit.broadcastMessage(" ");
		}
	}

}
