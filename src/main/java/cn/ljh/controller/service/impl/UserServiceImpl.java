package cn.ljh.controller.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.ljh.controller.mapper.UserMapper;
import cn.ljh.controller.po.User;
import cn.ljh.controller.po.UserCustom;
import cn.ljh.controller.po.UserExample;
import cn.ljh.controller.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public void changePassword(String password, String confirmation) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserCustom login(UserCustom userCustom) {
		// TODO Auto-generated method stub

		UserExample userExample = new UserExample();

		UserExample.Criteria criteria = userExample.createCriteria();

		criteria.andUserNameEqualTo(userCustom.getUserName());
		criteria.andUserPasswordEqualTo(userCustom.getUserPassword());

		List<User> userList = userMapper.selectByExample(userExample);

		UserCustom userCustom2 = null;
		if (userList != null && userList.size() == 1) {
			userCustom2 = new UserCustom();
			BeanUtils.copyProperties(userList.get(0), userCustom2);
		}

		return userCustom2;
	}

	@Override
	public void saveUser(UserCustom userCustom) {
		User user = new User();
		BeanUtils.copyProperties(userCustom, user);
		user.setUserHobbies(StringUtils.collectionToCommaDelimitedString(userCustom.getUserHobbiesList()));

		userMapper.insert(user);

	}

	@Override
	public void updateUser(UserCustom userCustom) {
		User user = new User();
		BeanUtils.copyProperties(userCustom, user);
		user.setUserHobbies(StringUtils.collectionToCommaDelimitedString(userCustom.getUserHobbiesList()));
		userMapper.updateByPrimaryKey(user);

	}

	@Override
	public void deleteUser(UserCustom userCustom) {
		User user = new User();
		BeanUtils.copyProperties(userCustom, user);

		userMapper.deleteByPrimaryKey(user.getUserId());

	}

	@Override
	public UserCustom findUserById(Integer userId) {
		// TODO Auto-generated method stub
		UserCustom userCustom = new UserCustom();
		BeanUtils.copyProperties(userMapper.selectByPrimaryKey(userId), userCustom);
		return userCustom;
	}

	@Override
	public List<UserCustom> findUserList(UserCustom userCustom) {

		UserExample userExample = new UserExample();

		UserExample.Criteria criteria = userExample.createCriteria();

		if (!StringUtils.isEmpty(userCustom.getUserName())) {

			criteria.andUserNameEqualTo(userCustom.getUserName());
		}

		if (!StringUtils.isEmpty(userCustom.getUserMobilephone())) {

			criteria.andUserMobilephoneEqualTo(userCustom.getUserMobilephone());
		}

		List<User> users = userMapper.selectByExample(userExample);

		UserCustom userCustom2 = null;
		List<UserCustom> userCustomsList = new ArrayList<UserCustom>();
		for (User user : users) {
			userCustom2 = new UserCustom();
			BeanUtils.copyProperties(user, userCustom2);

			userCustomsList.add(userCustom2);
		}

		return userCustomsList;
	}

}
