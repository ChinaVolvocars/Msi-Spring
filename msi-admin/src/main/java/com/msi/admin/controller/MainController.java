package com.msi.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
