CREATE TYPE Category AS ENUM ('FRUIT', 'VEGETABLE', 'GRAIN', 'NUT');
CREATE TYPE Month AS ENUM ('JANUARY', 'FEBRUARY', 'MARCH', 'APRIL', 'MAY', 'JUNE', 'JULY',
'AUGUST', 'SEPTEMBER', 'OCTOBER', 'NOVEMBER', 'DECEMBER');

CREATE TABLE Produce (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    category Category,
    months Month[]
);

INSERT INTO Produce (name, category, months ) VALUES
    ('Apple', 'FRUIT'::Category, ARRAY['JANUARY', 'FEBRUARY', 'MARCH']::Month[]),
    ('Banana', 'FRUIT'::Category, ARRAY['APRIL', 'MAY', 'JUNE']::Month[]),
    ('Carrot', 'VEGETABLE'::Category, ARRAY['JULY', 'AUGUST', 'SEPTEMBER']::Month[]),
    ('Broccoli', 'VEGETABLE'::Category, ARRAY['OCTOBER', 'NOVEMBER', 'DECEMBER']::Month[]),
    ('Wheat', 'GRAIN'::Category, ARRAY['AUGUST', 'SEPTEMBER']::Month[]),
    ('Hazelnut', 'NUT'::Category, ARRAY['OCTOBER']::Month[]);