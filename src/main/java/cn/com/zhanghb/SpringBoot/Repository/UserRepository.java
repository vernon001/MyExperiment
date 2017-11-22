/**                       UserRepository.java
 *作者：
 *创建日期：2017年11月16日
 *修改订者：
 *修订日期：
 *文件描述：
 *修改订内容：             
 */
package cn.com.zhanghb.SpringBoot.Repository;

import org.springframework.data.repository.CrudRepository;

import cn.com.zhanghb.SpringBoot.Entity.User;

/**
 * @author zhanghb
 *
 */
public interface UserRepository extends CrudRepository<User, Long>
{

}
