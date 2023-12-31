CREATE TABLE Client (
  id long AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(200) NOT NULL CHECK (LENGTH(name) >= 3 AND LENGTH(name) <= 200)
);

CREATE TABLE Planet (
  id VARCHAR(50) PRIMARY KEY,
  name VARCHAR(500) NOT NULL CHECK (LENGTH(name) >= 1 AND LENGTH(name) <= 500)
);

CREATE TABLE Ticket (
  id long AUTO_INCREMENT PRIMARY KEY,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
  client_id long,
  from_planet_id VARCHAR(50),
  to_planet_id VARCHAR(50),
  FOREIGN KEY (client_id) REFERENCES Client(id),
  FOREIGN KEY (from_planet_id) REFERENCES Planet(id),
  FOREIGN KEY (to_planet_id) REFERENCES Planet(id)
);