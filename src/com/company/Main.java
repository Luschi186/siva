package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Pink Floyd", "The Division Bell", 1994,
                "Cluster One",
                "What Do You Want from Me",
                "Poles Apart",
                "Marooned",
                "A Great Day for Freedom",
                "Wearing the Inside Out",
                "Take It Back",
                "Coming Back to Life",
                "Keep Talking",
                "Lost for Words",
                "High Hopes"));
        Main m=new Main();
        m.autorePrimaAnno(albums, 2000);
    }

    public void autorePrimaAnno(List<Album> album, int anno){
        ArrayList<String> result = album.stream().filter(t -> t.getYear() < anno).map(Album::getAuthor).collect(Collectors.toCollection(ArrayList<String>::new));
        result.stream().forEach(name -> System.out.println(name));
        System.out.println("no lambda");
        result.stream().forEach(System.out::println);
        List<String> results = album.stream().filter(t -> t.getYear() < anno).map(Album::getAuthor).collect(Collectors.toList());
        System.out.println("list");
        results.stream().forEach(System.out::println);

        StringBuilder stringBuilder=new StringBuilder();
        String nomeCognome=stringBuilder.append("sILVIA").append(" ").append("LUSCHI").toString();
        System.out.println(nomeCognome);
    }
}
