package az.company.task.jdbc;

import java.sql.*;

public class JdbcHomeWork {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/dbtest";
        Connection connection = DriverManager.getConnection(url, "postgres", "123SsAaBgcd00!");

        Statement statement = connection.createStatement();

        // --1
//        PreparedStatement ps = connection.prepareStatement("create table myschema.deneme(" +
//                "id int primary key not null," +
//                "ad varchar(20) not null," +
//                "soyad varchar(20) not null" +
//                ")");
//        System.out.println(ps.execute());


        // --2
//        PreparedStatement ps = connection.prepareStatement("insert into myschema.deneme values" +
//                "(1,'asd','asdov')," +
//                "(2,'zxc','zxcov')," +
//                "(3,'cvb','cvbov')");
//        System.out.println(ps.executeUpdate());


        // --3
        PreparedStatement ps = connection.prepareStatement("select * from myschema.deneme");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("ad");
            String surname = rs.getString("soyad");
            System.out.println(id+" "+name+" "+surname);

        }


        // --4

//        PreparedStatement ps = connection.prepareStatement("update myschema.deneme set ad='ZXC' where ad='zxc'");

//        PreparedStatement ps = connection.prepareStatement("update myschema.deneme set ad=? where ad=?");
//        ps4.setString(1,"cvb");
//        ps4.setString(2,"CVB");

//        System.out.println(ps.executeUpdate());


        // --5
//        PreparedStatement ps = connection.prepareStatement("delete from myschema.deneme where id=1");
//        System.out.println(ps.executeUpdate());

        ps.close();
        statement.close();
        connection.close();
    }

}
