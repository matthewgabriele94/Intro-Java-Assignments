public class Dog {
        private int age;
        private String owner;
        private String breed;
        
    	public Dog() {
    		
    	}
    	
        //Part 1 Problem 2.a
    	public Dog(int age, String owner, String breed) throws IllegalArgumentException{
    		this();
    		this.age = age;
    		this.owner = owner;
    		this.breed = breed;
    		if(age < 0) {
    			throw new IllegalArgumentException("Age must be nonnegative.");
    		}
    	}

    	
    	//Part 1 Problem 2.b
    	public static boolean hasSameOwner(Dog d1, Dog d2) {
    		boolean sameOwner = false; 
    		if(d1.owner == d2.owner) {
    			sameOwner = true;
    		}
    		return sameOwner;
    	}
    	
    	//Part 1 Problem 2.c
    	public static double avgAge(Dog[] dogs) {
    		double sum = 0, count = 0;
    		for(int i = 0; i < dogs.length; i++) {
    			sum += dogs[i].age;
    			count++;
    		}
    		double avgAge = sum / count;
    		return avgAge;
    	}
    	
    	//Part 1 Problem 2.d
    	public int getAge() {
			return this.age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getBreed() {
			return this.breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}
		
		//Part 1 Problem 2.e
		public String toString() {
			String returnString = this.breed + ": Owner: " + this.owner + ", Age: " 
					+ Integer.toString(this.age);
			return returnString;
		}
		
        //Main
        public static void main(String[] args) {
                
                Dog[] dogs = new Dog[5];
                dogs[0] = new Dog(5, "Stephen Colbert", "Boxer");
                dogs[1] = new Dog(7, "Graham Norton", "Golden Retriever");
                dogs[2] = new Dog(3, "Stephen Colbert", "Corgi");
                dogs[3] = new Dog(11, "John Oliver", "Dachsund");
                dogs[4] = new Dog(9, "Jimmy Fallon", "Shiba Inu");
                
                //Below is code I used to confirm that Problems 2.b-e were implemented correctly in the code above
                
                //Part 1 Problem 2.b Test
                boolean hasSameOwnerTest1 = hasSameOwner(dogs[0], dogs[1]);
                boolean hasSameOwnerTest2 = hasSameOwner(dogs[0], dogs[2]);
                
                System.out.println("Part b Test 1: Do the first and second dog objects in the array have the same owner?\n" + hasSameOwnerTest1);
                System.out.println("Part b Test 2: Do the first and third dog objects in the array have the same owner?\n" + hasSameOwnerTest2);
                System.out.println();
                
                //Part 1 Problem 2.c Test
                double avgAgeTest = avgAge(dogs);
                System.out.println("Part c Test: The average age of dogs in the array is: " + avgAgeTest);
                System.out.println();
                
                //Part 1 Problem 2.d Test
                Dog dogSGTest = new Dog();
                int dogSGTestAge1 = dogSGTest.getAge();
                String dogSGTestOwner1 = dogSGTest.getOwner();
                String dogSGTestBreed1 = dogSGTest.getBreed();                
                System.out.println("Part d Test:");
                System.out.println("Initially, the dog's age is " + dogSGTestAge1 + " and its owner is " + 
                		dogSGTestOwner1 + " and its breed is " + dogSGTestBreed1);
                dogSGTest.setAge(5);
                dogSGTest.setOwner("Jimmy Kimmel");
                dogSGTest.setBreed("Poodle");
                int dogSGTestAge2 = dogSGTest.getAge();
                String dogSGTestOwner2 = dogSGTest.getOwner();
                String dogSGTestBreed2 = dogSGTest.getBreed();                
                System.out.println("Now, the dog's age is " + dogSGTestAge2 + " and its owner is " + 
                		dogSGTestOwner2 + " and its breed is " + dogSGTestBreed2);
                System.out.println();
                
                //Part 1 Problem 2.e Test
                String toStringTest = dogs[1].toString();
                System.out.println("Part e test: \n" + toStringTest);
                System.out.println();
                
                //Below is code where I implement Problem 2.f and test to confirm I've implemented it correctly
                
                //Part 1 Problem 2.f
                Dog dexterDog = new Dog(8, "Dexter Morgan", "Corgi");
                
                //Part 1 Problem 2.f Test
                String dexterDogTest = dexterDog.toString();
                System.out.println("Part f test: \n" + dexterDogTest);
                
        }

		
}