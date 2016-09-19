package collaccions;



import java.util.Map;

import test.Car;
public class NewParson {
		private String name;
		private int age;
		private Map<String,Car> cars;
		
		
		public NewParson(){super();}
		

		public NewParson(String name, int age, Map<String, Car> cars) {
			super();
			this.name = name;
			this.age = age;
			this.cars = cars;
		}


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		

		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}


		public Map<String, Car> getCars() {
			return cars;
		}


		public void setCars(Map<String, Car> cars) {
			this.cars = cars;
		}


		@Override
		public String toString() {
			return "NewParson [name=" + name + ", age=" + age + ", cars="
					+ cars + "]";
		}




		


		
		
}
