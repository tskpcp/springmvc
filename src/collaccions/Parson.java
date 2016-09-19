package collaccions;

import java.util.List;

import test.Car;
public class Parson {
		private String name;
		private int age;
		private List<Car> cars;
		
		
		public Parson(){super();}
		
		
	

		public Parson(String name, int age, List<Car> cars) {
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




		public List<Car> getCars() {
			return cars;
		}




		public void setCars(List<Car> cars) {
			this.cars = cars;
		}




		@Override
		public String toString() {
			return "Parson [name=" + name + ", age=" + age + ", cars=" + cars
					+ "]";
		}


		
		
}
