//Shahad Almuhizi
//43201525
import java.util.*;
public class TestClass {
static Scanner console=new Scanner (System.in);
public static void main (String[] args){
boolean add=false;
MobileDevice[] obj=new MobileDevice[6];

System.out.println("Enter The MobilePhone's Storage for Samsung brand:");
double s2=console.nextDouble();
MobilePhone m=new MobilePhone("samsung",s2);
obj[0]=m;
System.out.println("Enter The MobileComputer's Storage for Samsung brand:");
double s3=console.nextDouble();
MobilePhone m1=new MobilePhone("samsung",s3);
obj[1]=m1;
System.out.println("Enter The MobileComputer's Storage for LG brand:");
double s4=console.nextDouble();
MobilePhone m2=new MobilePhone("lg",s4);
obj[2]=m2;
System.out.println("Enter The MobileComputer's Storage for Iphone brand:");
double s5=console.nextDouble();
MobilePhone m3=new MobilePhone("iphone",s5);
obj[3]=m3;

for (int f=4;f<6;f++){
System.out.println("Enter The MobileComputer's Brand:");
String b0=console.next();
b0=b0.toLowerCase();
System.out.println("Enter The MobileComputer's Storage:");
double s=console.nextDouble();
MobileComputer ob2=new TabletComputer(b0,s);
obj[f]=ob2;}

System.out.println("*********************");

for (int i=0;i<obj.length;i++)
if (obj[i] instanceof MobilePhone){

System.out.println("Enter the contact's Name you want to add:");
console.nextLine();
String name1=console.nextLine();
System.out.println("Enter the contact's Number you want to add:");
int num=console.nextInt();
Contact c=new Contact(name1,num);
((MobilePhone)obj[i]).addContact(c);}

portableDevice p=new portableDevice();
for (int s=0;s<obj.length;s++)
add=p.addDevice(obj[s]);
if (add==true)
System.out.println("The addition was successful");
else
System.out.println("The addition was not successful");
System.out.println("*********************");

for (int w=0;w<obj.length;w++)
obj[w].display();

System.out.println("Enter the index Of the Mobile Device:");
int index=console.nextInt();
System.out.println("The MobileDevice based on "+index+" is:");
MobileDevice objec=p.getDevice(index);
objec.display();
System.out.println("*********************");
System.out.println("Enter The Mobile Phone's brand to count the number of mobile phone:");
String br=console.next();
br=br.toLowerCase();
int count=p.CountMobilePhone(br);
System.out.println("The total number of available MobilePhone the brand is: "+count);
System.out.println("*********************");
System.out.println("The list of Mobile computer's Brand and Type: ");
p.show();
}}