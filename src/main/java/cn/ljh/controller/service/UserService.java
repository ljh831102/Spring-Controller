package cn.ljh.controller.service;

import java.util.List;

import cn.ljh.controller.po.UserCustom;

public interface UserService {

	public UserCustom login(UserCustom userCustom);

	public void saveUser(UserCustom userCustom);

	public void updateUser(UserCustom userCustom);

	public void deleteUser(UserCustom userCustom);

	public UserCustom findUserById(Integer userId);

	public List<UserCustom> findUserList(UserCustom userCustom);

}
