package com.company.cinema.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "SCREEN", indexes = {
        @Index(name = "IDX_SCREEN_MOVIE", columnList = "MOVIE_ID")
})
@Entity
public class Screen {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "MOVIE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "TOTAL_SEATS")
    private Integer totalSeats;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}