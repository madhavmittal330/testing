class Room
{
	int length; 
	int breadth;
	void getdata(int a,int b) 
	{
	length=a;
	breadth=b;
	}
}
class RoomArea
{
public static void Main(String args[])
{
	int area; 
	Room room1=new Room(); 
	room1.getdata(14,10); 
  	area=room1.length*room1.breadth;
	System.out.println("AREA="+area);
}
}
