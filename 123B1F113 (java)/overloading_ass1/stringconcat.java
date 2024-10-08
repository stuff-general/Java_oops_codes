public class stringconcat {


    public String concat(String a, String b) {
        return a + b;
    }


    public String concat(String a, String b, String c) {
        return a + b + c;
    }


    public String concat(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main (String[] args) {
        StringConcat sc = new StringConcat();


        String twoConcat = sc.concat("Hello, ","everyone");
        String threeConcat = sc.concat("I", "am ", "Sharwari!");
        String[] arrayConcat = {"How ", "are ", "all ", "of ", "you ", "today?"};

        System.out.println(twoConcat);
        System.out.println(threeConcat);
        System.out.println(sc.concat(arrayConcat));
    }
}
