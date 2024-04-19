import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class YearJudgement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
         int year = sc.nextInt();
         if(year >= 1900 && year <= 10000){
             if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                 System.out.println("该年份是闰年");
             }else {
                 System.out.println("该年份是平年");
             }
         }else{
             System.out.println("老登，你输入错了");
         }
         sc.close();
    }
}
