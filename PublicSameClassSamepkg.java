package accessModifiersAndEncapsulation;

public class PublicSameClassSamepkg {
	public static void main(String[] args) {
		PublicSameClassSamepkg obj=new PublicSameClassSamepkg();
		obj.display();
	}	
    public void display()
    {
    	System.out.println("Accessing in same cls and same package");
    }

}