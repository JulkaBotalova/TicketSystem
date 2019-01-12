
insert into bus (bus_id, bus_name, bus_number_of_empty_seats)
values (1, 'Man', 60);

insert into bus (bus_id, bus_name, bus_number_of_empty_seats)
values (2, 'Mersedes', 55);

insert into bus (bus_id, bus_name, bus_number_of_empty_seats)
values (3, 'Volvo', 70);

insert into bus (bus_id, bus_name, bus_number_of_empty_seats)
values (4, 'Dav', 60);

---

insert into direction (direction_id, direction_name, direction_bus_id)
values (1,'Пермь-Казань', 1 );


insert into direction (direction_id, direction_name, direction_bus_id)
values (2,'Пермь-Уфа', 2 );


insert into direction (direction_id, direction_name, direction_bus_id)
values (3,'Пермь-Москва', 3 );


insert into direction (direction_id, direction_name, direction_bus_id)
values (4,'Казань-Пермь', 1);


insert into direction (direction_id, direction_name, direction_bus_id)
values (5,'Уфа-Пермь', 2 );


insert into direction (direction_id, direction_name, direction_bus_id)
values (6,'Москва-Пермь', 3);

delete from ticket (ticket_id, ticket_fio, ticket_date, ticket_number, ticket_direction_id)
values (1,'Иванов Иван Иванович', '15/01/2019',60, 1);

---
