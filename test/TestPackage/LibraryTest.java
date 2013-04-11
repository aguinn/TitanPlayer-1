/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import com.tdd.bll.Playlist;
import com.tdd.bll.Song;
import com.tdd.bll.Library;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class LibraryTest {
    Library myLibrary = new Library();
    public LibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of emptyLibraryTest method, of class Library.
     */
    @Test
    public void EmptyLibraryTest() {
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.songCount());
    }

    @Test
    public void AddSongTest() {
        myLibrary.addSong(new Song("Alone", "Tech N9ne"));
        myLibrary.addSong(new Song("Words I Never Said", "Lupe Fiasco"));
        assertEquals(2, myLibrary.songCount());
    }

    @Test
    public void RemoveSongTest() {     
        AddSongTest();
        myLibrary.removeSong(1);
        assertEquals(1, myLibrary.songCount());
        myLibrary.SongsLeft();
    }
    
    @Test
    public void CreatePlaylist() {
        myLibrary.addPlaylist(new Playlist("Slow Jamz"));
        assertEquals(1, myLibrary.playlistCount());
    }
}