//Shahad almuhizi
//436201525
public class portableDevice{
private int numOfDevices;
private MobileDevice[] deviceList;

public portableDevice(){
numOfDevices=0;
deviceList=new MobileDevice[100];}

public boolean addDevice(MobileDevice md){
if (numOfDevices<deviceList.length){
deviceList[numOfDevices++]=md;
return true;}
return false;}

public int CountMobilePhone(String b){
int counter=0;
for (int i=0;i<numOfDevices;i++)
if (deviceList[i] instanceof MobilePhone)
if (deviceList[i].getBrand().equals(b))
counter++;
return counter;}

public MobileDevice getDevice(int index){
if (index<numOfDevices)
return deviceList[index];
return null;}

public MobileDevice[] getDevicelist(){
return deviceList;}

public void show(){
for (int i=0;i<numOfDevices;i++)
if (deviceList[i] instanceof TabletComputer)
System.out.println("The brand is: "+deviceList[i].getBrand() +"\tThe type is: "+(((TabletComputer)deviceList[i]).getType()));}
}