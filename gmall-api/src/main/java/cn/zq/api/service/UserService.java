package cn.zq.api.service;

import cn.zq.api.bean.UmsMember;
import cn.zq.api.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
