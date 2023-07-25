package play2;

import java.sql.Connection;
import java.sql.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlayApp {
    public static void main(String[] args) {
      
    }

		//static final String DB_URL = "jdbc:mysql://localhost/school";
		//static final String USER = "root";
		//static final String PASS = "Chuchomysql_01";

		//public static void main(String[] args) throws Exception {

			// static final String QUERY= "//"

			//Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			//return DriverManager.getConnection(DB_URL, USER, PASS);
			

	private static Connection getConnection() throws SQLException {
    // Implement the code to establish a MySQL database connection here
    String DB_URL = "jdbc:mysql://localhost/school";
    String USER = "root";
    String PASS = "Chuchomysql_01";
    return DriverManager.getConnection(DB_URL, USER, PASS);
}
    public static void addParent(Parent parent) {
    
    }
    public static void addStudent(Student student) {
     
    }

    public static void addProgram(Program program) {
        
    }

    public static void addPayment(Payment payment) {
     
    }

    public static List<Payment> getPaymentStatement(int studentId) {
        List<Payment> paymentList = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "SELECT * FROM payments WHERE student_id = ?")) {

            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int paymentId = rs.getInt("id");
                int parentId = rs.getInt("parent_id");
                int programId = rs.getInt("program_id");
                BigDecimal paymentAmount = rs.getBigDecimal("payment_amount");
                Date paymentMonth = rs.getDate("payment_month");

                Parent parent = getParentById(parentId);
                Student student = getStudentById(studentId);
                Program program = getProgramById(programId);

                Payment payment = new Payment();
                payment.setId(paymentId);
                payment.setParent(parent);
                payment.setStudent(student);
                payment.setProgram(program);
                payment.setPaymentAmount(paymentAmount);
                payment.setPaymentMonth(paymentMonth);

                paymentList.add(payment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return paymentList;
    }

    private static Parent getParentById(int parentId) {
        Parent parent = null;

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "SELECT * FROM parents WHERE id = ?")) {

            pstmt.setInt(1, parentId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String parentName = rs.getString("parent_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                parent = new Parent();
                parent.setId(parentId);
                parent.setParentName(parentName);
                parent.setEmail(email);
                parent.setPhone(phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return parent;
    }

    private static Student getStudentById(int studentId) {
        Student student = null;

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "SELECT * FROM students WHERE id = ?")) {

            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String studentName = rs.getString("student_name");
                int age = rs.getInt("age");
                int parentId = rs.getInt("parent_id");

                student = new Student();
                student.setId(studentId);
                student.setStudentName(studentName);
                student.setAge(age);

                // Fetch the parent details for the student
                Parent parent = getParentById(parentId);
                student.setParent(parent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }

    private static Program getProgramById(int programId) {
        Program program = null;

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "SELECT * FROM programs WHERE id = ?")) {

            pstmt.setInt(1, programId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String programName = rs.getString("program_name");
                BigDecimal cost = rs.getBigDecimal("cost");

                program = new Program();
                program.setId(programId);
                program.setProgramName(programName);
                program.setCost(cost);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return program;
    }

    public static void sendPaymentStatementByEmail(int studentId) {
      
    }

    public static void generatePrintablePaymentStatement(int studentId) {
    
    }
}
