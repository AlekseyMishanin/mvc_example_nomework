DROP TABLE IF EXISTS license;
CREATE TABLE license (id bigserial, name varchar(255), device_count int, duration int);
INSERT INTO license (name, device_count, duration) VALUES
('STANDARD', 1, 180),
('PERSONAL', 3, 90),
('UNIQUE', 6, 360);