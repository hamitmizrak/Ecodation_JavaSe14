package com.ecodation.javase.ders010.interfacex;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Mysql implements IDatabaseCrud {

    @Override
    public void create() {
        log.info("Mysql oluşturuldu");
    }

    @Override
    public void govdeliMethod() {
        System.out.println("Mysql gövdeli");
    }

    @Override
    public void delete() {
        log.info("Mysql silindi");
    }

    @Override
    public void update() {
        log.warn("Mysql güncellendi");
    }

    @Override
    public void list() {
        log.error("Mysql listelendi");
    }
}
