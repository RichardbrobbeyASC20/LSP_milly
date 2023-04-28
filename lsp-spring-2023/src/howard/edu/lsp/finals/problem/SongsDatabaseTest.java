package howard.edu.lsp.finals.problem;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class SongsDatabaseTest {
	@Test
	public void testaddSongs() {
		SongsDatabase me = new SongsDatabase();
		me.addSong("Pop", "Motivation");
		me.addSong("Pop", "Fair");
		me.addSong("R&B", "Waves");
		me.addSong("R&B", "Wild Side");
		me.addSong("Pop", "Dancing with a stranger");
		Set<String> pop_songs = me.getSongs("Pop");
		Set<String> rnb_songs = me.getSongs("R&B");
		
		assertTrue(pop_songs.contains("Motivation"));
		assertTrue(pop_songs.contains("Dancing with a stranger"));
		assertTrue(rnb_songs.contains("Waves"));
		assertFalse(pop_songs.contains("Wild Side"));
		assertFalse(rnb_songs.contains("Fair"));
		System.out.println(me.getSongs("Pop"));
		System.out.println(me.getSongs("R&B"));

	}
	@Test
	public void testGetSongs() {
		SongsDatabase me = new SongsDatabase();
		me.addSong("Rap", "Thriller");
		me.addSong("Pop", "Super Freaky Girl");
		me.addSong("Rap", "Gods Plan");
		
		Set<String> rap_songs  = me.getSongs("Rap");
		assertTrue(rap_songs.contains("Gods Plan"));
		assertTrue(rap_songs.contains("Thriller"));
		assertFalse(rap_songs.contains("Super Freaky Girl"));
	}
	
	@Test
	public void testGetGenre() {
		SongsDatabase me = new SongsDatabase();
		me.addSong("Rap", "SICKO MODE");
		me.addSong("R&B", "One in a million");
		assertEquals("Rap", me.getGenre("SICKO MODE"));
		assertEquals("R&B", me.getGenre("Waves"));
	}
}