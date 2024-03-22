create table if not exists student_groups
(
    id bigint generated always as identity
        constraint student_groups_pk
            primary key,
    name
       varchar(100)
);

create table if not exists students
(
    id
                  bigint generated always as identity
        constraint
            students_pk
            primary
                key,
    name
                  varchar(100) not null,
    student_group bigint
        constraint students_student_groups_id_fk
            references student_groups
);


INSERT INTO student_groups (name)
VALUES ('smart boys');
INSERT INTO student_groups (name)
VALUES ('silly boys');
INSERT INTO student_groups (name)
VALUES ('smart girls');
INSERT INTO student_groups (name)
VALUES ('beauty girls');


INSERT INTO students (name, student_group)
VALUES ('Garry Potter', 1);
INSERT INTO students (name, student_group)
VALUES ('Ron Wissly', 2);
INSERT INTO students (name, student_group)
VALUES ('Kailo Ren', 1);
INSERT INTO students (name, student_group)
VALUES ('Rey', 4);
INSERT INTO students (name, student_group)
VALUES ('Beyonce', 4);


