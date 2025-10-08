class ECE
{
			{
				System.out.println("I will run before the jvm loads the main class");
			}
			static int count=0;{
				System.out.println("I will run for each object Creation");
				count++;
			}
			public static void main(String[] args) {
				ECE e=new ECE();
				ECE e1=new ECE();
				System.out.println(count);
		}
	}


