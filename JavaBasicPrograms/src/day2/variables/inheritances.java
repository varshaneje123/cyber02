package day2.variables;

public class inheritances {
	class Grandfather{
		Grandfather(){
			System.out.println("Iam class Grandfather Constructor..");
		}
		void myhome() {
			System.out.println("I am home of Grandfather");
		}
	}
		class Father extends Grandfather{
			Father (double d){
				System.out.println("I am class Father constructor....");
			}
			void mycar() {
				System.out.println(" I am car of Father");
			}
		}
		class Child1 extends Father{
			Child1(int i){
				super(12.34);
				System.out.println("I am class Child constructor......");
			}
			void mybike() {
				System.out.println("I am bike of Child");
			}
		}
		public class inheritance6{
			public static void main(String[] args) {
				System.out.println("****************************");
				Child1 c1 = new child1(21);
				c1.myhome();
				c1.mycar();
				c1.mybike();
				System.out.println("****************************");
				Father f1 = c1;
				f1.myhome();
				f1.mycar();
				System.out.println("****************************");
				Grandfather g1 = c1;
				g1.myhome();
				System.out.println("****************************");
				
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
