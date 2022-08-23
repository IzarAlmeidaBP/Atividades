
public class ForEach {

	public static void main(String[] args) {
		
		String[] array = new String[] {"Maria","Bob","Alex"};
		
		for( int i = 0; i < array.length;i++) {
			System.out.println(array[i]);
			//for normal
		}
		
		
		System.out.println("--------------------");
		for(String objeto : array) {
			//for each
			System.out.println(objeto);
			
			
		}
		
		
		
	}
	
	

}
