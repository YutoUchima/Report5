package jp.ac.uryukyu.ie.e245756;

public class Null {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionのエラーが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
