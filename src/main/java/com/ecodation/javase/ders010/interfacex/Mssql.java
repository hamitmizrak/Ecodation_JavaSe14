package com.ecodation.javase.ders010.interfacex;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Mssql implements IDatabaseCrud {

    @Override
    public void govdeliMethod() {
        System.out.println("Mssql gövdeli");
    }

    @Override
    public void create() {
        log.info("Mssql oluşturuldu");
    }

    @Override
    public void delete() {
        log.info("Mssql silindi");
    }

    @Override
    public void update() {
        log.warn("Mssql güncellendi");
    }

    @Override
    public void list() {
        log.error("Mssql listelendi");
    }
}
