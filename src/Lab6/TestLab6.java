package Lab6;
import java.util.Arrays;
public class TestLab6 {
    public static void main(String[] agrs){
        Student student = new Student(8,"Tom");
        student.InsertSort();
        System.out.println(Arrays.toString(student.IDNumber));

        Student[] spisok = new Student[6];
        spisok[0]=new Student(54,"Katya"); //p
        spisok[1]=new Student(76,"Dasha");
        spisok[2]=new Student(23,"Max");
        spisok[3]=new Student(12,"Olga");
        spisok[4]=new Student(90,"Natali");
        spisok[5]=new Student(28,"Sasha");

        int[] x = {39,39,999,11,0,-2};
        String[] strs = {"sdfsdf","3333","aaaa"};
        Arrays.sort(x);
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        Arrays.sort(spisok, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(spisok));

        Student[] spisok2 = new Student[4];
        spisok2[0]=new Student(56,"Kirill");
        spisok2[1]=new Student(32,"Anna");
        spisok2[2]=new Student(97,"Oleg");
        spisok2[3]=new Student(9,"Danila");

        Student[] allspisok = new Student[10];

        //System.arraycopy(spisok,0,allspisok,0,spisok.length);
        //System.arraycopy(spisok2,0,allspisok,spisok.length,spisok2.length);
        //Arrays.sort(allspisok,new SortingStudentsByGPA());
        //student.mergeArrays(spisok, spisok2);
        Arrays.sort(spisok2, new SortingStudentsByGPA());
        Arrays.sort(spisok2, new SortingStudentsByGPA());
        student.mergeArrays(spisok, spisok2);
        //System.out.println(student.mergeArrays(spisok, spisok2););


    }
}
