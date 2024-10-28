package com.company.cinema.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "SEAT", indexes = {
        @Index(name = "IDX_SEAT_SCREEN", columnList = "SCREEN_ID")
})
@Entity
public class Seat {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "SCREEN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Screen screen;

    @Column(name = "SEAT_NUMBER")
    private String seatNumber;

    @Column(name = "SEAT_TYPE")
    private String seatType;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
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