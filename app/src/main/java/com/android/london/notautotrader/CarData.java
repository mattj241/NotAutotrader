package com.android.london.notautotrader;

public class CarData {

    public static String[] getManufactures(){
        String[] Manufacturers = {"Select", "Acura", "Alfa Romeo", "Aston Martin", "Audi",
                "BMW", "Bugatti", "Buick", "Cadillac", "Chevrolet", "Chrysler", "Dodge",
                "Ferrari", "FIAT", "Ford", "Genesis", "GMC", "Honda", "HUMMER", "Hyundai", "INFINITI",
                "Jaguar", "Jeep", "Kia", "Lamborghini", "Land Rover", "Lexus", "Lincoln",
                "Mazda", "Mercedes-Benz", "MINI", "Mitsubishi", "Nissan", "Porsche", "RAM", "Scion",
                "Subaru", "Tesla", "Toyota", "Volkswagen", "Volvo"};
        return Manufacturers;
    }

    public static String[] getModels(String manufacturer){
        switch (manufacturer){
            case "Acura":
                String Acura[] = {"CL", "ILX", "Integra", "Legend",
                "MDX", "NSX", "RDX", "RL", "RLX", "RSX", "SLX", "TL",
                        "TLX", "TSX", "ZDX"};
                return Acura;
            default:
                String[] temp = {};
                return temp;
        }
    }

}
