class Message{
    String text;

    public Message(){
        text="";
    }

    public Message(String text){
        this.text=text;
    }

    
    public void settext(String text){
        this.text=text;
    }

    public String toString(){
        return text;
    }

}

class SMS extends Message{
    private String recipientContactNo;

    public SMS(String text,String recipientContactNo){
        super(text);
        this.recipientContactNo=recipientContactNo;
    }

    public String getrecipientContactNo(){
        return recipientContactNo;
    }

    public void setrecipientContactNo(String recipientContactNo){
        this.recipientContactNo=recipientContactNo;
    }

    public String toString(){
        return "Recipient Contact No: " + recipientContactNo + "\nMessage: " + super.toString();
    }
}

class Email extends Message{
    private String sender;
    private String receiver;
    private String subject;

    public Email(String text, String sender, String receiver, String subject) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

     public String toString() {
        return "Sender: " + sender + "\nReceiver: " + receiver + "\nSubject: " + subject + "\nMessage: " + super.toString();
    }
}

public class Task4{

    // Method to check keyword
    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        if (messageObject.toString().indexOf(keyword, 0) >= 0)
            return true;
        return false;
    }

    // Method to encode message
    public static String encodeMessage(String message) {

        String encoded = "";

        for (int i = 0; i < message.length(); i++) {

            char ch = message.charAt(i);

            if (ch >= 'A' && ch <= 'Y')
                ch++;

            else if (ch == 'Z')
                ch = 'A';

            else if (ch >= 'a' && ch <= 'y')
                ch++;

            else if (ch == 'z')
                ch = 'a';

            encoded += ch;
        }

        return encoded;
    }

    public static void main(String[] args){

    
        Email e1 = new Email("This is Java","teacher@gmail.com","student@gmail.com","OOP Assignment");

        
        SMS s1 = new SMS("Welcome to Java Programming","03001234567");

        
        System.out.println(e1);
        System.out.println();

        System.out.println(s1);
        System.out.println();

        // Test keyword
        System.out.println("Email contains 'Java': "
                + ContainsKeyword(e1, "Java"));

        System.out.println("SMS contains 'Python': "
                + ContainsKeyword(s1, "Python"));

        // Encode message
        String message = "This is Java";

        System.out.println("\nOriginal Message: " + message);
        System.out.println("Encoded Message: " + encodeMessage(message));
    }
}