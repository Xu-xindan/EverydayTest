import java.util.Scanner;

public class moneyChange {
    public static String[] nums={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            double money = sc.nextDouble();
            StringBuffer res = new StringBuffer();
            int yi = (int) money / 100000000;
            int wan = (int) (money - yi * 100000000) / 10000;
            int ge = (int) (money % 10000);
            System.out.print("人民币");
            if (yi != 0) {
                res.append(change(yi) + "亿");
            }
            if (wan != 0) {
                res.append(change(wan) + "万");
            }
            if (ge != 0) {
                res.append(change(ge) + "元");
            }
            int xiaoshu = (int) ((money - yi * 100000000 - wan * 10000-ge+0.001)*100);
            int jiao = xiaoshu / 10;
            int fen = xiaoshu % 10;
            if (jiao == 0 && fen == 0) {
                res.append("整");
            } else if (jiao == 0 && fen != 0) {
                res.append("零角" + nums[fen] + "分");
            } else if (jiao != 0 && fen == 0) {
                res.append(nums[jiao] + "角");
            } else {
                res.append(nums[jiao] + "角" + nums[fen] + "分");
            }
            System.out.println(res.toString());
        }
    }

    private static String change(int a) {
        int qian=a/1000;
        int bai=(a/100)%10;
        int shi=(a/10)%10;
        int ge=a%10;
        StringBuffer sb=new StringBuffer();
        if(qian!=0){
            sb.append(nums[qian]+"仟");
        }
        if(bai!=0){
            sb.append(nums[bai]+"佰");
        }else if(qian!=0&&bai==0&&(shi!=0||ge!=0)){
            sb.append("零");
        }
        if(shi!=0&shi!=1){
            sb.append(nums[shi]+"拾");
        }else if(bai!=0&&ge!=0){
            sb.append("零");
        }
        if(shi==1&&qian!=0&&ge!=0){
            sb.append("拾");
        }
        if(ge!=0){
            sb.append(nums[ge]);
        }
        return sb.toString();
    }
}
