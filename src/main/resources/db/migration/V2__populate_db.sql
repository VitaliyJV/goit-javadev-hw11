INSERT INTO client (name)
VALUES
    ('Amarr Imp'),
  	('Gallant Feder'),
  	('Cald Rep'),
  	('Minmat Rep'),
  	('Jack Dou'),
  	('Moa Slow'),
    ('Ikitursa Poch'),
    ('Rodiva Supp'),
    ('Damavik Fast'),
    ('Don Fray');

INSERT INTO planet (id, name)
VALUES
  ('MERC1', 'Mercury'),
  ('VEN2', 'Venus'),
  ('EA3', 'Earth'),
  ('MAR4', 'Mars'),
  ('JUP5', 'Jupiter'),
  ('SAT6', 'Saturn'),
  ('UR7', 'Uranus'),
  ('NEPT8', 'Neptune'),
  ('PLUTOISPLANET9', 'Pluton');


INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id)
VALUES
  ('3023-07-28T13:02:10Z', 2, 'MERC1', 'VEN2'),
  ('3022-01-27T12:25:10Z', 1, 'VEN2', 'MERC1'),
  ('3033-02-26T11:20:10Z', 3, 'EA3', 'MAR4'),
  ('3025-04-25T10:45:10Z', 4, 'MAR4', 'EA3'),
  ('3021-09-24T10:10:10Z', 5, 'JUP5', 'SAT6'),
  ('3027-05-23T09:15:10Z', 6, 'SAT6', 'JUP5'),
  ('3029-06-22T08:50:10Z', 7, 'UR7', 'NEPT8'),
  ('3026-08-21T08:20:10Z', 8, 'NEPT8', 'UR7'),
  ('3020-03-20T07:30:10Z', 9, 'PLUTOISPLANET9', 'EA3');
