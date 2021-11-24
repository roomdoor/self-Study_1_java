package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    Logger logger = Logger.getLogger("my logger"/* identifier 를 String 으로 줌 일종의 식별자 */); // Logger 객체  항상 똑같은 인스턴스 가져올 수 있음 일종의 싱글톤 패턴
    private static MyLogger Instance = new MyLogger();  // 위에서  new 할 수 없음


    public static final String errorLog = "log.txt";            // 3개의 로그 파일 생성
    public static final String warningLog = "warning.txt";
    public static final String fineLog = "fine.txt";

    private FileHandler logFile = null;                         // level 별로 어떻게 찍히는지 보려고 만득서
    private FileHandler warningFile = null;
    private FileHandler fineFile = null;

    private MyLogger() {
        try {
            logFile = new FileHandler(errorLog/* 파일 이름을 String 을 매개변수로 */, true);
            warningFile = new FileHandler(warningLog, true/* append 해서 찍으라는것 ????????*/);
            fineFile = new FileHandler(fineLog, true);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        logFile.setFormatter(new SimpleFormatter());
        warningFile.setFormatter(new SimpleFormatter());
        fineFile.setFormatter(new SimpleFormatter());

        logger.setLevel(Level.ALL);          // 전부 다 찍기 log 레벨 설정 (severe, warning, info, config, fine, finer, finest)
        fineFile.setLevel(Level.FINE);       // fine 부터 찍기
        warningFile.setLevel(Level.WARNING); // warning 부터 찍기

        logger.addHandler(logFile);         // 지금 만든 file 핸들러 추가
        logger.addHandler(fineFile);
        logger.addHandler(warningFile);

    }

    public static MyLogger getLogger() {  // 싱글톤 패턴에 대한 이야기
        return Instance;
    }

    public void log(String msg) {

        logger.finest(msg);
        logger.finer(msg);
        logger.fine(msg);
        logger.config(msg);
        logger.warning(msg);
        logger.severe(msg);

    }

    public void fine(String msg) {
        logger.fine(msg);
    }

    public void warning(String msg) {
        logger.warning(msg);
    }

}


