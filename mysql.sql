DROP DATABASE IF EXISTS yoklama;
CREATE DATABASE yoklama;
USE yoklama;

-- Students Table
CREATE TABLE students (
                          student_id BIGINT PRIMARY KEY,
                          name VARCHAR(50),
                          email VARCHAR(100),
                          password VARCHAR(255)
);

-- Teachers Table
CREATE TABLE teachers (
                          teacher_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(50),
                          department VARCHAR(50),
                          email VARCHAR(100) NOT NULL,
                          password VARCHAR(255) NOT NULL
);

-- Classes Table
CREATE TABLE classes (
                         class_id VARCHAR(10) PRIMARY KEY,
                         class_name VARCHAR(100),
                         department VARCHAR(50),
                         teacher_id BIGINT,
                         FOREIGN KEY (teacher_id) REFERENCES teachers(teacher_id)
);

INSERT INTO teachers (teacher_id, name, department, email, password) VALUES
                                                                         (1, 'Veysel ASLANTAŞ', 'Bilgisayar Mühendisliği', 'aslantas@erciyes.edu.tr', 'password123'),
                                                                         (2, 'Mete ÇELİK', 'Bilgisayar Mühendisliği', 'mcelik@erciyes.edu.tr', 'password123'),
                                                                         (3, 'Beyza GÖRKEMLİ BAYRAM', 'Bilgisayar Mühendisliği', 'bgorkemli@erciyes.edu.tr', 'password123'),
                                                                         (4, 'Ahmet Nusret TOPRAK', 'Bilgisayar Mühendisliği', 'antoprak@erciyes.edu.tr', 'password123'),
                                                                         (5, 'Nesibe YALÇIN', 'Bilgisayar Mühendisliği', 'nesibeyalcin@erciyes.edu.tr', 'password123'),
                                                                         (6, 'Fatma Özge ÖZKÖK', 'Bilgisayar Mühendisliği', 'fozgeozkok@erciyes.edu.tr', 'password123'),
                                                                         (7, 'Mehmet ELMACI', 'Bilgisayar Mühendisliği', 'mehmetelmaci@erciyes.edu.tr', 'password123'),
                                                                         (8, 'Hüseyin ÖZKAYA', 'Bilgisayar Mühendisliği', 'huseyinozkaya@erciyes.edu.tr', 'password123'),
                                                                         (9, 'Osman Buğra KAHRAMAN', 'Bilgisayar Mühendisliği', 'obkahraman@erciyes.edu.tr', 'password123'),
                                                                         (10, 'Fatma AZİZOĞLU', 'Bilgisayar Mühendisliği', 'fatmaazizoglu@erciyes.edu.tr', 'password123'),
                                                                         (11, 'Gökhan AZİZOĞLU', 'Bilgisayar Mühendisliği', 'gazizoglu@erciyes.edu.tr', 'password123'),
                                                                         (12, 'Derviş KARABOĞA', 'Bilgisayar Mühendisliği', 'karaboga@erciyes.edu.tr', 'password123'),
                                                                         (13, 'Bahriye AKAY', 'Bilgisayar Mühendisliği', 'bahriye@erciyes.edu.tr', 'password123'),
                                                                         (14, 'Özkan Ufuk NALBANTOĞLU', 'Bilgisayar Mühendisliği', 'nalbantoglu@erciyes.edu.tr', 'password123'),
                                                                         (15, 'Ömür ŞAHİN', 'Bilgisayar Mühendisliği', 'omur@erciyes.edu.tr', 'password123'),
                                                                         (16, 'Damla COŞKUN', 'Bilgisayar Mühendisliği', 'damlacoskun@erciyes.edu.tr', 'password123'),
                                                                         (17, 'M. Uğur TÜRKDAMAR', 'Bilgisayar Mühendisliği', 'mturkdamar@erciyes.edu.tr', 'password123'),
                                                                         (18, 'Abdulbaki KARTAL', 'Bilgisayar Mühendisliği', 'abdulbakikartal@erciyes.edu.tr', 'password123'),
                                                                         (19, 'Alper BAŞTÜRK', 'Bilgisayar Mühendisliği', 'ab@erciyes.edu.tr', 'password123'),
                                                                         (20, 'Selçuk ÖKDEM', 'Bilgisayar Mühendisliği', 'okdem@erciyes.edu.tr', 'password123'),
                                                                         (21, 'Bilal BABAYİĞİT', 'Bilgisayar Mühendisliği', 'bilalb@erciyes.edu.tr', 'password123'),
                                                                         (22, 'Serkan ÖZTÜRK', 'Bilgisayar Mühendisliği', 'ozturks@erciyes.edu.tr', 'password123'),
                                                                         (23, 'Tayyip ÖZCAN', 'Bilgisayar Mühendisliği', 'tozcan@erciyes.edu.tr', 'password123'),
                                                                         (24, 'Fehim KÖYLÜ', 'Bilgisayar Mühendisliği', 'fehimkoylu@erciyes.edu.tr', 'password123'),
                                                                         (25, 'Fuat TÖRE', 'Bilgisayar Mühendisliği', 'fuattore@erciyes.edu.tr', 'password123'),
                                                                         (26, 'Hayri ÖZTÜRK', 'Bilgisayar Mühendisliği', 'hayriozturk@erciyes.edu.tr', 'password123');

INSERT INTO classes (class_id, class_name, department, teacher_id) VALUES
                                                                       ('BZ101', 'INTRODUCTION TO COMPUTER ENGINEERING', 'BİLGİSAYAR MÜHENDİSLİĞİ', 3),
                                                                       ('BZ105', 'LİNEER CEBİR', 'BİLGİSAYAR MÜHENDİSLİĞİ',13 ),
                                                                       ('BZ111', 'BİLGİSAYAR PROGRAMLAMA I', 'BİLGİSAYAR MÜHENDİSLİĞİ', 4),
                                                                       ('BZ113', 'İLETİŞİM VE SUNUM TEKNİKLERİ', 'BİLGİSAYAR MÜHENDİSLİĞİ', 2),
                                                                       ('MAT111', 'MATEMATIK I', 'BİLGİSAYAR MÜHENDİSLİĞİ',19 ),
                                                                       ('PHYS119', 'PHYSICS I', 'BİLGİSAYAR MÜHENDİSLİĞİ', 6),
                                                                       ('YD101', 'ENGLISH FOR COMPUTER ENGINEERING I', 'BİLGİSAYAR MÜHENDİSLİĞİ',9 ),
                                                                       ('BZ102', 'BİLGİSAYAR PROGRAMLAMA II', 'BİLGİSAYAR MÜHENDİSLİĞİ',6 ),
                                                                       ('BZ106', 'DISCRETE MATHEMATICS', 'BİLGİSAYAR MÜHENDİSLİĞİ',6),
                                                                       ('BZ112', 'KARİYER PLANLAMA', 'BİLGİSAYAR MÜHENDİSLİĞİ', 5),
                                                                       ('MAT112', 'MATEMATİK II', 'BİLGİSAYAR MÜHENDİSLİĞİ',2 ),
                                                                       ('PHYS120', 'PHYSICS II', 'BİLGİSAYAR MÜHENDİSLİĞİ', 14),
                                                                       ('YD102', 'ENGLISH FOR COMPUTER ENGINEERING II', 'BİLGİSAYAR MÜHENDİSLİĞİ',26 ),
                                                                       ('BZ203', 'ELECTRICAL CIRCUITS', 'BİLGİSAYAR MÜHENDİSLİĞİ',13 ),
                                                                       ('BZ205', 'VERİ YAPILARI VE ALGORİTMALAR', 'BİLGİSAYAR MÜHENDİSLİĞİ',18 ),
                                                                       ('BZ207', 'MÜHENDİSLİK MATEMATİĞİ', 'BİLGİSAYAR MÜHENDİSLİĞİ',9 ),
                                                                       ('BZ209', 'OBJECT ORIENTED PROGRAMMING', 'BİLGİSAYAR MÜHENDİSLİĞİ', 17),
                                                                       ('MAT221', 'DİFERANSİYEL DENKLEMLER', 'BİLGİSAYAR MÜHENDİSLİĞİ',11 ),
                                                                       ('BZ202', 'ELEKTRONİK DEVRELER', 'BİLGİSAYAR MÜHENDİSLİĞİ', 10),
                                                                       ('BZ204', 'SAYISAL YÖNTEMLER', 'BİLGİSAYAR MÜHENDİSLİĞİ', 1),
                                                                       ('BZ206', 'PROBABILTY THEORY AND STATISTICS', 'BİLGİSAYAR MÜHENDİSLİĞİ',1 );
INSERT INTO students (student_id, name, email, password) VALUES
                                                           ('1030510001', 'Ahmet Yılmaz', 'ahmet.yilmaz@example.com', 'password123'),
                                                             ('1030510002', 'Ayşe Demir', 'ayse.demir@example.com', 'password123'),
                                                             ('1030510003', 'Mehmet Kara', 'mehmet.kara@example.com', 'password123'),
                                                             ('1030510004', 'Zeynep Çelik', 'zeynep.celik@example.com', 'password123'),
                                                             ('1030510005', 'Ali Kılıç', 'ali.kilic@example.com', 'password123'),
                                                             ('1030510006', 'Elif Gül', 'elif.gul@example.com', 'password123'),
                                                             ('1030510007', 'Murat Şahin', 'murat.sahin@example.com', 'password123'),
                                                             ('1030510008', 'Fatma Özdemir', 'fatma.ozdemir@example.com', 'password123'),
                                                             ('1030510009', 'Hakan Yıldız', 'hakan.yildiz@example.com', 'password123'),
                                                             ('1030510010', 'Deniz Kaya', 'deniz.kaya@example.com', 'password123'),
                                                             ('1030510011', 'Seda Arslan', 'seda.arslan@example.com', 'password123'),
                                                             ('1030510012', 'Cemal Bozkurt', 'cemal.bozkurt@example.com', 'password123'),
                                                             ('1030510013', 'Emine Aksoy', 'emine.aksoy@example.com', 'password123'),
                                                             ('1030510014', 'Orhan Çetin', 'orhan.cetin@example.com', 'password123'),
                                                             ('1030510015', 'Ayhan Aydın', 'ayhan.aydin@example.com', 'password123'),
                                                             ('1030510016', 'Büşra Demirtaş', 'busra.demirtas@example.com', 'password123'),
                                                             ('1030510017', 'Kemal Tan', 'kemal.tan@example.com', 'password123'),
                                                             ('1030510018', 'İsmail Bozkurt', 'ismail.bozkurt@example.com', 'password123'),
                                                             ('1030510019', 'Fikret Yılmaz', 'fikret.yilmaz@example.com', 'password123'),
                                                             ('1030510020', 'Selin Gök', 'selin.gok@example.com', 'password123'),
                                                             ('1030510021', 'Sinem Polat', 'sinem.polat@example.com', 'password123'),
                                                             ('1030510022', 'Baran Karaca', 'baran.karaca@example.com', 'password123'),
                                                             ('1030510023', 'Berkay Yılmaz', 'berkay.yilmaz@example.com', 'password123'),
                                                             ('1030510024', 'Cansu Arıkan', 'cansu.arikan@example.com', 'password123'),
                                                             ('1030510025', 'Eda Turan', 'eda.turan@example.com', 'password123');




