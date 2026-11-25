/*
* Database.java
* Aidan Gonzalez
* SFWE 301, Fall 2026
* The purpose of this program is to define a subsystem in the front end
* that acts like the backend in terms of providing a database in which
* the front end can request and get data.
 */

package sqldatabase;

// Needed for data lookup
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    // This represents the directory in which jbdc will look for related data
    private static String jdbcUrlPrefix = "jdbc:relique:csv:local_database:";

    // All the possible relations that represent the database the front end will need
    private static String USERDETAILS = "UserDetails.csv";
    private static String NOTIFICATIONS = "Notifications.csv";
    private static String APPLICATIONS = "Applications.csv";
    private static String REVIEWEDAPPLICATIONS = "ReviewedApplications.csv";

    // What makes up the scholarships
    private static String SCHOLARSHIPS = "Scholarships.csv"; // name, creator, type, etc
    private static String SCHOLARSHIPRESTRICTIONS = "ScholarshipRestrictions.csv"; // Which year of student can apply?
    private static String RADIOQUESTIONS = "RadioQuestions.csv"; // 4 choices
    private static String TEXTQUESTIONS = "TextQuestions.csv"; // Fill in the blank

    public static boolean
}
