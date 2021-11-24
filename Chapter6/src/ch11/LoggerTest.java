package ch11;

public class LoggerTest {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getLogger();
        logger.log("log");  // logger 는 레벨을 설정하지 않았기에 가장 높은 레벨인 log 를 따라 ALL 레벨을 출력한다

    }
}
