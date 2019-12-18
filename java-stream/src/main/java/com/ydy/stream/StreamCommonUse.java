package com.ydy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamCommonUse {
    public static void main(String[] args) {
        StreamCommonUse streamCommonUse =new StreamCommonUse();
//        streamCommonUse.filter();
//        streamCommonUse.reduce();
//        streamCommonUse.map();
        streamCommonUse.sort();
    }
    
    private void sort() {
        List<String> listStr =new ArrayList<String>();
        listStr.add("aaaa");
        listStr.add("bbbb");
        listStr.add("cccc");
        listStr.add("dddd");
        listStr.stream().sorted((e1,e2)->{
            return e2.compareTo(e1);
        }).forEach(e->{
            System.out.println(e);
        });
    }
    
    private void map() {
        List<String> listStr =new ArrayList<String>();
        listStr.add("aaaa");
        listStr.add("bbbb");
        listStr.add("cccc");
        listStr.add("dddd");
        listStr.add("eeee");
        Stream<String> stream1 = listStr.stream();
        Stream<Integer> stream2 = stream1.map(e->{
           return e.length(); 
        });
        stream2.forEach(e->{
            System.out.println(e);
        });
    }
    
    private void reduce() {
        List<String> listStr =new ArrayList<String>();
        listStr.add("aaaa");
        listStr.add("bbbb");
        listStr.add("cccc");
        listStr.add("dddd");
        listStr.add("eeee");
        Stream<String> stream1 = listStr.stream();
        Optional<String> optional = stream1.reduce((e1,e2)->{
//            if(e1.compareTo(e2)>0) {
//                return e1;
//            }else {
//                return e2;
//            }
            return e1+","+e2;
        });
        System.out.println("optional:"+optional.get());
    }
    private void filter() {
        List<String> listStr =new ArrayList<String>();
        listStr.add("aaaa");
        listStr.add("bbbb");
        listStr.add("cccc");
        listStr.add("dddd");
        listStr.add("eeee");
        Stream<String> stream1 = listStr.stream();
//        Stream<String> stream2 = stream1.filter(e->{
//            return e.startsWith("a")||e.startsWith("b");
//             
//        });
        stream1.forEach(e->{
            System.out.println(e);
        });
//        stream2.forEach(e->{
//            System.out.println(e);
//        });
        
//        stream2.mapToInt(e->{
//           return e.length(); 
//        }).forEach(e->{
//            System.out.println(e);
//        });;
//        System.out.println("stream1"+stream1);
//        System.out.println("stream2"+stream2);
        
    }

}
