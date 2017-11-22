/**                       MainController.java
 *作者：
 *创建日期：2017年11月16日
 *修改订者：
 *修订日期：
 *文件描述：
 *修改订内容：             
 */
package cn.com.zhanghb.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.zhanghb.SpringBoot.Entity.User;
import cn.com.zhanghb.SpringBoot.Repository.UserRepository;

/**
 * @author zhanghb
 *
 */
@Controller
@RequestMapping(path = "/demo")
public class MainController
{
	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name,
			@RequestParam String email)
	{
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		this.userRepository.save(user);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers()
	{
		return userRepository.findAll();
	}
}
