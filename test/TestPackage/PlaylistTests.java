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
public class PlaylistTests {
    Library myLibrary = new Library();
    public PlaylistTests() {
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
    public void CreatePlaylist() {
        myLibrary.addPlaylist(new Playlist("Slow Jamz"));
        assertEquals(1, myLibrary.playlistCount());
    }
}