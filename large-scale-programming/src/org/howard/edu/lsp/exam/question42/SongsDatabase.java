package org.howard.edu.lsp.exam.question42;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


/**
 * Program to keep track of song titles by classifying them according to genre
 * @author bria
 *
 */
public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
				
	/**
	 * Adds a song title to a genre
	 * @param genre an overall genre
	 * @param songTitle the title of a song
	 */
	public void addSong(String genre, String songTitle) {
        Set<String> song = map.getOrDefault(genre,new HashSet<String>());
        song.add(songTitle);
        map.put(genre, song);
	}
   
   
	/**
	 * Returns the set that contains all songs for a genre
	 * @param genre an overall genre 
	 * @return a hashset
	 */
	public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<String>());
	}

	/**
	 * Return genre given a song title
	 * @param songTitle the title of a song
	 * @return the genre
	 */
	public String getGenreOfSong(String songTitle) {
		String genre_result = "";
		
		for(String genre: map.keySet()) {
			if (map.get(genre).contains(songTitle)) {
				genre_result = "";
				break;
			}
		}
		return genre_result;		
	}


}


