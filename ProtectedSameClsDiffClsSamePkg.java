package accessModifiersAndEncapsulation;

public class ProtectedSameClsDiffClsSamePkg extends Diff{
   protected void dis() {
	   System.out.println("Protected can be accessed in same cls");
   }
 public static void main(String[] args) {
	 ProtectedSameClsDiffClsSamePkg obj=new ProtectedSameClsDiffClsSamePkg();
	 obj.dis();
	 
	 Diff d=new Diff();
	 d.show();
}
}
 
// Diff class 
class Diff  {
	protected void show() {
		System.out.println("Protected can be accessed through diff cls through IS A Relationship");
	}
 }


