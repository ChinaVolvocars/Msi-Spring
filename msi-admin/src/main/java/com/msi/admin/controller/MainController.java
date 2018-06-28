package com.msi.admin.controller;

import com.msi.admin.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/main")
public class MainController extends BaseController {


//  @Autowired


  @RequestMapping(value = "/login", method = RequestMethod.GET)
  @ResponseBody
  public String login() {
    //


    return "hello world";
  }


  @ApiOperation(value = "添加新用户", notes = "往数据库中添加新用户")
  @ApiImplicitParams({
          @ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType = "String", paramType = "query"),
          @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
          @ApiImplicitParam(name = "fullName", value = "全名", required = true, dataType = "String", paramType = "query"),
          @ApiImplicitParam(name = "email", value = "邮箱号码", required = true, dataType = "String", paramType = "query"),
          @ApiImplicitParam(name = "usertype", allowableValues = "用户类型：1,2,3", required = false, dataType = "int", paramType = "query"),
          @ApiImplicitParam(name = "dateformat", value = "日期格式化", required = false, dataType = "String", paramType = "query"),
          @ApiImplicitParam(name = "timeforamt", value = "时间格式化", required = false, dataType = "String", paramType = "query"),
          @ApiImplicitParam(name = "timezone", value = "时区", required = false, dataType = "String", paramType = "query"),
          @ApiImplicitParam(name = "language", value = "语言", required = false, dataType = "String", paramType = "query")
  })

  @PostMapping(value = "/add", produces = "application/json;charset=UTF-8")
  public @ResponseBody
  User addNewUser(
          @RequestParam String userName,
          @RequestParam String password,
          @RequestParam String fullName,
          @RequestParam String email,
          @RequestParam Integer usertype,
          @RequestParam(value = "dateformat", defaultValue = "yyyy-MM-dd") String dateformat,
          @RequestParam(value = "timeforamt", defaultValue = "HH:mm:ss") String timeforamt,
          @RequestParam(value = "timezone", defaultValue = "GMT+8") String timezone,
          @RequestParam(value = "language", defaultValue = "zh_CN") String language) {

    User user = new User();
    user.setUsername(userName);
    user.setFullname(fullName);
    user.setEmail(email);
    user.setLanguage(language);
    user.setPassword(password);
    user.setActive(1);
    user.setUserType(usertype);
    user.setCan_delete(1);
    user.setTimeZone(timezone);
    user.setTimeFormat(timeforamt);
    user.setDateFormat(dateformat);

    return user;
  }


  @ApiOperation(value = "findByFullName", notes = "find by fullName")
  @ApiImplicitParam(name = "fullname", value = "全名", required = true, dataType = "String", paramType = "path")
  @GetMapping(value = "/findByFullName/{fullname}", produces = "application/json;charset=UTF-8")
  @ResponseBody
  public User getUserByFullName(@PathVariable String fullname) {
    User user = new User();
    return user;
  }

}
