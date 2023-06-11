DROP DATABASE bankapp;
CREATE DATABASE bankapp;
USE bankapp;

CREATE TABLE user(
	userid INT(4) NOT NULL DEFAULT 0,
    username VARCHAR(12) NOT NULL,
    password_ VARCHAR(10) NOT NULL,
    name_ VARCHAR(25) NOT NULL,
    surname VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL,
    phone VARCHAR(12) NOT NULL,
    PRIMARY KEY(username)
);

CREATE TABLE bank(
	city VARCHAR(12) NOT NULL,
    bank VARCHAR(20) NOT NULL,
    location VARCHAR(100) NOT NULL,
    email VARCHAR(30) NOT NULL,
    phone VARCHAR(12) NOT NULL,
    fax VARCHAR(12) NOT NULL,
    news TEXT NULL,
    PRIMARY KEY(bank,location,city)
);

CREATE TABLE appointment(
	appointmentid INT(4) NOT NULL DEFAULT 0,
	username VARCHAR(12) NOT NULL,
	city VARCHAR(12) NOT NULL,
    bank VARCHAR(20) NOT NULL,
    location VARCHAR(100) NOT NULL,
    day_ VARCHAR(100) NOT NULL,
    hour_ VARCHAR(20) NOT NULL,
    type_ VARCHAR(30) NOT NULL,
    note TEXT NULL,
    status_ ENUM ('CANCELED','COMPLETED','SCHEDULED') DEFAULT 'SCHEDULED',
    PRIMARY KEY(username,bank,location,city,day_,hour_,type_)
);

CREATE TABLE application(
	applicationid INT(4) NOT NULL DEFAULT 0,
	username VARCHAR(12) NOT NULL,
	city VARCHAR(12) NOT NULL,
    bank VARCHAR(20) NOT NULL,
    location VARCHAR(100) NOT NULL,
    loan VARCHAR(30) NOT NULL,
    note TEXT NULL,
    status_ ENUM ('CANCELED','SCHEDULED','DECLINED','APPROVED') DEFAULT 'SCHEDULED',
    PRIMARY KEY(username,bank,location,city,loan)
);

DELIMITER $
DROP PROCEDURE IF EXISTS insert_user$
CREATE PROCEDURE insert_user(IN username VARCHAR(12),IN password_ VARCHAR(10),IN name_ VARCHAR(25),IN surname VARCHAR(30),IN email VARCHAR(30),IN phone VARCHAR(12))
BEGIN
INSERT INTO user VALUES
('',username,password_,name_,surname,email,phone);
END$
DELIMITER ;

DELIMITER $
DROP PROCEDURE IF EXISTS insert_appointment$
CREATE PROCEDURE insert_appointment(IN username VARCHAR(12),IN city VARCHAR(12),IN bank VARCHAR(20),IN location VARCHAR(100),IN day_ VARCHAR(100),IN  hour_ VARCHAR(20),IN type_ VARCHAR(30),IN note TEXT )
BEGIN
INSERT INTO appointment VALUES
('',username,city,bank,location,day_,hour_,type_,note,'');
END$
DELIMITER ;

DELIMITER $
DROP PROCEDURE IF EXISTS insert_application$
CREATE PROCEDURE insert_application(IN username VARCHAR(12),IN city VARCHAR(12),IN bank VARCHAR(20),IN location VARCHAR(100),IN loan VARCHAR(100),IN note TEXT )
BEGIN
INSERT INTO application VALUES
('',username,city,bank,location,loan,note,'');
END$
DELIMITER ;

DELIMITER $
DROP TRIGGER IF EXISTS users_num$
CREATE TRIGGER users_num
BEFORE INSERT ON user
FOR EACH ROW
BEGIN
DECLARE numofusers INT;
SELECT COUNT(*) INTO numofusers
FROM user
WHERE username=new.username;
SET new.userid= numofusers + 1;
END $ 
DELIMITER ;

DELIMITER $
DROP TRIGGER IF EXISTS appointment_num$
CREATE TRIGGER appointment_num
BEFORE INSERT ON appointment
FOR EACH ROW
BEGIN
DECLARE numofappointments INT;
SELECT COUNT(*) INTO numofappointments
FROM appointment
WHERE username=new.username;
SET new.appointmentid= numofappointments + 1;
END $ 
DELIMITER ;

DELIMITER $
DROP TRIGGER IF EXISTS application_num$
CREATE TRIGGER application_num
BEFORE INSERT ON application
FOR EACH ROW
BEGIN
DECLARE numofapplications INT;
SELECT COUNT(*) INTO numofapplications
FROM application;
SET new.applicationid= numofapplications + 1;
END $ 
DELIMITER ;

INSERT INTO bank VALUES
('Patra','Ethniki','PL. Triwn Sumaxwn','contact.center@nbg.gr','2610637457','2610637430',''),
('Patra','Ethniki','Lewf. Gounari & Korinthou 327','contact.center@nbg.gr','2610637566','2610637590',''),
('Patra','Ethniki','Ag. Triadas 22-24','contact.center@nbg.gr','2610362951','2610362960',''),
('Patra','Ethniki','Pl. Omonias 1-3 & Hleias','contact.center@nbg.gr','2610229151','2610229260',''),
('Patra','Ethniki','Euboias 149 & Antheias','contact.center@nbg.gr','2610390821','2610390820',''),
('Patra','Ethniki','Akrwtiriou 240','contact.center@nbg.gr','2610580161','2610580170',''),
('Patra','Ethniki','Maizwnos 51 & Zaimi','contact.center@nbg.gr','2610243536','2610243555',''),
('Patra','Ethniki','Akths Dumaiwn 25A & Skagiopoyleiou','contact.center@nbg.gr','2610367235','2610367240',''),
('Patra','Ethniki','Ellhnos Stratiwth 86 & Lemesou','contact.center@nbg.gr','2610490301','2610490315',''),
('Patra','Ethniki','Pl. Gewrgiou A & Korinthou 244','contact.center@nbg.gr','2610243571','2610243580',''),
('Patra','AlphaBank','Agiou Andrea 63','complaints@alpha.gr','2610638830','2610277247',''),
('Patra','AlphaBank','Pl. Pshlwn Alwniwn 14','complaints@alpha.gr','2610336346','2610335736',''),
('Patra','AlphaBank','Akrwtiriou 13','complaints@alpha.gr','2610312542','2610312439',''),
('Patra','AlphaBank','Agias Sofias 64','complaints@alpha.gr','2610450004','2610450209',''),
('Patra','AlphaBank','Gounari 28 & Maizwnos','complaints@alpha.gr','2610362970','2610313950',''),
('Patra','AlphaBank','Mixalakopoulou 2','complaints@alpha.gr','2610278871','2610277942',''),
('Patra','AlphaBank','Agiou Andrea 53 ','complaints@alpha.gr','2610634200','2610634200',''),
('Patra','AlphaBank','Ermou 83','complaints@alpha.gr','2610229010','2610270006',''),
('Patra','TrapezaPeiraiws','Gounari 61','info@piraeusbank.gr','2616000300','2610272812',''),
('Patra','TrapezaPeiraiws','Ellhnos Stratiwth 5','info@piraeusbank.gr','2616000400','2610425829',''),
('Patra','TrapezaPeiraiws','Iorotheou & Smurnhs 92','info@piraeusbank.gr','2616000500','2610335942',''),
('Patra','TrapezaPeiraiws','Agiou Andrea 123','info@piraeusbank.gr','2616000420','2616008255',''),
('Patra','TrapezaPeiraiws','Antheias 233','info@piraeusbank.gr','2616000350','2610320933',''),
('Patra','TrapezaPeiraiws','Panepisthmioupolh','info@piraeusbank.gr','2616000340','2616007244',''),
('Patra','TrapezaPeiraiws','Rio','info@piraeusbank.gr','2616000320','2616000338',''),
('Patra','TrapezaPeiraiws','Korinthou 224','info@piraeusbank.gr','2616000370','2616007039',''),
('Patra','TrapezaPeiraiws','Amerikhs 57 & Theodotou','info@piraeusbank.gr','2616000870','2616007230',''),
('Patra','TrapezaPeiraiws','Maizwnos 104','info@piraeusbank.gr','2610630426','2610623993',''),
('Patra','TrapezaPeiraiws','Rhga Feraiou 52 & Kolokotrwnh','info@piraeusbank.gr','2610243420','2610221711',''),
('Patra','TrapezaPeiraiws','Maizwnos 173 & Kanakarh','info@piraeusbank.gr','2610362760','2610312862',''),
('Patra','TrapezaPeiraiws','Agiou Andrea 107 & Asklhpiou','info@piraeusbank.gr','2610243310','2610623163',''),
('Patra','TrapezaPeiraiws','Ellhnos Stratiwth 85 & Leukwsias 21','info@piraeusbank.gr','2610456110','2610450929',''),
('Patra','TrapezaPeiraiws','Gewrgiou Papandreou 104 & Iwnias','info@piraeusbank.gr','2610362870','2610328552',''),
('Patra','Eurobank','Agiou Andrea 26 & Kolokotrwnh','info@eurobank.gr','2610621719','2610622367',''),
('Patra','Eurobank','Kalabrutwn 32 & Xrusostomou','info@eurobank.gr','2610312735','2610339264',''),
('Patra','Eurobank','Ellhnos Stratiwth 108','info@eurobank.gr','2610437250','2610437252',''),
('Patra','Eurobank','Othwnos-Amalias & Patrews 1','info@eurobank.gr','2610270110','2610270136',''),
('Patra','Eurobank','Akrwtiriou 167','info@eurobank.gr','2610346067','2610337354',''),
('Patra','Eurobank','Kanakarh 103','info@eurobank.gr','2610240160','2610273074',''),
('Patra','Eurobank','Lewf. Gounari 77-79','info@eurobank.gr','2610272076','2610278059',''),
('Patra','Eurobank','Ellhnos Stratiwth 39','info@eurobank.gr','2610455113','2610455112','');

