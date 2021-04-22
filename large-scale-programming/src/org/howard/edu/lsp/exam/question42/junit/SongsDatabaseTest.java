package org.howard.edu.lsp.exam.question42.junit;
import org.howard.edu.lsp.exam.question42.SongsDatabase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Set;

/**
 * Tests the songs database
 * @author bria
 *
 */
class SongsDatabaseTest {

	@Test
	@DisplayName("Tests adding a song to a genre")
	void testAddSong() {
		
		SongsDatabase database = new SongsDatabase();
		database.addSong("Rap", "Savage");
		database.addSong("Rap", "Gin and Juice");
		database.addSong("Jazz", "Always There");
		
		System.out.println(database);
	}
	
	@Test
	@DisplayName("Tests fetching all songs of a certain genre")
	void testGetSong() {
		
		SongsDatabase database2 = new SongsDatabase();
		database2.addSong("Pop", "Havana");
		database2.addSong("Rap", "Lucid Dreams");
		database2.addSong("Pop", "Perfect");
		database2.addSong("R&B", "Needed Me");
		database2.addSong("Pop", "Photograph");
		database2.addSong("Rap", "Fight the Power");
		
		Set<String> songs = database2.getSongs("Pop");
		Set<String> songs2 = database2.getSongs("Rap");
		System.out.println(songs);
		System.out.println(songs2);
	}
	
	@Test
	@DisplayName("Tests returning genre given a song title")
	void testGetGenre() {
		
		SongsDatabase database3 = new SongsDatabase();
		database3.addSong("R&B", "Don't");
		database3.addSong("Jazz", "What a Wonderful World");
		database3.addSong("R&B", "Peaches");
		database3.addSong("Jazz", "Blue in Green");
		
		System.out.println(database3.getGenreOfSong("Blue in Green"));
		System.out.println(database3.getGenreOfSong("Peaches"));
	}

}
