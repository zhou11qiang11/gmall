package cn.zq.user.service.impl;

import cn.zq.api.bean.UmsMember;
import cn.zq.api.bean.UmsMemberReceiveAddress;
import cn.zq.user.mapper.UserAddressesMapper;
import cn.zq.user.mapper.UserMapper;
import cn.zq.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserAddressesMapper userAddressesMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember>  umsMember  =  userMapper.selectAll();
        return umsMember;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        //采用此方式方式
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userAddressesMapper.selectByExample(e);
        return umsMemberReceiveAddress;

        //或用此方式
//        UmsMemberReceiveAddress address = new UmsMemberReceiveAddress();
//        address.setMemberId(memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddress2 = userAddressesMapper.select(address);
//        return umsMemberReceiveAddress2;
    }
}
