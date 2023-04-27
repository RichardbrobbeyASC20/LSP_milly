package howard.edu.lsp.finals.problem;
import java.util.*;

public class SongsDatabase {
	private HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
public void addSong(String genre, String title) {
	HashSet<String> songSet = map.get(genre);
	if(songSet == null) {
		songSet = new HashSet<String>();
		map.put(genre, songSet);
	}
	songSet.add(title);
}
public Set<String> getSongs(String genre) {
	HashSet<String> songSet = map.get(genre);
	if(songSet == null) {
		songSet = new HashSet<String>();
	}
	return songSet;
}
public String getGenre(String title) {
	for(String genre : map.keySet()) {
		HashSet<String> songSet = map.get(genre);
		if(songSet.contains(title)) {
			return genre;
		}
	}
	return null;
}
}