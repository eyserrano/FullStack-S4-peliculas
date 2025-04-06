-- Creo la tabla de peliculas
CREATE TABLE PELICULAS (
  ID NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  TITULO VARCHAR2(100),
  ANIO NUMBER,
  DIRECTOR VARCHAR2(100),
  GENERO VARCHAR2(50),
  SINOPSIS VARCHAR2(1000)
);

-- select * from PELICULAS
-- Ahora inserto el contenido
INSERT INTO PELICULAS (TITULO, ANIO, DIRECTOR, GENERO, SINOPSIS) VALUES
('La Sustancia', 2024, 'Coralie Fargeat', 'Ciencia Ficción/Terror', 'Una estrella del aerobic que se ve en decadencia prueba un misterioso elixir que promete rejuvenecerla, con consecuencias inesperadas.');

INSERT INTO PELICULAS (TITULO, ANIO, DIRECTOR, GENERO, SINOPSIS) VALUES
('Matrix', 1999, 'Lana y Lilly Wachowski', 'Ciencia Ficción', 'Un informático descubre que la realidad que percibe es en realidad una simulación virtual creada por máquinas inteligentes.');

INSERT INTO PELICULAS (TITULO, ANIO, DIRECTOR, GENERO, SINOPSIS) VALUES
('Crepúsculo', 2008, 'Catherine Hardwicke', 'Romance/Fantasía', 'Una adolescente se muda a un pequeño pueblo y se enamora de quien resulta ser un vampiro.');

INSERT INTO PELICULAS (TITULO, ANIO, DIRECTOR, GENERO, SINOPSIS) VALUES
('Un hombre muerto caminando', 1995, 'Tim Robbins', 'Drama', 'Una monja establece una relación espiritual con un asesino (bajo sentencia de muerte) y lo acompaña en sus últimos días.');

INSERT INTO PELICULAS (TITULO, ANIO, DIRECTOR, GENERO, SINOPSIS) VALUES
('Cónclave', 2023, 'Edward Berger', 'Drama', 'Tras la muerte del Papa, se efectúa un cónclave lleno de intrigas y secretos.');

INSERT INTO PELICULAS (TITULO, ANIO, DIRECTOR, GENERO, SINOPSIS) VALUES
('Los puentes de Madison', 1995, 'Clint Eastwood', 'Drama/Romance', 'Un fotógrafo y una ama de casa viven un amor inesperado.');

INSERT INTO PELICULAS (TITULO, ANIO, DIRECTOR, GENERO, SINOPSIS) VALUES
('El Padrino', 1972, 'Francis Ford Coppola', 'Crimen/Drama', 'La saga de la familia Corleone, una poderosa familia de la mafia italoamericana y su lucha por mantener el poder en el mundo del crimen organizado.');

COMMIT;
