class arrayl{
	private int arr[];
	private int size;
	private int index;
	private int osize;
	arrayl(int size){
		arr=new int[size];
		this.size=size;
		this.osize=osize;
		index=-1;
	}
	public void add(int data) {
		if(index==size-1) {
				int temp[]=arr;
				this.size=this.size*2;
				arr=new int[size];
				for(int i=0;i<=index;i++)
					arr[i]=temp[i];
				index++;
				arr[index]=data;

		}
		else
		{
			index++;
			arr[index]=data;
		}
	}
	public void delete(int l) {
		int pos=0;
		for(int i=0;i<size;i++)
			if(i==l)
				pos=i;
		for(int i=pos+1;i<size;i++)
			arr[i-1]=arr[i];
	    index--;
			
	}
	public void delete_all() {
		if(index==-1)
	traverse();
		else if(size>this.osize) {
			index=-1;
		arr=new int[this.osize];
		traverse();
		}
	}
	public void traverse()
	{
	if(index == -1) System.out.println("ArrayList is empty");
	else
	{
	for(int i = 0; i <= index; i++) System.out.println(arr[i]);
	}
	}

}
public class Dynamic_array {
	public static void main(String[] ar) {
		arrayl l=new arrayl(5);
		for(int i=0;i<5;i++)
			l.add(i);
		l.add(45);
		l.delete(2);
		l.traverse();
		l.delete_all();
		//l.traverse();
	}
}
