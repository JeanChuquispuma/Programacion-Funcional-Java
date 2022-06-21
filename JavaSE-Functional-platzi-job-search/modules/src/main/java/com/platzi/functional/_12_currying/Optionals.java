package com.platzi.functional._12_currying;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null){
            //Operar con nombres.
        }
        Optional<List<String>> optionalNames = getOpcionalNames();
        if (optionalNames.isPresent()){

        }

    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer(){
        return "";
    }

    static int mostExpensiveItem(){
        return -1;
    }

    static Optional<List<String>> getOpcionalNames(){

        return null;
    }
}
