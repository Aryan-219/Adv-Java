package elfuncs;

import javax.servlet.jsp.PageContext;

public class ELFunction {
    static String[] cities = {"Jabalpur", "Bhopal", "Jaipur", "Udaypur", "Sagar", "Satna"};

    public static void showData(PageContext pageContext, Integer nextIndex) {
        pageContext.setAttribute("next", cities[nextIndex]);
    }
}