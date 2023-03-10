package org.home;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() throws MalformedURLException {
        movie = new Movie();
        movie.setTitle("Lord of the Rings");
        movie.setCountry("IRAN");
        movie.setOfficialSite(new URL("https://localhost"));
        movie.setLanguage("persian");
        movie.setId(1L);
        movie.setDescription("This film all about Rings");
        movie.setRating(8);

    }

    @Test
    void getId() {
        assertNotNull(movie);
        assertEquals(1L, movie.getId());
    }

    @Test
    void setId() {
        assertNotNull(movie);
        movie.setId(2L);
        assertEquals(2L, movie.getId());
    }

    @Test
    void getTitle() {
        assertNotNull(movie);
        assertEquals("Lord of the Rings", movie.getTitle());
    }

    @Test
    void setTitle() {
        assertNotNull(movie);
        movie.setTitle("Title Lord of the Rings");
        assertEquals("Title Lord of the Rings", movie.getTitle());
    }

    @Test
    void getDescription() {
        assertNotNull(movie);
        assertEquals("This film all about Rings", movie.getDescription());
    }

    @Test
    void setDescription() {
        assertNotNull(movie);
        movie.setDescription("Description This film all about Rings");
        assertEquals("Description This film all about Rings", movie.getDescription());
    }

    @Test
    void getCountry() {
        assertNotNull(movie);
        assertEquals("IRAN", movie.getCountry());
    }

    @Test
    void setCountry() {
        assertNotNull(movie);
        movie.setCountry("IR");
        assertEquals("IR", movie.getCountry());
    }

    @Test
    void getRating() {
        assertNotNull(movie);
        assertEquals(8, movie.getRating());
    }

    @Test
    void setRating() {
        assertNotNull(movie);
        movie.setRating(3);
        assertEquals(3, movie.getRating());
    }

    @Test
    void getOfficialSite() throws MalformedURLException {
        assertNotNull(movie);
        assertEquals(new URL("https://localhost"), movie.getOfficialSite());
    }

    @Test
    void setOfficialSite() throws MalformedURLException {
        assertNotNull(movie);
        movie.setOfficialSite(new URL("https://localhost/film"));
        assertEquals(new URL("https://localhost/film"), movie.getOfficialSite());
    }

    @Test
    void getLanguage() {
        assertNotNull(movie);
        assertEquals("persian", movie.getLanguage());
    }

    @Test
    void setLanguage() {
        assertNotNull(movie);
        movie.setLanguage("FA");
        assertEquals("FA", movie.getLanguage());
    }
}