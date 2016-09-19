package annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import annotation.TestObject;

//@Repository("userRepository")
@Repository
public class UserRepoitoryImpl implements UserRepository {
	@Autowired
	private TestObject testObject;
	@Override
	public void save() {
		System.out.println("UserRepoitoryImpl save .....");
		System.out.println(testObject);
	}

}
