package models;

public class Customer extends User{
    public Customer(String userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password, "Customer");
    }
    
    @Override
    public String toFileString() {
        return super.toFileString();
    }
    
    public static void main(String[]args){
        int num[]={2,4,6,7,9};
        
        try{
             for(int i=0; i<=num.length;i++)
                 System.out.println(num[i] + " ");
        }catch(Exception e){
            System.out.println("Out of Bounds");
        }
    }
}
