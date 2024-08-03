package accessModifiersAndEncapsulation;

public class DefaultSameClassDiffClsSamepkg {
    void show() {
	   System.out.println("accessed in same cls of same pkg");
   }
    public static void main(String[] args) {
    	DefaultSameClassDiffClsSamepkg obj=new DefaultSameClassDiffClsSamepkg();
	  obj.show();
	  DiffClass obj1=new  DiffClass();
	  obj1.display();
	  
    }
    
}
class DiffClass{
	  void display() {
		System.out.println("Accessed in diff cls of same pkg");
	}
}
