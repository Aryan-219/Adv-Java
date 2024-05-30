package elfuncs;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppELFunc {
    public static String generateFormatedDate(Timestamp time) {
        return new SimpleDateFormat("d MMM yyyy HH:mm:ss").format(new Date(time.getTime()));
    }
}
