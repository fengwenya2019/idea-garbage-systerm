package com;

import java.sql.*;

//连接数据库测试
public class DBManager {
    //数据库地址
    private static final String url = "jdbc:mysql://localhost:3306/ljfl?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT";
    private static final String name = "com.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "root";

    private Connection connection = null ;
    private PreparedStatement preparedStatement = null ;//

    private DBManager(String sql){
        try{
            Class.forName(name);
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sql);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void close(){
        try{
            this.connection.close();
            this.preparedStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sql = "SELECT * FROM userinfo";
        DBManager dbManager = new DBManager(sql);  //实例化

        String id,name;

        try{
            ResultSet result = dbManager.preparedStatement.executeQuery(sql);
            while(result.next()){                  //若有数据，就输出
                id = result.getString(1);
                name = result.getString(2);

                //显示出每一行数据
                System.out.println(id + "  " + name);
            }
            result.close();
            dbManager.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
