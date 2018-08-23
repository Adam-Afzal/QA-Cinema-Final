package com.qa.persistence.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.stereotype.Component;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "genres" })

@Component
public class Genre {

    @JsonProperty("genres")
    private List<GenreInfo> GenreDetails;

    public Genre(List<GenreInfo> GenreDetails) {
        this.GenreDetails = GenreDetails;
    }

    public Genre() {

    }

    public void setGenreDetails(List<GenreInfo> GenreDetails) {
        this.GenreDetails = GenreDetails;
    }

    public List<GenreInfo> getGenreDetails() {
        return GenreDetails;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}