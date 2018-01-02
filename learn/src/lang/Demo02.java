package lang;

/**
 * transient  关键字
 */

public class Demo02 {

    public static void main(String[] args) {



    }

    class User {

        private String loginName;
        private transient String password;

        public User() {
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
