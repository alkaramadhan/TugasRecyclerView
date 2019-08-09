package com.example.windows.tugasrecycle;

import java.util.ArrayList;

public class SenjataData {
    public static String[] [] data = new String[][]{
            {"PM2-V1 Kal. 9 mm", "Lahir setelah PM1, PM2 V1 merupakan generasi kedua pistol mitraliur (sub machine gun) kami dengan kaliber 9 x 19 mm parabellum. PM2 V1 beroperasi dengan sistem blowback, dengan jarak efektif sampai dengan 75 meter. Senjata ini memiliki pisir dan pijera yang dapat diatur serta memiliki tiga mode penembakan yakni Safe, semi auto, dan full auto. Dengan popor lipat, panjang senjata dapat dipangkas yang dapat memudahkan dalam mobilitas.", "https://www.pindad.com/uploads/images/product/full/PM2-V12.jpg"},
            {"SS2-V5 A1 Kal. 5.56 mm", "Varian SS2-V5 yang mendapatkan beberapa upgrade untuk meningkatkan performanya. Popor lipat yang menjadi standar pada SS2-V5 diganti dengan popor model teleskopik. Pada bagian handguard, disematkan rail pada kiri, kanan, atas, dan bawah untuk memasang berbagai aksesoris. Pada rail bawah, sudah terpasang sebuah vertical foregrip yang dapat menambah ergonomi dan kenyamanan dalam penggunaan senjata. Selain itu, pisir model carry handle diganti dengan model lipat pada rail. Pisir dan pijera ini dapat diganti dengan berbagai jenis teleskop yang dipasang pada rail senjata", "https://www.pindad.com/uploads/images/product/full/SS2-V5-A1-alt.jpg"},
            {"SPG1-V3 Kal. 40 mm", "Merupakan pelontar granat yang dapat melontarkan granat lontar dengan kaliber 40 mm. Dengan panjang laras 200 mm, pelontar granat ini di desain secara khusus untuk dipasangkan pada senapan serbu SS1 R5 yang memiliki laras lebih pendek dibanding varian SS1 yang lainnya. Jarak pelontaran dapat mencapai 350 meter dengan kecepatan 75 m/s. Mekanisme penembakan dilakukan satu per satu dengan cara pengisian manual", "https://www.pindad.com/uploads/images/product/full/SPG1-V31.jpg"},
            {"SPR-3 Kal. 7.62 mm", "Senapan penembak runduk dengan desain presisi dan bodi yang lebih ringan untuk pergerakan dalam medan pertempuran. Sniper yang memenuhi standar NATO  dengan munisi kaliber 7.62 x 51 mm ini dilengkapi dengan teropong bidik untuk meningkatkan akurasi tembakan pada jarak 1 km", "https://www.pindad.com/uploads/images/product/full/SPR-3.jpg"},
            {"PM2-V2 Kal. 9 mm", "Diciptakanan untuk menyepurnakan desain dari PM2 V1. Senjata ini tetap menggunakan kaliber 9 x 19 mm parabellum dengan sistem operasi blowback. Senjata ini memiliki jarak efektif sebesar 75 meter. Senjata ini dapat dilengkapi dengan pisir dan pijera yang dapat disetel. Senjata ini juga dapat menggunakan sebuah peredam yang berfungsi untuk meredam suara yang keluarkan saat menembak. Dengan popor lipat, panjang senjata dapat dipangkas yang dapat memudahkan dalam mobilitas", "https://www.pindad.com/uploads/images/product/full/PM2-V22.jpg"},
    };
    public static ArrayList<Senjata> getListData(){
        ArrayList<Senjata> list = new ArrayList<>();
        for (String[] aData : data){
            Senjata senjata = new Senjata();
            senjata.setName(aData[0]);
            senjata.setFrom(aData[1]);
            senjata.setPhoto(aData[2]);
            list.add(senjata);
        }
        return list;
    }
}
