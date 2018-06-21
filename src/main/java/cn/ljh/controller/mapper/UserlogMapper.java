package cn.ljh.controller.mapper;

import cn.ljh.controller.po.Userlog;
import cn.ljh.controller.po.UserlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlogMapper {
    long countByExample(UserlogExample example);

    int deleteByExample(UserlogExample example);

    int deleteByPrimaryKey(Integer userlogId);

    int insert(Userlog record);

    int insertSelective(Userlog record);

    List<Userlog> selectByExample(UserlogExample example);

    Userlog selectByPrimaryKey(Integer userlogId);

    int updateByExampleSelective(@Param("record") Userlog record, @Param("example") UserlogExample example);

    int updateByExample(@Param("record") Userlog record, @Param("example") UserlogExample example);

    int updateByPrimaryKeySelective(Userlog record);

    int updateByPrimaryKey(Userlog record);
}