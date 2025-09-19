
CREATE TABLE dbconstant
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NOT NULL,
    updatedat  datetime              NOT NULL,
    name       VARCHAR(255)          NOT NULL,
    value      VARCHAR(255)          NULL,
    CONSTRAINT pk_dbconstant PRIMARY KEY (id)
);

Alter TABLE dbconstant
add constraint uc_dbconstant_name UNIQUE (name);