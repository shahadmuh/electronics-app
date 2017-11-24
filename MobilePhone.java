//Shahad almuhizi
//436201525
import java.util.*;
public class MobilePhone extends MobileDevice {
private int nOfc;
private Contact[] contactList;
public MobilePhone(String b,double s){
super(b,s);
nOfc=0;
if (brand.equals("samsung")||brand.equals("lg"))
contactList=new Contact[50];
if (brand.equals("iphone"))
contactList=new Contact[60];
if (brand.equals("windows pad"))
contactList=new Contact[40];}

public boolean addContact(Contact c){
if (nOfc<contactList.length){
contactList[nOfc++]=new Contact (c.getcName(),c.getNum());
return true;}
return false;}

public boolean deleteContact(Contact c){
int index=-1;
if (nOfc>0){
index=Search(c);
for (int i=index;i<nOfc;i++)
contactList[i]=contactList[i+1];
contactList[--nOfc]=null;
return true;}
return false;}

public int Search(Contact c){
for (int i=0;i<nOfc;i++)
if (contactList[i].getcName().equals(c.getcName()))
if (contactList[i].getNum()==c.getNum())
return i;
return -1;}

public void modify(String n){
Scanner console=new Scanner(System.in);
boolean found=false;
for (int i=0;i<nOfc;i++)
if (contactList[i].getcName().equals(n)){
System.out.println("Enter the new mobile number: ");
int num=console.nextInt();
contactList[i].setmNum(num);
found=true;}
else
found=false;
if (found==false)
System.out.println("Sorry the contact was not found!");}

public Contact getContact(int index){
Contact cont=new Contact(contactList[index].getcName(),contactList[index].getNum());
return cont;}

public void display(){
String s="";
for (int x=0;x<nOfc;x++)
s+=contactList[x].toString();
System.out.println("Brand: "+brand+"\tThe Storage: "+storage+"\tThe operatig System: "+getOSname()+"\tVersion: "+getOSversion()+"\tcontacts are: "+s);}
}