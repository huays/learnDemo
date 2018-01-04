package lang;

import java.io.*;

/**
 * transient  关键字
 */

public class Demo02 {

    public static void main(String[] args) {

        User user = new User("huays", "h123456");
        System.out.println("Before serializable : loginName :" + user.loginName + ", password :" + user.password);

        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("/Users/huays/work/javalearn/learnDemo/learn/src/lang/test.txt"));
            os.writeObject(user);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream("/Users/huays/work/javalearn/learnDemo/learn/src/lang/test.txt"));
            User u = (User) is.readObject();
            System.out.println("After serializable : loginName :" + u.loginName + ", password :" + u.password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    static class User implements Serializable {

        private String loginName;
        private transient String password;

        public User() {
        }

        public User(String loginName, String password) {
            this.loginName = loginName;
            this.password = password;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

}
