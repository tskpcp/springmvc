package factoryBean;

import org.springframework.beans.factory.FactoryBean;
/*
 * 自定义FactoryBean，需要实现FactoryBean接口
 */
public class CarFactoryBean implements FactoryBean<Car> {
	private  String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//返回bean的对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand,50000);
	}
	//返回bean的类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
