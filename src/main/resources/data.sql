insert into goal values(1, 'Weight Loss');
insert into goal values(2, 'Weight Loss');
insert into user ( id, dob, email, name, password, phone, profile_picture,bmi, height, payment_status,  weight, goal_id, dtype)
  values (1, sysdate(), 'arjunw7@gmail.com', 'Arjun', '1234', 98281881881,  '/profile.picture', 25.1, 67, 'Done', 123, 1, 'Member');
insert into user ( id, dob, email, name, password, phone, profile_picture,bmi, height, payment_status,  weight, goal_id, dtype)
  values (2, sysdate(), 'arjunw7@gmail.com', 'Arjun', '1234', 98281881881,  '/profile.picture', 25.1, 67, 'Done', 123, 1, 'Member');

