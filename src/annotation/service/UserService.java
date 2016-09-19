package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import annotation.repository.UserRepository;

@Service
public class UserService {

	//第一种方法
//		@Autowired
//		@Qualifier("userRepoitoryImpl")
		
		private UserRepository userRepository;
		//第二种方法
		@Autowired
		public void setUserRepository(@Qualifier("userRepoitoryImpl")UserRepository userRepository) {
			this.userRepository = userRepository;
		}

		public void add(){
			System.out.println("UserService add....");
			userRepository.save();
		}
}
