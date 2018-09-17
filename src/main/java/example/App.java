package example;

import stringsort.Sort;

public class App {

    public static void main(String[] args) {

        var actualNames = new String[]{"Wilson","Johnson","Abraham","Wilkinson","Wayne"};
        Sort.sort(actualNames);
        for(final String name:actualNames){
            System.out.println(name);
        }

    }
}
