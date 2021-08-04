package File.Bonus.Problem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class File {
    String university[]=new String[5];
    String course[]=new String[10];
    String student[]=new String[20];


    public void readInput(){
        BufferedReader br = null;
        try{
            br=new BufferedReader(new FileReader("input.txt"));
        }


    }


    public void writeOutput(){
        PrintWriter pw=null;
        try{
            pw=new PrintWriter("output.txt");
        }catch (){

        }


    }
}
