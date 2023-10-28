package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    @Test
    public void testShouldAddNewFilms() {       //тест метода добавления нового фильма
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        String[] expected = { "Film 1" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testShouldAddNoMovie() {       //тест на добавление ни одного фильма
        MovieManager manager = new MovieManager();


        String[] expected = {  };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testShouldAddAFewNewFilms() {       //тест метода добавления нескольких фильмов
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        String[] expected = { "Film 1", "Film 2","Film 3" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void testShouldAddLustFilms() {       //тест метода добавления последнего фильмов
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        String[] expected = { "Film 3", "Film 2","Film 1" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);

    }



}