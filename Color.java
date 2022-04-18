package Bridgelabz;

import java.util.ArrayList;

//Example: ArrayList.addAll(Collection<? extends E> c) Method

public class Color {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<String>(4);
        color_list.add("White");
        color_list.add("Red");
        color_list.add("Black");
        color_list.add("Green");
        color_list.add("Orange");
        System.out.println("****color list ****");
        for (int i = 0; i<4;i++)
        {
            System.out.println(color_list.get(i).toString());
        }
        ArrayList<String>Sample = new ArrayList<String>(3);
        Sample.add("Yellow");
        Sample.add("Blue");
        Sample.add("Violet");
        color_list.addAll(Sample);
        System.out.println("New size of list :"+color_list.size());
        System.out.println("**** color list ****");
        for (int i=0;i<8 ;i++)
        {
            System.out.println(color_list.get(i).toString());
        }
    }
}
