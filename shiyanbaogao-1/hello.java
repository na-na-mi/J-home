import java.util.*;
class Datas{
    public int arrs[]=new int[3];
    void setArrs(int[] x){
        arrs=x;
    }
    int sort(){
        int temp;
        for(int i = 0;i < arrs.length - 1;i++) {//数组遍历次数
            for(int j = 0;j < arrs.length - 1 - i;j++) {//第i次遍历的交换次数
                if(arrs[j] > arrs[j + 1]) {
                    temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
        }
        return 0;
    }
    void Look(){
        for(int i=0;i<arrs.length;i++)System.out.printf("%d ",arrs[i]);
    }
    int search(int number){
        for(int i=0;i<arrs.length;i++){
            if(number==arrs[i])return i;
        }
        return -1;
    }
}
public class hello {
    public static void main(String args[]){
        int x[]=new int[10];
        int k;
        Scanner reader=new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            k=reader.nextInt();
            x[i]=k;
        }
        Datas D=new Datas();
        D.setArrs(x);
        D.sort();
        D.Look();
        System.out.println("");
        System.out.println("请输入一个数字:");
        k=reader.nextInt();
        int result=D.search(k);
        reader.close();
        if(result!=-1){
            System.out.printf("查询成功!下标为:%d\n",result);
        }
        else {
            System.out.println("数组中没有这个数!");
        }
    }
}
