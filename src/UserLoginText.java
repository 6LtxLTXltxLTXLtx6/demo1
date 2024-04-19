import jdk.nashorn.internal.ir.Flags;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class UserLoginText {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("账户:");
            String userName = sc.next();
            if("ltx".equals(userName)){
                while (flag){
                    System.out.println("密码");
                    String password = sc.next();
                    if ("111".equals(password)){
                        System.out.println("登陆成功，欢迎" + userName);
                        flag = false;
                    }else{
                        System.out.println("输入密码有误，请重新输入");
                    }
                }
            }else{
                System.out.println("输入账户名有误,请重新输入");
            }
        }
    }
}
