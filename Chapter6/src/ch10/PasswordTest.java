package ch10;

import ch09.ThrowsException;

public class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        }

        else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자리 이상이여야 합니다.");
        }

        else if (password.matches("[a-zA-Z]+")) { // matches String  안에 메서드
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }

        this.password = password;
    }

    public static void main(String[] args) {

        PasswordTest test = new PasswordTest();

        String password = null;

        try {
            test.setPassword(password);
            System.out.println("오류 없음 1");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abc";

        try {
            test.setPassword(password);
            System.out.println("오류 없음 2");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde";

        try {
            test.setPassword(password);
            System.out.println("오류 없음 3");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde@@";

        try {
            test.setPassword(password);
            System.out.println("오류 없음 4");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
