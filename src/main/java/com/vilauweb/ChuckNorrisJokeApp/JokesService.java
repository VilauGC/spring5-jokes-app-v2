package com.vilauweb.ChuckNorrisJokeApp;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesService {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public String getJokes(){
        return quotes.getRandomQuote();
    }

}
