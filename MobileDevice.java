//Shahad almuhizi
//436201525
public abstract class MobileDevice{
protected String brand;
protected double storage;
private OperatingSystem OS;
public MobileDevice(String b,double s){
brand=b;
storage=s;
if (brand.equals("samsung")||brand.equals("lg")||brand.equals("kindle fire")){
OS=new OperatingSystem("Android");
OS.setVersion(8);}
if (brand.equals("iphone")||brand.equals("ipod touch")){
OS=new OperatingSystem("iOS");
OS.setVersion(10);}
if (brand.equals("windows pad")||brand.equals("microsoft tablet pc")){
OS=new OperatingSystem("Windows");
OS.setVersion(8);}}

public String getOSname(){
return OS.getName();}

public String getBrand(){
return brand;}

public int getOSversion(){
return OS.getVersion();}

public abstract void display();}