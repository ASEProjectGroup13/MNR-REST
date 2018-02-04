# MNR-REST

1. Create database mnr with the below command: `CREATE DATABASE mnr character set utf8mb4 collate utf8mb4_unicode_ci;`
2. Run the command: `mvn clean install`.
3. Set password free for mnr database using the command: `set password for 'root'@'localhost' ='';`
4. Run command `mvn flyway:migrate` and this command will create tables in the mnr database.
