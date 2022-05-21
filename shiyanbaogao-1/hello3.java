import java.util.Random;

class Rdm{
    String str;
    String getNumber(int n){
        this.str="";
        Random rand=new Random();
        for(int i=0;i<n;i++){
            str=str+(""+ran.nextInt(0,10));
        }
        return str;
    }
    String getChar(int n){
        this.str="";
        Random rand=new Random();
        for(int i=0;i<n;i++){
            str=str+(""+(char)ran.nextInt(97,97+26));
        }
        return str;
    }
    String getMix(int n){
        this.str="";
        Random rand=new Random();
        for(int i=0;i<n;i++){
            if(rand.nextInt(1,3)==1){
                str=str+(""+rand.nextInt(0,10));
            }
            else{ 
                str=str+(""+(char)rand.nextInt(97,97+26));
            }
        }
        return str;
    }
}
public class hello3 {
    public static void main(String args[]){
        Rdm r=new Rdm();
        System.out.println(r.getNumber(10));
        System.out.println(r.getChar(10));
        System.out.println(r.getMix(10));
    }
}
