import java.util.Arrays;

/**
 * @author Richie
 */
public class OOP {
    public static void main(String[] args) {
        Phone Samsung = new Phone("Welcome to Samsung",new String[]{"Ali","Abu","Ah Teck"});
        Samsung.printContacts();
        Samsung.displayMessage();
        Samsung.setContacts(new String[]{"Ali", "Abu","Ah Teck","Muthu"});
        Samsung.printContacts();
        Samsung.setMessages("How can I help you?");
        Samsung.displayMessage();
        Samsung.call("Ali");
        Samsung.endCall();
        Samsung.calculate("sum",1,2);
        Samsung.calculate("difference",2,1);
        Samsung.calculate("product",2,5);
        Samsung.calculate("quotient",10,2);
        System.out.println(Samsung.calculate("sum",2,3));

    }
}

class Phone{
    private String messages;
    public String [] contacts;


    public Phone(String messages, String[] contacts) {
        this.messages = messages;
        this.contacts = contacts;
    }


    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String[] getContacts() {
        return contacts;
    }

    public void setContacts(String[] contacts) {
        System.out.println("Updating the contacts as " + Arrays.toString(contacts));
        this.contacts = contacts;
    }

    public static void call(String contact){
        System.out.println("Calling " + contact + "...");
    }

    public static void endCall(){
        System.out.println("Call ended.");
    }


    public void printContacts(){
        System.out.println("The contacts available are : " + Arrays.toString(getContacts()));
    }


    public void displayMessage(){
        System.out.println(getMessages());
    }

    public static int calculate(String operation, int a, int b){
        int sum = 0;
        switch (operation){
            case "sum":
                System.out.print("The sum is ");
                sum += (a+b);
                break;
            case "difference":
                System.out.print("The difference is ");
                sum += (a-b);
                break;
            case "product":
                System.out.print("The product is ");
                sum += (a*b);
                break;
            case "quotient":
                System.out.print("The quotient is ");
                sum += (a/b);
                break;
        }
        System.out.println(sum);
        return sum;
    }


}
