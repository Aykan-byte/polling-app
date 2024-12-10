CREATE database yoklama;
use yoklama;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(100),
    password VARCHAR(255)
);
CREATE TABLE teachers (
    teacher_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    email VARCHAR(100),
    password VARCHAR(255) 
);

CREATE TABLE classes (
    class_id VARCHAR(10) PRIMARY KEY,
    class_name VARCHAR(100),
    department VARCHAR(50),
    teacher_id INT,
    FOREIGN KEY (teacher_id) REFERENCES teachers(teacher_id)
);

CREATE TABLE attendance (
    attendance_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    class_id VARCHAR(10),
    attendance_date DATE,
    status VARCHAR(10), -- 'present' veya 'absent'
    FOREIGN KEY (student_id) REFERENCES students(student_id),
   FOREIGN KEY (class_id) REFERENCES classes(class_id)
);

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

INSERT INTO classes (class_id, class_name, department, teacher_id) VALUES
('AI101', 'ATATÜRK İLKELERİ VE İNKILAP TARİHİ-I', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ101', 'INTRODUCTION TO COMPUTER ENGINEERING', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ105', 'LİNEER CEBİR', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ111', 'BİLGİSAYAR PROGRAMLAMA I', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ113', 'İLETİŞİM VE SUNUM TEKNİKLERİ', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('MAT111', 'MATEMATIK I', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('PHYS119', 'PHYSICS I', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('TD101', 'TÜRK DİLİ I', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('YD101', 'ENGLISH FOR COMPUTER ENGINEERING I', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('AI102', 'ATATÜRK İLKELERİ VE İNKILAP TARİHİ-II', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ102', 'BİLGİSAYAR PROGRAMLAMA II', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ106', 'DISCRETE MATHEMATICS', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ112', 'KARİYER PLANLAMA', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('MAT112', 'MATEMATİK II', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('PHYS120', 'PHYSICS II', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('TD102', 'TÜRK DİLİ II', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('YD102', 'ENGLISH FOR COMPUTER ENGINEERING II', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ203', 'ELECTRICAL CIRCUITS', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ205', 'VERİ YAPILARI VE ALGORİTMALAR', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ207', 'MÜHENDİSLİK MATEMATİĞİ', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ209', 'OBJECT ORIENTED PROGRAMMING', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('MAT221', 'DİFERANSİYEL DENKLEMLER', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ202', 'ELEKTRONİK DEVRELER', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ204', 'SAYISAL YÖNTEMLER', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL),
('BZ206', 'PROBABILTY THEORY AND STATISTICS', 'BİLGİSAYAR MÜHENDİSLİĞİ', NULL);

INSERT INTO teachers (name, department, email, password) VALUES
('Veysel ASLANTAŞ', 'Bilgisayar Mühendisliği', 'aslantas@erciyes.edu.tr', 'password123'),
('Mete ÇELİK', 'Bilgisayar Mühendisliği', 'mcelik@erciyes.edu.tr', 'password123'),
('Beyza GÖRKEMLİ BAYRAM', 'Bilgisayar Mühendisliği', 'bgorkemli@erciyes.edu.tr', 'password123'),
('Ahmet Nusret TOPRAK', 'Bilgisayar Mühendisliği', 'antoprak@erciyes.edu.tr', 'password123'),
('Nesibe YALÇIN', 'Bilgisayar Mühendisliği', 'nesibeyalcin@erciyes.edu.tr', 'password123'),
('Fatma Özge ÖZKÖK', 'Bilgisayar Mühendisliği', 'fozgeozkok@erciyes.edu.tr', 'password123'),
('Mehmet ELMACI', 'Bilgisayar Mühendisliği', 'mehmetelmaci@erciyes.edu.tr', 'password123'),
('Hüseyin ÖZKAYA', 'Bilgisayar Mühendisliği', 'huseyinozkaya@erciyes.edu.tr', 'password123'),
('Osman Buğra KAHRAMAN', 'Bilgisayar Mühendisliği', 'obkahraman@erciyes.edu.tr', 'password123'),
('Fatma AZİZOĞLU', 'Bilgisayar Mühendisliği', 'fatmaazizoglu@erciyes.edu.tr', 'password123'),
('Gökhan AZİZOĞLU', 'Bilgisayar Mühendisliği', 'gazizoglu@erciyes.edu.tr', 'password123'),
('Derviş KARABOĞA', 'Bilgisayar Mühendisliği', 'karaboga@erciyes.edu.tr', 'password123'),
('Bahriye AKAY', 'Bilgisayar Mühendisliği', 'bahriye@erciyes.edu.tr', 'password123'),
('Özkan Ufuk NALBANTOĞLU', 'Bilgisayar Mühendisliği', 'nalbantoglu@erciyes.edu.tr', 'password123'),
('Ömür ŞAHİN', 'Bilgisayar Mühendisliği', 'omur@erciyes.edu.tr', 'password123'),
('Damla COŞKUN', 'Bilgisayar Mühendisliği', 'damlacoskun@erciyes.edu.tr', 'password123'),
('M. Uğur TÜRKDAMAR', 'Bilgisayar Mühendisliği', 'mturkdamar@erciyes.edu.tr', 'password123'),
('Abdulbaki KARTAL', 'Bilgisayar Mühendisliği', 'abdulbakikartal@erciyes.edu.tr', 'password123'),
('Alper BAŞTÜRK', 'Bilgisayar Mühendisliği', 'ab@erciyes.edu.tr', 'password123'),
('Selçuk ÖKDEM', 'Bilgisayar Mühendisliği', 'okdem@erciyes.edu.tr', 'password123'),
('Bilal BABAYİĞİT', 'Bilgisayar Mühendisliği', 'bilalb@erciyes.edu.tr', 'password123'),
('Serkan ÖZTÜRK', 'Bilgisayar Mühendisliği', 'ozturks@erciyes.edu.tr', 'password123'),
('Tayyip ÖZCAN', 'Bilgisayar Mühendisliği', 'tozcan@erciyes.edu.tr', 'password123'),
('Fehim KÖYLÜ', 'Bilgisayar Mühendisliği', 'fehimkoylu@erciyes.edu.tr', 'password123'),
('Fuat TÖRE', 'Bilgisayar Mühendisliği', 'fuattore@erciyes.edu.tr', 'password123'),
('Hayri ÖZTÜRK', 'Bilgisayar Mühendisliği', 'hayriozturk@erciyes.edu.tr', 'password123');
