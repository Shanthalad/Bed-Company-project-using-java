package com.bed.design.repository;

public class BedCompanyRespository {

    private String[] bedCompanies = new String[4];
    private int position = 0;

    // Save brand
    public void saveBrand(String brand) {
        System.out.println("Total storage capacity: " + this.bedCompanies.length);

        if (position < bedCompanies.length) {
            this.bedCompanies[position] = brand;
            position++;
            System.out.println("Brand stored successfully: " + brand);
        } else {
            System.out.println("Storage full. Brand not stored: " + brand);
        }
    }

    // Read all brands
    public void findAll() {
        System.out.println("---- All Stored Bed Brands ----");
        for (String bed : this.bedCompanies) {
            if (bed != null) {
                System.out.println(bed);
            }
        }
    }

    // Find a specific brand
    public void find(String brandName) {
        for (String brand : this.bedCompanies) {
            if (brand != null && brand.equalsIgnoreCase(brandName)) {
                System.out.println("Brand found: " + brandName);
                return;
            }
        }
        System.err.println("Brand not found: " + brandName);
    }
}
