package com.bed.design.repository;

public class BedCompany {

    public static void main(String[] args) {

        BedCompanyRespository bed = new BedCompanyRespository();

        bed.saveBrand("Portico");
        bed.saveBrand("Raymond Home");
        bed.saveBrand("Swayam");
        bed.saveBrand("Jaipur Fabric");
        bed.saveBrand("MyTrident"); // Will not be stored (array full)

        bed.findAll();

        bed.find("Swayam");
        bed.find("MyTrident");
    }
}
