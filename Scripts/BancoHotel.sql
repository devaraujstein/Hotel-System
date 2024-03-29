-- MySQL Script generated by MySQL Workbench
-- Fri Jun  1 14:53:53 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema BancoHoteleiro
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema BancoHoteleiro
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `BancoHoteleiro` DEFAULT CHARACTER SET utf8 ;
USE `BancoHoteleiro` ;

-- -----------------------------------------------------
-- Table `BancoHoteleiro`.`tb_quartos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BancoHoteleiro`.`tb_quartos` (
  `id_quartos` INT NOT NULL AUTO_INCREMENT,
  `numero` VARCHAR(4) NOT NULL,
  `andar` VARCHAR(3) NOT NULL,
  `descricao` VARCHAR(255) NOT NULL,
  `caracteristicas` VARCHAR(350) NULL,
  `preco_diaria` DECIMAL(7,2) NOT NULL,
  `estado` VARCHAR(15) NOT NULL,
  `tipo_quarto` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id_quartos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BancoHoteleiro`.`tb_clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BancoHoteleiro`.`tb_clientes` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT,
  `nome_cliente` VARCHAR(45) NOT NULL,
  `nome_pai` VARCHAR(45) NOT NULL,
  `nome_mae` VARCHAR(45) NOT NULL,
  `tipo_documento` VARCHAR(45) NOT NULL,
  `num_documento` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NULL,
  `telefone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id_cliente`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
