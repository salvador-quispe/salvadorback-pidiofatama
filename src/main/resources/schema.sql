CREATE TABLE IF NOT EXISTS PERSONAS (
    ID       BIGINT AUTO_INCREMENT PRIMARY KEY,
    NOMBRE   VARCHAR(50) NOT NULL,
    APELLIDO VARCHAR(50) NOT NULL,
    EMAIL    VARCHAR(80) NOT NULL
);

INSERT INTO PERSONAS (NOMBRE, APELLIDO, EMAIL) VALUES
    ('Isael',  'Salvador',  'isael@example.com'),
    ('Juan',   'Perez',     'juan.perez@example.com'),
    ('Maria',  'Gomez',     'maria.gomez@example.com'),
    ('Carlos', 'Lopez',     'carlos.lopez@example.com'),
    ('Ana',    'Martinez',  'ana.martinez@example.com'),
    ('Luis',   'Fernandez', 'luis.fernandez@example.com'),
    ('Elena',  'Torres',    'elena.torres@example.com'),
    ('Miguel', 'Ramirez',   'miguel.ramirez@example.com');
