DROP TABLE example_users CASCADE CONSTRAINTS;
DROP TABLE example_roles CASCADE CONSTRAINTS;
DROP TABLE example_user_roles CASCADE CONSTRAINTS;


CREATE TABLE example_users (  
	user_name VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(25),
  address VARCHAR2(250)
);

CREATE TABLE example_roles (
  role VARCHAR2(15) PRIMARY KEY
);

CREATE TABLE example_user_roles (
  user_name VARCHAR2(15) NOT NULL,
  role_name VARCHAR2(15) NOT NULL,
  PRIMARY KEY(user_name, role_name),
  CONSTRAINT eur_name_fk FOREIGN KEY (user_name) REFERENCES example_users(user_name),
  CONSTRAINT eur_role_fk FOREIGN KEY (role_name) REFERENCES example_roles(role)
);

INSERT INTO example_users VALUES(
  'john.smith',
  'password123',
  'London'
);
INSERT INTO example_users VALUES(
  'jane.doe',
  'password123',
  'New York'
);

INSERT INTO example_roles VALUES(
  'basic_user'
);

INSERT INTO example_roles VALUES(
  'admin_user'
);

INSERT INTO example_user_roles (
  user_name,
  role_name
) VALUES (
  'john.smith',
  'basic_user'
);
INSERT INTO example_user_roles  (
  user_name,
  role_name
) VALUES (
  'jane.doe',
  'basic_user'
);
INSERT INTO example_user_roles (
  user_name,
  role_name
) VALUES (
  'jane.doe',
  'admin_user'
);
COMMIT;