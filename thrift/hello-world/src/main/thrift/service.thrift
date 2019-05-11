namespace java com.aries.learn.thrift.helloworld.contract.service

include "dto.thrift"

service UserLoginService{
    string ping(),

    i32 add(1:i32 num1, 2:i32 num2),

    bool login(1:dto.UserInfo userInfo),

}