class state{
public static void main(String args[]){
String state="KA";
int vehiclePrise=120000;
switch(state)
{
case "KA":float KARoadTax=0.18f*vehiclePrise;
System.out.println("Road tax on karnatakavehicle is="+KARoadTax);
break;
case "KL":float KLRoadTax=0.2f*vehiclePrise;
System.out.println("Road tax on Keralavehicle is="+KLRoadTax);
break;
case "TN":float TNRoadTax=0.12f*vehiclePrise;
System.out.println("Road tax on Tamilnaduvehicle is="+TNRoadTax);
break;
case "OD":float ODRoadTax=0.13f*vehiclePrise;
System.out.println("Road tax on Odishavehicle is="+ODRoadTax);
break;
case "WB":float WBRoadTax=0.11f*vehiclePrise;
System.out.println("Road tax onWestbengalvehicle is="+WBRoadTax);
break;
case "PB":float PBRoadTax=0.14f*vehiclePrise;
System.out.println("Road tax on Punjabvehicle is="+PBRoadTax);
break;
}
}
}