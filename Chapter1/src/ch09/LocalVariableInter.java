package ch09;

public class LocalVariableInter {
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "test";  // var 알아서 변수 찾아서 지정해줌
        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        str = "hello";
        //str = 834;// 위에서 이미 str 을 string 으로 잡혀서 도중에 바꾸지 못함
    }
}
