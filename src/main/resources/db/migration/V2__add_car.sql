CREATE TABLE car
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    created_at   datetime              NOT NULL,
    updatedat    datetime              NOT NULL,
    plate_number VARCHAR(255)          NOT NULL,
    brand        VARCHAR(255)          NULL,
    color_id     BIGINT                NULL,
    model        VARCHAR(255)          NULL,
    car_type     ENUM('XL','SUV','COMPACT_SUV','HATCHBACK')        NULL,
    driver_id    BIGINT                NULL,
    CONSTRAINT pk_car PRIMARY KEY (id)
);

CREATE TABLE color
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NOT NULL,
    updatedat  datetime              NOT NULL,
    name       VARCHAR(255)          NOT NULL,
    CONSTRAINT pk_color PRIMARY KEY (id)
);

ALTER TABLE car
    ADD CONSTRAINT uc_car_platenumber UNIQUE (plate_number);

ALTER TABLE color
    ADD CONSTRAINT uc_color_name UNIQUE (name);

ALTER TABLE car
    ADD CONSTRAINT FK_CAR_ON_COLOR FOREIGN KEY (color_id) REFERENCES color (id);

ALTER TABLE car
    ADD CONSTRAINT FK_CAR_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

