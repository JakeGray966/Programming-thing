
package program;


public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    toLowerCase();
    toUpperCase();
    equals();
    equalsIgnoreCase();
    charAt();
    length(); 
    // METHOD(S) MUST BE STATED IN HERE
    
    }
 public static void toLowerCase(){
 String s1 = "HELLO THIS IS MEANT TO BE UPPTER CASE";
 String s2 = s1.toLowerCase();
     System.out.println(s2);
 }   
 public static void toUpperCase(){
 String s1 = "yeetus this is meant ot be lower case";
 String s2 = s1.toUpperCase();
    System.out.println(s2);
} 
public static void equals(){
String s1= "Deji";

if (s1.equals("Deji")){
    System.out.println("Login is all gud");
}else{
    System.out.println("Login aint good mate");
}
}
public static void equalsIgnoreCase(){
String s1="Yee";
String s2="Nein";

if(s1.equalsIgnoreCase("Yee")){
    System.out.println("Selection worké");
} else if (s1.equalsIgnoreCase("Nein")){
    System.out.println("Selecction didnt go right");
} else {
    System.out.println("Something's scuffed");
}
}
public static void charAt(){
String firstName="Deji";
String surname = "Mon";
char initial = firstName.charAt(0);
    System.out.println("Privyet, Epic" + initial + "" + surname);
    
}
public static void length(){

String password = "Chukavin SVCh-93";
    System.out.println("Bro is your pass long enough? Has to be at least 10 bro");
    System.out.println(password);
if (password.length() >10){
    System.out.println("Congrats i guess");
}else{
    System.out.println("No, for gods sake i said at least 10");
 
}
}
   
}
