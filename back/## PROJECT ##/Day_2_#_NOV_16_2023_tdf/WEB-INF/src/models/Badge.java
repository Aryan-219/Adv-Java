package models;

import java.util.ArrayList;
import java.sql.*;

public class Badge {
    // ############### Properties #############
    private Integer badgeId;
    private String name;

    // ############### Constants #############
    public static final Badge SILVER = new Badge(1, "Silver");
    public static final Badge GOLD = new Badge(2, "Gold");
    public static final Badge PLATINUM = new Badge(3, "Platinum");

    // ############### Constructors #############
    public Badge() {
    
    }

    public Badge(Integer badgeId, String name) {
        this.badgeId = badgeId;
        this.name = name;
    }

    // ############### Other Methods #############
    public static ArrayList<Badge> collectAllBadges() {
        ArrayList<Badge> badges = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdfdb?user=root&password=1234");

            String query = "select * from badges";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                badges.add(new Badge(rs.getInt(1), rs.getString(2)));
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return badges;
    }

    // ############### Getter-Setters #############
    public Integer getBadgeId() {
        return badgeId;
    }
    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
