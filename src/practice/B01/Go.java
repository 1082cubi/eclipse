package practice.B01;
class Go {
    public static void main(String[] args) {
AA aa =new AA();
aa.gngn(0);
    }
}
class AA {
    void gngn ( int dan) {
        if(!(2<=dan && dan <=9))
        return;
        for(int i=0; i<=9; i++) {
            System.out.printf("%d * %d = %d",dan ,i, dan*i);
        }
    }

}