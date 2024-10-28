package com.company.cinema.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "BOOKING", indexes = {
        @Index(name = "IDX_BOOKING_CUSTOMER", columnList = "CUSTOMER_ID"),
        @Index(name = "IDX_BOOKING_SEAT", columnList = "SEAT_ID"),
        @Index(name = "IDX_BOOKING_SCREEN", columnList = "SCREEN_ID"),
        @Index(name = "IDX_BOOKING_MOVIE", columnList = "MOVIE_ID")
})
@Entity
public class Booking {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @JoinColumn(name = "SEAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Seat seat;

    @JoinColumn(name = "SCREEN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Screen screen;

    @JoinColumn(name = "MOVIE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;

    @Column(name = "MOVIE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movieTime;

    @Column(name = "PAYMENT_STATUS")
    private String paymentStatus;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(Date movieTime) {
        this.movieTime = movieTime;
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