package Parking;

import java.time.LocalDateTime;

enum VihcleType {
    CAR,
    MOTORCYCEL
}

public class Vehicle {
    private String id;
    private VihcleType type;
    private LocalDateTime enterTime = LocalDateTime.now();

    public Vehicle(String id, VihcleType type) {
        this.id=id;
        this.type=type;
    }

    public String getId() {
        return id;
    }


    public VihcleType getType() {
        return type;
    }

    public void setType(VihcleType type) {
        this.type = type;
    }

    public LocalDateTime getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(LocalDateTime enterTime) {
        this.enterTime = enterTime;
    }
}



