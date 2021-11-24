package ch03;

public class TextBlockTest {
    public static void main(String[] args) {

        String textB = """
                Hello
                hi,
                how ru """;
        System.out.println(textB);
        System.out.println(getBlockOfHtml());
    }
    public static String getBlockOfHtml() {  // java 13 부터 제공되는 기능
        return """
                 <html>
                 
                    <body>
                        <span>example text</span>
                        </body>
                    </html>""";
    }
}
