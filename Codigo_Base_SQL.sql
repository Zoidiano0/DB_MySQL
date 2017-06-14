-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Ciercom_Pre_Matricula
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Ciercom_Pre_Matricula
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Ciercom_Pre_Matricula` DEFAULT CHARACTER SET utf8 ;
USE `Ciercom_Pre_Matricula` ;

-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Periodo Académico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Periodo Académico` (
  `Código` VARCHAR(45) NOT NULL,
  `NOmbre` VARCHAR(45) NULL,
  `Fecha Inicio` DATE NULL,
  `FEcha FIn` DATE NULL,
  `MOdalidad` VARCHAR(45) NULL,
  PRIMARY KEY (`Código`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Materias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Materias` (
  `Código` VARCHAR(45) NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `N_Matricula` INT NULL,
  `Nivel_Materia` INT NULL,
  `Estudiante_Cedula` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Código`),
  INDEX `fk_Materia_Estudiante1_idx` (`Estudiante_Cedula` ASC),
  CONSTRAINT `fk_Materia_Estudiante1`
    FOREIGN KEY (`Estudiante_Cedula`)
    REFERENCES `Ciercom_Pre_Matricula`.`Estudiante` (`Cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Estudiante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Estudiante` (
  `Cedula` VARCHAR(45) NOT NULL,
  `Matricula_Código` VARCHAR(45) NOT NULL,
  `Materias` VARCHAR(45) NOT NULL,
  `Nombre_1` VARCHAR(45) NULL,
  `Nombre_2` VARCHAR(45) NULL,
  `Apellido_1` VARCHAR(45) NULL,
  `Apellido_2` VARCHAR(45) NULL,
  `F_Nacimiento` DATE NULL,
  `Estado_Matricula` TINYINT NULL DEFAULT 0,
  PRIMARY KEY (`Cedula`),
  INDEX `fk_Estudiante_Matricula1_idx` (`Matricula_Código` ASC),
  INDEX `Materias_M_idx` (`Materias` ASC),
  CONSTRAINT `fk_Estudiante_Matricula1`
    FOREIGN KEY (`Matricula_Código`)
    REFERENCES `Ciercom_Pre_Matricula`.`Matricula` (`Código`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Materias_M`
    FOREIGN KEY (`Materias`)
    REFERENCES `Ciercom_Pre_Matricula`.`Materias` (`Código`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Matricula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Matricula` (
  `Código` VARCHAR(45) NOT NULL,
  `Periodo Académico_Código` VARCHAR(45) NOT NULL,
  `Estudiante_Matriculado` VARCHAR(45) NULL,
  PRIMARY KEY (`Código`, `Periodo Académico_Código`),
  INDEX `fk_Matricula_Periodo Académico1_idx` (`Periodo Académico_Código` ASC),
  INDEX `Est_Mat_idx` (`Estudiante_Matriculado` ASC),
  CONSTRAINT `fk_Matricula_Periodo Académico1`
    FOREIGN KEY (`Periodo Académico_Código`)
    REFERENCES `Ciercom_Pre_Matricula`.`Periodo Académico` (`Código`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Est_Mat`
    FOREIGN KEY (`Estudiante_Matriculado`)
    REFERENCES `Ciercom_Pre_Matricula`.`Estudiante` (`Cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Docente` (
  `Ci` VARCHAR(45) NOT NULL,
  `Nombres` VARCHAR(45) NULL,
  `Apellidos` VARCHAR(45) NULL,
  `Nivel Formación` VARCHAR(45) NULL,
  PRIMARY KEY (`Ci`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Aulas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Aulas` (
  `Código` VARCHAR(45) NOT NULL,
  `Edificio` VARCHAR(45) NULL,
  `Laboratorio` VARCHAR(45) NULL,
  `CApacidad` VARCHAR(45) NULL,
  `Nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`Código`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Nivel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Nivel` (
  `Codigo` VARCHAR(45) NOT NULL,
  `NOmbre` VARCHAR(45) NULL,
  PRIMARY KEY (`Codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Docente_has_Materias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Docente_has_Materias` (
  `Docente_Ci` VARCHAR(45) NOT NULL,
  `Materias_Código` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Docente_Ci`, `Materias_Código`),
  INDEX `fk_Docente_has_Materias_Materias1_idx` (`Materias_Código` ASC),
  INDEX `fk_Docente_has_Materias_Docente_idx` (`Docente_Ci` ASC),
  CONSTRAINT `fk_Docente_has_Materias_Docente`
    FOREIGN KEY (`Docente_Ci`)
    REFERENCES `Ciercom_Pre_Matricula`.`Docente` (`Ci`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Docente_has_Materias_Materias1`
    FOREIGN KEY (`Materias_Código`)
    REFERENCES `Ciercom_Pre_Matricula`.`Materias` (`Código`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Ciercom_Pre_Matricula`.`Aulas_has_Materias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ciercom_Pre_Matricula`.`Aulas_has_Materias` (
  `Aulas_Código` VARCHAR(45) NOT NULL,
  `Materias_Código` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Aulas_Código`, `Materias_Código`),
  INDEX `fk_Aulas_has_Materias_Materias1_idx` (`Materias_Código` ASC),
  INDEX `fk_Aulas_has_Materias_Aulas1_idx` (`Aulas_Código` ASC),
  CONSTRAINT `fk_Aulas_has_Materias_Aulas1`
    FOREIGN KEY (`Aulas_Código`)
    REFERENCES `Ciercom_Pre_Matricula`.`Aulas` (`Código`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aulas_has_Materias_Materias1`
    FOREIGN KEY (`Materias_Código`)
    REFERENCES `Ciercom_Pre_Matricula`.`Materias` (`Código`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
