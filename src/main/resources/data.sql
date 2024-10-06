insert into user_details(id, birth_date, name)
values(101, current_date(), 'Leon');
insert into user_details(id, birth_date, name)
values(104, current_date(), 'Thomas');
insert into user_details(id, birth_date, name)
values(103, current_date(), 'Joanna');

insert into post(id, description, user_id)
values(201,'I want to learn AWS', 103);
insert into post(id, description, user_id)
values(202,'I want to learn DevOps', 103);
insert into post(id, description, user_id)
values(203,'I want to learn cloud', 104);
insert into post(id, description, user_id)
values(204,'I want to learn stuff', 104);