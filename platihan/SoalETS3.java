
package platihan;

/**
 *
 * @author KomangRyan
 */
public class SoalETS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A k1 = new A(0,0);
        B k2 = new B(1,2,3);
        
        k2.show();
        k1.show();
    }
    
}

class A{
    int i, j;
    A(){
        i=0;
        j=0;
    }
    A(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println(" nilai i dan j adalah " + i +" "+ j);
    }
}

class B extends A{
    int k;
    B(){
        i = 0;
        j = 0;
        k = 0;
    }
    B(int a, int b, int c){
        i = a;
        j = b;
        k = c;
    }
    void show(){
        System.out.println(" nilai i j k adalh "+ i +" "+j +" "+k);
    }
}
