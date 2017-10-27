
public class Games {
	public  int add(int a,int b){
		return a/b;
	}
	public String add(String name){
		return name ;
	}
	public static void main(String []args){
		Games obj=new Games();
		obj.add(2332,322);
		obj.add("fdaf");
		System.out.println(obj.add(20,2));
		}
	}