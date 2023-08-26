package com.omrfrkg.whattowhatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.omrfrkg.whattowhatch.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

       Movie movie1 = new Movie("Drakula Son Yolculuk",
                "Fantastik, Korku",
               "André Øvredal",
                "Corey Hawkins Aisling Franciosi Liam Cunningham",
                2023,
                6.4,
                "Ticaret gemisi Demeter'in mürettebatı, her gece gemideki acımasız bir varlık tarafından takip edilirken Karpatya'dan Londra'ya yaptıkları okyanus yolculuklarında hayatta kalmaya çalışır.",
                R.drawable.last_voyage_of_the_demeter);
        Movie movie2 = new Movie("Gran Turismo",
                "Aksiyon, Dram, Macera",
                "Neill Blomkamp",
                "David Harbour, Orlando Bloom, Archie Madekwe",
                2023,
                7.3,
                "Bu ilham verici film; işçi sınıfı bir bilgisayar oyuncusu, başarısız bir araba yarışçısı ve idealist bir motor sporları yöneticisinin dünyadaki en seçkin spor için ellerindeki her şeyi riske atma yolculuğunu anlatmakta.",
                R.drawable.gran_turismo);
        Movie movie3 = new Movie("Meg 2 : Çukur",
                "Bilim Kurgu, Aksiyon, Korku",
                "Ben Wheatley",
                "Jason Statham, Sienna Guillory, Cliff Curtis",
                2023,
                5.5,
                "2018 yapımı \"Meg: Derinlerdeki Dehşet\"in devam filmi olan \"Meg 2: Çukur\"da bir araştırma ekibi, devasa Meg'lere ve amansız çevre yağmacılarına karşı mücadele veriyorlar.",
                R.drawable.the_meg_2);
        Movie movie4 = new Movie("Blue Beetle",
                "Bilim Kurgu, Aksiyon",
                "Angel Manuel Sato",
                "Xolo Mariduena, Bruna Marquezine, Susan Sarandon",
                2023,
                6.9,
                "Meksikalı bir genç, kendisine süper güçlü zırh veren bir uzaylı bir böceği bulur. Bu noktadan sonra kendisinin süper kahraman yolculuğu başlar.",
                R.drawable.blue_beetle
                );
        Movie movie5 = new Movie("Ninja Kaplumbağalar: Mutant Kargaşası",
                "Animasyon, Aksiyon, Komedi",
                "Jeff Rowe, Kyler Spears",
                "Rose Byrne, Paul Rudd, Seth Rogen",
                2023,
                7.5,
                "Uzun yıllardır insanların dünyasından kaçan Kaplumbağa kardeşler, kahramanca hareketleriyle New York yerlilerinin kalplerini fethetmek ve normal gençler olarak görülmek için bir adım atarlar.",
                R.drawable.ninja_kaplumbagalar_mutant_kargasasi
                );



        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);

        MovieAdapter adapter = new MovieAdapter(movieList);
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}