package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        //m.autorePrimaAnno(albums, 2000);

        Map< String, List < String >> phoneNumbers = new HashMap< String, List < String >>();
        phoneNumbers.put("John Lawson", Arrays.asList("3232312323", "8933555472"));
        phoneNumbers.put("Mary Jane", Arrays.asList("12323344", "492648333"));
        phoneNumbers.put("Mary Lou", Arrays.asList("77323344", "938448333"));

        m.numeriTelefono(phoneNumbers);
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

    public void numeriTelefono(Map< String, List < String >> phoneNumbers){

        ArrayList<String> chiavi = phoneNumbers.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
        chiavi.forEach(System.out::println);
        List<String> lista = phoneNumbers.entrySet().stream().filter(k -> k.getKey().equals("Mary Jane")).map(Map.Entry::getValue).flatMap(List::stream).collect(Collectors.toList());
        lista.stream().forEach(System.out::println);

    }
}
