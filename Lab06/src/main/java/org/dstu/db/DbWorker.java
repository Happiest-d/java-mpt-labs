package org.dstu.db;

import java.sql.*;
import java.util.List;

public class DbWorker {

    public static void saveFromForm(String name, String surname, String middlename, String exam, String result){
        Connection conn = DbConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            st.execute("INSERT INTO student_lab6 (name,surname,middlename,exam,result) " +
                    "VALUES ('"+name+"','"+surname+"','"+middlename+"','"+exam+"','"+result+"') ");
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static boolean getFromDbBySurname(String surname){
        Connection conn = DbConnection.getConnection();
        boolean flag = false;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student_lab6 WHERE surname = '"+surname+"' ");
            while (rs.next()) {
                flag = true;
            }
            rs.close();
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return flag;
    }

//    public static void populateFromFile(String fileName) {
//        List<String[]> strings = CsvReader.readCsvFile(fileName, ";");
//        Connection conn = DbConnection.getConnection();
//        try {
//            Statement cleaner = conn.createStatement();
//            System.out.println(cleaner.executeUpdate("DELETE FROM square"));
//            System.out.println(cleaner.executeUpdate("DELETE FROM rectangle"));
//            PreparedStatement studentSt = conn.prepareStatement(
//                    "INSERT INTO square (color, transparency_level, border_style, side_size, is_big, times_used) " +
//                            "VALUES (?, ?, ?, ?, ?, ?)");
//            PreparedStatement teacherSt = conn.prepareStatement(
//                    "INSERT INTO rectangle (color, transparency_level, border_style, shortSide, longSide, bottomSide) " +
//                            "VALUES (?, ?, ?, ?, ?, ?)");
//
//            for (String[] line: strings) {
//                if (line[0].equals("0")) {
//                    studentSt.setString(1, line[1]);
//                    studentSt.setString(2, line[2]);
//                    studentSt.setString(3, line[3]);
//                    studentSt.setInt(4, Integer.parseInt(line[4]));
//                    studentSt.setBoolean(5, Boolean.parseBoolean(line[5]));
//                    studentSt.setInt(6, Integer.parseInt(line[6]));
//                    studentSt.addBatch();
//                } else {
//                    teacherSt.setString(1, line[1]);
//                    teacherSt.setString(2, line[2]);
//                    teacherSt.setString(3, line[3]);
//                    teacherSt.setInt(4, Integer.parseInt(line[4]));
//                    teacherSt.setInt(5, Integer.parseInt(line[5]));
//                    teacherSt.setString(6, line[6]);
//                    teacherSt.addBatch();
//                }
//            }
//            int[] stRes = studentSt.executeBatch();
//            int[] teacherRes = teacherSt.executeBatch();
//            for (int num: stRes) {
//                System.out.println(num);
//            }
//
//            for (int num: teacherRes) {
//                System.out.println(num);
//            }
//            cleaner.close();
//            studentSt.close();
//            teacherSt.close();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }

//    public static ResultSet getBySurname(String surname) {
//        Connection conn = DbConnection.getConnection();
//        try {
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM student_lab6 WHERE surname =  \"" + surname + "\"");
////            while (rs.next()) {
////                System.out.print(rs.getString("color"));
////                System.out.print(" ");
////                System.out.print(rs.getString("transparency_level"));
////            }
//            rs.close();
//            st.close();
//            return rs;
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }

//    public static void demoQuery2() {
//        Connection conn = DbConnection.getConnection();
//        try {
//            Statement st = conn.createStatement();
//            st.execute("UPDATE square SET border_style='none'");
//            ResultSet rs = st.executeQuery("SELECT * FROM square");
//            while (rs.next()) {
//                System.out.print(rs.getString("color"));
//                System.out.print(" ");
//                System.out.print(rs.getString("transparency_level"));
//                System.out.print(" ");
//                System.out.print(rs.getString("border_style"));
//                System.out.print(" ");
//            }
//            rs.close();
//            st.close();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
}
