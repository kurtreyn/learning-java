# SQL Notes

- From the Mac terminal:
    - `sqlite3`
    - `sqlite3 <database_name>` - This opens the database
    - This starts the sqlite3 shell
    - To exit the shell: `.quit`
    - `.headers on` turns on the headers
    - `create table <table_name> (<column_name> <data_type>);`
      - Ex. `create table contacts (name text, phone integer, email text);`
    - `insert into <table_name> (<column_name>) values (<value>);` - Inserts a value into the table
      - Ex. `insert into contacts (name, phone, email) values ('Tim', 1234567890, 'tim@email.com');`
    - `select * from <table_name>;` - Selects all the data from the table
    - `select <column_name> from <table_name>;` - Selects the specified column from the table
      - Ex. `select name from contacts;`
    - `.backup <database_name>` - Creates a backup of the database
      - Ex. `.backup contacts_backup`
    - `.restore <database_name>` - Restores the database from the backup
      - Ex. `.restore contacts_backup`
    - `UPDATE <table_name> SET <column_name> = <value> WHERE <column_name> = <value>;` - Updates the specified column with the specified value where the specified column has the specified value
      - Ex. `UPDATE contacts SET email = 'steve@yaahoo.com' WHERE name = 'Steve';`
    - `DELETE FROM <table_name> WHERE <column_name> = <value>;` - Deletes the specified row from the table where the specified column has the specified value
      - Ex. `DELETE FROM contacts WHERE name = 'Steve';`
    - `.tables` - Lists all the tables in the database
    - `.schema <table_name>` - Shows the schema of the specified table
    - `.dump` - Shows the schema of all the tables in the database

Querying the database examples using music.db:
- `SELECT name FROM albums WHERE _id = 367;`
- `SELECT * FROM albums ORDER BY name;` - Orders the results by the specified column
- `SELECT * FROM albums ORDER BY name COLLATE NOCASE DESC;` - Orders the results by the specified column in descending order
- `SELECT songs.track, songs.title, albums.name FROM songs INNER JOIN albums ON songs.album = albums._id;` - Joins the songs table with the albums table on the album column