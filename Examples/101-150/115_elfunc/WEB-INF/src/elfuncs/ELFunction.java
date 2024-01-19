package elfuncs;

public class ELFunction {
    public static String pro() {
        String[] arr = {"mohan", "ganesh", "rajesh", "sudheer", "mayank", "kamal"};

        String str = "<table border='1'>";

        for(String x : arr) {
            str += ("<tr><td>"+x+"</td></tr>");
        }

        str += "</table>";

        return str;
    }
}