package Hackerrank;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class JavaSort {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int num=Integer.parseInt(sn.nextLine());
        List<Student> s=new ArrayList<>();
        for(int i=0; i<num; i++){
            String lst[]=sn.nextLine().split(" ");
            s.add(new Student(Integer.parseInt(lst[0]), lst[1], Double.parseDouble(lst[2])));
        }
        

       

       Comparator<Student> com=new Comparator<Student>() {

           
           public int compare(Student o1, Student o2) {
              if(o1.gpa<o2.gpa){
                  return 1;
              }
              else if(o1.gpa==o2.gpa){
                int cha1=o1.name.toLowerCase().charAt(0);
                int cha2=o2.name.toLowerCase().charAt(0);
                if(cha2<cha1){
                    return 1;

                }
                
            }
            else if(o1.name.toLowerCase().charAt(0)==o2.name.toLowerCase().charAt(0)){
                if(o1.id<o2.id){
                    return 1;
                }
                
        
            }
      return -1;
            
        }
             
             
           
       
    
    };
    Collections.sort(s,com);

        for(Student stu:s){
            System.out.println(stu);
        }
    }
    
    
}

class Student{
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name;
    }

    
}