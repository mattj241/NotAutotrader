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
            case "Alfa Romeo":
                String Alfa[] = {"164", "4C", "8C Competizione", "Giulia",
                "GTV-6", "Milano", "Spider", "Stelvio"};
                return Alfa;
            case "Aston Martin":
                String Aston[] = {"DB11", "DB7", "DB9", "DBS", "Lagonda", "Rapide",
                "Rapide S", "V12 Vantage", "V8 Vantage", "Vanquish", "Virage"};
                return Aston;
            case "Audi":
                String Audi[] = {"A3", "A4", "A5", "A6", "A7", "A8", "allroad",
                "Cabriolet", "Coupe", "e-tron", "Q3", "Q5", "Q7", "Q8", "Quattro",
                "R8", "RS 3", "RS 4", "RS 5", "RS 6", "RS 7", "S3", "S4", "S5",
                "S6", "S7", "S8", "SQ5", "TT", "TT RS", "TTS"};
                return Audi;
            case "BMW":
                String BMW[] = {"1 Series M", "128i", "228i", "318i", "428i", "524td",
                "633CSI", "733i", "840ci", "M2", "M3", "M4", "M5", "M6", "X3",
                "X5", "X7"};
                return BMW;
            case "Bugatti":
                String Bugatti[] = {"Chiron", "Veyron"};
                return Bugatti;
            case "Buick":
                String Buick[] = {"Cascada", "Century", "Electra", "Enclave",
                        "Encore", "Envision", "LaCrosse", "Le Sabre", "Park Avenue",
                "Rainier", "Reatta", "Regal", "Regal", "Rendezvous", "Verano"};
                return Buick;
            case "Cadillac":
                String Cadi[] = {"ATS", "CT6", "CTS", "DTS", "ELR", "Escalade",
                "SRX", "STS", "XLR", "XT4", "XT5", "XTS"};
                return Cadi;
            case "Chevrolet":
                String Chevy[] = {"Astro", "Avalanche", "Aveo", "Blazer", "Bolt",
                "Camaro", "Caprice", "Cavalier", "City Express", "Cobalt", "Colorado",
                        "Corvette", "Cruze", "El Camino", "Equinox", "Express", "HHR",
                "Impala", "Lumina", "Malibu", "Monte Carlo", "Nova", "Silverado", "Sonic",
                "Spark", "SS", "SSR", "Suburban", "Tahoe", "TrailBlazer", "Trax", "Uplander",
                "Volt"};
                return Chevy;
            case "Chrysler":
                String FCA[] = {"200", "300", "Aspen", "Crossfire", "Intrepid",
                        "Pacifica", "PT Cruiser", "Sebring", "Town & Country"};
                return FCA;
            case "Dodge":
                String Dodge[] = {"Avenger", "Caliber", "Caravan", "Challenger",
                "Charger", "Dart", "Daytona", "Durango", "Grand Caravan", "Magnum",
                "Intrepid", "Neon", "Ram 1500", "Viper"};
                return Dodge;
            case "Ferrari":
                String Scuderia[] = {"308", "328", "458 Italia", "488 Spider",
                "512 M", "550 Maranello", "599 GTO", "612 Scaglietti", "California",
                "Enzo", "F12 Berlinetta", "F40", "F430", "F50", "FF", "GTC4Lusso",
                "LaFerrari", "Testarossa"};
                return Scuderia;
            case "Ford":
                String FoundOnRoadSideDaily[] = {"Bronco", "C-MAX", "Contour",
                "Crown Victoria", "EcoSport", "Edge", "Escape", "Expedition",
                "Explorer", "F150", "Fiesta", "Five Hundred", "Flex", "Focus",
                "Freestar", "Freestyle", "Fusion", "Mustang", "Ranger", "Taurus",
                "Thunderbird"};
                return FoundOnRoadSideDaily;
            case "Genesis":
                String Gen[] = {"G70", "G80", "G90"};
                return Gen;
            case "GMC":
                String gmc[] = {"Acadia", "Canyon", "Envoy", "Jimmy",
                "Safari", "Savana 1500", "Sierra 1500", "Sonoma", "Syclone",
                "Terrain", "Typhoon", "Yukon"};
                return gmc;
            case "Honda":
                String honda[] = {"Civic", "Clarity", "CR-V", "CR-Z",
                "Crosstour", "CRX", "Del Sol", "Element", "Fit", "HR-V",
                "Insight", "Odyssey", "Passport", "Pilot", "Prelude",
                "Ridgeline", "S2000"};
                return honda;
            case "HUMMER":
                String Hummers[] = {"H1", "H2", "H3", "H3T"};
                return Hummers;
            case "Hyundai":
                String Sunday[] = {"Accent", "Azera", "Elantra", "Genesis",
                "Genesis Coupe", "Ioniq", "Kona", "Santa Fe", "Sonata",
                "Tiburon", "Tucson", "Veloster", "Veracruz"};
                return Sunday;
            case "INFINITI":
                String infinite[] = {"EX35", "EX37", "FX35", "FX37", "FX45",
                "G20", "G35", "G37", "I30", "I35", "Q40", "Q50", "Q60", "Q70",
                "QX50", "QX60", "QX70"};
                return infinite;
            case "Jaguar":
                String Jag[] = {"E-PACE", "F-PACE", "F-TYPE", "S-TYPE", "I-PACE",
                "XE", "XF", "XJ"};
                return Jag;
            case "Jeep":
                String Jeep[] = {"Cherokee", "Commander", "Compass", "Gladiator",
                "Grand Cherokee", "Grand Wagoneer", "Liberty", "Patriot", "Renegade",
                "Rubicon", "Wrangler"};
                return Jeep;
            case "Kia":
                String Kia[] = {"Cadenza", "Forte", "Forte Koup", "K900", "Niro",
                "Optima", "Rio", "Sedona", "Sorento", "Soul", "Spectra", "Sportage",
                    "Stinger", "Telluride"};
                return Kia;
            case "Lamborghini":
                String Lambo[] = {"Aventador", "Gallardo", "Huracan"};
                return Lambo;
            case "Land Rover":
                String Rover[] = {"Defender", "Discovery", "Evoque", "Sport"};
                return Rover;
            case "Lexus":
                String Lexi[] = {"CT 200h", "ES 250", "GS 300", "GX 460", "IS 200t",
                        "LC 500", "LFA", "LS 400", "LX 470", "NX 200t", "RC 200t",
                        "RX 300", "SC 300", "UX 200"};
                return Lexi;
            case "Lincoln":
                String lincoln[] = {"Aviator", "Continental", "LS", "Mark LT",
                        "Mark VI", "Mark VII", "Mark VIII", "MKC", "MKS",
                        "MKT", "MKX", "MKZ", "Nautilus", "Navigator", "Town Car",
                        "Zephyr"};
                return lincoln;
            case "Mazda":
                String mazda[] = {"CX-3", "CX-5", "CX-7", "CX-9", "MAZDA3",
                        "MAZDA5", "MAZDA6", "MAZDASPEED3", "MX-5 Miata",
                        "MX-5 Miata RF", "RX-7", "RX-8", "Tribute"};
                return mazda;
            case "Mercedes-Benz":
                String benz[] = {"C230", "CL 500", "CLA 250", "CLK 320", "CLS 400",
                        "E250", "G500", "GL320", "GLA 250", "GLC 300", "GLE 300d",
                        "GLK 250", "ML 250", "SLC 300", "SLK 230"};
                return benz;
            case "MINI":
                String cooper[] = {"Cooper", "Cooper Clubman", "Cooper Countryman",
                        "Cooper Coupe", "Cooper Paceman", "Cooper Roadster"};
                return cooper;
            case "Mitsubishi":
                String ralliart[] = {"3000GT", "Eclipse", "Galant", "Lancer",
                "Mirage", "Montero", "Outlander"};
                return ralliart;
            case "Nissan":
                String nismo[]={"240SX", "350Z", "370Z", "Altima", "Armada",
                        "Cube", "Frontier", "GT-R", "Juke", "Kicks", "Leaf",
                        "Maxima", "Murano", "NV", "Pathfinder", "Quest",
                        "Rogue", "Sentra", "Titan", "Versa", "Xterra"};
                return nismo;
            case "Porsche":
                String nineEleven[] = {"718 Boxster", "718 Cayman", "911",
                        "918 Spyder", "Boxter", "Carrera GT", "Cayenne",
                        "Cayman", "Macan", "Panamera"};
                return nineEleven;
            case "RAM":
                String ram[] = {"1500", "2500", "3500", "4500", "5500"};
                return ram;
            case "Scion":
                String scion[] = {"iQ", "tC"};
                return scion;
            case "Subaru":
                String sti[] = {"Ascent", "BRZ", "Crosstrek", "Forester",
                        "Impreza", "Legacy", "Outback", "Tribeca", "WRX",
                        "XT", "XV Crosstrek"};
                return sti;
            case "Tesla":
                String electric[] = {"Model 3", "Model S", "Model X"};
                return electric;
            case "Toyota":
                String yo[] = {"4Runner", "86", "Avalon", "C-HR", "Camry",
                        "Celica", "Corolla", "Echo", "FJ Cruiser", "Highlander",
                        "Land Cruiser", "Matrix", "Mirai", "MR2", "Prius", "RAV4",
                        "Sequoia", "Sienna", "Solara", "Supra", "Tacoma", "Tundra",
                        "Venza","Yaris"};
                return yo;
            case "Volkswagen":
                String dasAuto[] = {"Atlas", "Beetle", "Cabrio", "CC",
                        "Corrado", "e-Golf", "Eos",
                        "Golf", "Golf R", "GTI", "Jetta", "Passat", "Phaeton",
                        "R32", "Rabbit", "Routan", "Tiguan", "Touareg"};
                return dasAuto;
            case "Volvo":
                String volvo[] = {"240", "260", "74", "850", "C30", "C70",
                "S40", "S60", "V50", "V60", "V70", "V90", "XC40","XC60",
                "XC70", "XC90"};
                return volvo;
            default:
                String[] temp = {};
                return temp;
        }
    }

}
