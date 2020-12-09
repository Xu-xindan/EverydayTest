class A{
    public A(String str){

    }
}

public class Main {
    public static void main(String[] args) {
        A classa=new A("he");
        A classb=new A("he");
        System.out.println(classa==classb);//false
    }

    public int addAB(int A, int B) {
        if(B!=0){
            int a=A^B;
            int b=(A&B)<<1;
            return addAB(a,b);
        }else{
            return A;
        }
    }
}
