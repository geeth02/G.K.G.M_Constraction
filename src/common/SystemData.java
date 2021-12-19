package common;
public class SystemData {
      private static String currentUser;
      private static String employee;
      private  static String accountCode;

    public static void setAccountCode(String accountCode) {
        SystemData.accountCode = accountCode;
    }

    public static String getAccountCode() {
        return accountCode;
    }
      
      public static String getCurrentUser(){
          return currentUser;
      }
      public  static void setCurrentUser(String aCurrentUser){
      currentUser=aCurrentUser;
      }   
         public  static void setUEmployee (String employee){
      SystemData.employee=employee;
      }
       public static String getemployee(){
          return employee;
      }
}

