//Shahad almuhizi
//436201525
import java.util.*;
public class TabletComputer extends MobileComputer {
private String type;

public TabletComputer(String b,double s){
super(b,s);
Scanner console=new Scanner(System.in);
System.out.println("Enter the Type:");
type=console.nextLine();}

public String getType(){
return type;}

public void display(){

System.out.println("Type:["+type+"] Operating System Name: ["+getOSname()+"] Operating System Version: ["+getOSversion()+"]");
}}