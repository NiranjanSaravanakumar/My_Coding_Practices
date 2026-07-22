CREATE TABLE Dogs(
    dog_id INT primary key,
    name varchar(50) unique,
        breed varchar(50) check (breed IN ('Beagle','Labrador','Poodle','Shih Tzu')),
    age check(age  >= 1),
    weight_kg iNt
);

insert into Dogs(dog_id,name,breed,age,weight_kg) values(1,'Buddy','Labrador',3,30.5),
(2,'Lucy','Poodle',5,6.8),
(3,'Max','Beagle',2,11.2)
;