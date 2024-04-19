
public class JosephRingText {
    public static void main(String[] args) {
        // 定义公鸡数量的循环范围
        int x;
        for(x=0;x<=20;x++){
            // 定义母鸡数量的循环范围
            int y;
            for(y=0;y<=33;y++){
                // 计算小鸡的数量
                int z = 100 - x - y;
                // 判断是否满足条件：公鸡、母鸡、小鸡的总价为100文钱，且数量之和为100
                if(x*5 + y*3 + z/3 == 100 && x+y+z == 100){
                    System.out.println("公鸡" + x + "只，母鸡" + y + "只，小鸡" + z + "只。");
                }
            }
        }
    }
}
