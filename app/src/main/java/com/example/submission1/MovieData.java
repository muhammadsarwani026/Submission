package com.example.submission1;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {"Avengers: Endgame", "Setelah peristiwa yang memusnahkan setengah dari populasi Bumi di Avengers: Infinity War (2018) kisah akan berlanjut saat Avengers yang tersisa berkumpul sekali lagi untuk melawan Thanos dan memulihkan tatanan alam semesta.", "https://upload.wikimedia.org/wikipedia/en/0/0d/Avengers_Endgame_poster.jpg"},
            {"Captain Marvel", "Carol Danvers (Brie Larson), anggota Angkatan Udara Amerika Serikat, mendapatkan kekuatan super setelah sebuah ledakan yang diciptakan oleh ras alien Kree. \n" +
                    "\n" +
                    "Carol menjadi salah satu pahlawan paling kuat di alam semesta ketika Bumi terperangkap di tengah perang galaksi antara dua ras alien.", "https://upload.wikimedia.org/wikipedia/en/8/85/Captain_Marvel_poster.jpg"},
            {"John Wick: Chapter 3 - Parabellum", "Melanjutkan kisah film kedua, seri ketiga akan bercerita tentang John Wick yang kini dalam pelarian setelah melakukan hal terlarang. Dengan imbalan 14 juta dolar AS bagi siapa saja yang bisa membunuhnya, John menjadi target utama bagi para pemburu bayaran di seluruh dunia.", "https://upload.wikimedia.org/wikipedia/en/9/94/John_Wick_Chapter_3_Parabellum.png"},
            {"Pokemon Detective Pikachu", "Tim Goodman (Justice Smith) harus bekerja keras setelah ayahnya Harry Goodman hilang pasca mengalami sebuah kecelakaan mobil.\n" +
                    "\n" +
                    "Dalam penyelidikannya, Tim bertemu dengan Detective Pikachu (Ryan Reynolds). Keduanya bekerjasama mengungkap hilangnya Harry.", "https://upload.wikimedia.org/wikipedia/id/e/e5/Pok%C3%A9mon_Detective_Pikachu_teaser_poster.jpg"},
            {"Aladdin", "Aladdin (Mena Massoud) adalah penjahat jalanan baik hati. Ia akan bersaing dengan Jafar (Marwan Kenzari) seorang penyihir jahat untuk memperebutkan lampu ajaib yang memiliki kekuatan membuat keinginan terdalam mereka menjadi kenyataan.", "https://upload.wikimedia.org/wikipedia/en/9/9a/Aladdin_%28Official_2019_Film_Poster%29.png"},
            {"Polaroid", "Bird Fitcher (Kathryn Prescott) siswi SMA menemukan sebuah kamera Polaroid. Namun ada yang berbahaya dari kamera tersebut. Ia mendapatkan kenyataan bahwa siapapun yang di foto oleh kamera itu akan menemui akhir yang targis.", "https://upload.wikimedia.org/wikipedia/en/4/4d/Polaroid_teaser_poster.jpg"},
    };

    public static ArrayList<Movie> getListData(){
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            movie = new Movie();
            movie.setName(aData[0]);
            movie.setDescription(aData[1]);
            movie.setPhoto(aData[2]);

            list.add(movie);
        }

        return list;
    }
}