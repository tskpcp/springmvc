package cyele;

public class Car {
		public Car(){
			System.out.println("Car is Constructor....");
		}
		private String brand;
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			System.out.println("setBrand...");
			this.brand = brand;
		}
		
		public void init(){
			System.out.println("init...");
		}
		public void destroy(){
			System.out.println("destroy...");
		}
		@Override
		public String toString() {
			return "Car [brand=" + brand + "]";
		}
		
}	
