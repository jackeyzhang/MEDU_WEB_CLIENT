CREATE SCHEMA `medu` ;

delimiter $$

CREATE TABLE `medu_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `birthday` date DEFAULT NULL,
  `hobby` varchar(45) DEFAULT NULL,
  `nativplace` varchar(45) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `normallycity` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `medu_mclass` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classtime` varchar(100) DEFAULT NULL,
  `teacher` int(11) DEFAULT NULL,
  `classroom` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_teacher_idx` (`teacher`),
  CONSTRAINT `fk_teacher` FOREIGN KEY (`teacher`) REFERENCES `medu_person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `medu_payment` (
  `payid` int(11) NOT NULL AUTO_INCREMENT,
  `payed` float DEFAULT NULL,
  `paydate` datetime DEFAULT NULL,
  `payway` varchar(10) DEFAULT NULL,
  `payee` int(11) NOT NULL,
  `payer` int(11) NOT NULL,
  PRIMARY KEY (`payid`),
  KEY `fk_payee_idx` (`payee`),
  KEY `fk_payer_idx` (`payer`),
  CONSTRAINT `fk_payee` FOREIGN KEY (`payee`) REFERENCES `medu_person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_payer` FOREIGN KEY (`payer`) REFERENCES `medu_person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `medu_student` (
  `idmedu_student` int(11) NOT NULL AUTO_INCREMENT,
  `person` int(11) DEFAULT NULL,
  `mclass` int(11) DEFAULT NULL,
  PRIMARY KEY (`idmedu_student`),
  KEY `fk_person_idx` (`person`),
  KEY `fk_mclass_idx` (`mclass`),
  CONSTRAINT `fk_mclass` FOREIGN KEY (`mclass`) REFERENCES `medu_mclass` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person` FOREIGN KEY (`person`) REFERENCES `medu_person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `medu_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grade` varchar(45) DEFAULT NULL,
  `basesalary` float DEFAULT NULL,
  `classsalary` float DEFAULT NULL,
  `bonus` float DEFAULT NULL,
  `person` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_person_idx` (`person`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$



